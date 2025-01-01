from transformers import LlamaTokenizer, LlamaForCausalLM, TextDataset, Trainer, TrainingArguments, DataCollatorForLanguageModeling
import torch
from peft import LoraConfig, PeftModel
import os
import requests
from datasets import load_dataset

model_path = "openlm-research/open_llama_3b_v2"
device_name = "mps"
device = torch.device(device_name)

tokenizer = LlamaTokenizer.from_pretrained(model_path, legacy=True)
base_model = LlamaForCausalLM.from_pretrained(model_path)
#

lora_config = LoraConfig(
        r=64,
        lora_alpha=32,
        lora_dropout=0.05,
        bias="none",
        task_type="CAUSAL_LM",
)

model = PeftModel(base_model, lora_config, adapter_name="Shakespeare")
model.to(device)

file_name = "shakespeare.txt"
url = "https://raw.githubusercontent.com/karpathy/char-rnn/master/data/tinyshakespeare/input.txt"

if not os.path.isfile(file_name):
    data = requests.get(url)
    with open(file_name, "w") as f:
        f.write(data.text)


train_dataset = TextDataset(tokenizer=tokenizer, file_path=file_name, block_size=128)[:256]

training_args = TrainingArguments(
        output_dir="./output",
        overwrite_output_dir=True,
        num_train_epochs=10,
        per_device_train_batch_size=32,
        eval_strategy="no",
)

data_collator = DataCollatorForLanguageModeling(tokenizer=tokenizer, mlm=False)
trainer = Trainer(
        model=model,
        args=training_args,
        data_collator=data_collator,
        train_dataset=train_dataset,
)

def generate_response(prompt_text, model, tokenizer, max_length=30, num_return_sequences=1):
    input_ids = tokenizer(prompt_text, return_tensors="pt").to("mps")
    input_ids = input_ids.to("mps")

    output_sequences = model.generate(
        input_ids=input_ids,
        max_length=max_length,
        num_return_sequences=num_return_sequences,
        no_repeat_ngram_size=2,
    )

    responses = []
    for response_id in output_sequences:
        response = tokenizer.decode(response_id, skip_special_tokens=True)
        responses.append(response)

    return responses

prompt_text = "Uneasy lies the head that wears a crown"

responses = generate_response(prompt_text, model, tokenizer)
for response in responses:
    print(response)

trainer.train()


save_path = "merged_fine_tuned_openllama2_3b_shakespeare"
tokenizer.save_pretrained(save_path)
merged_model = model.merge_and_unload()
merged_model.save_pretrained(save_path)
responses = generate_response(prompt_text, model, tokenizer)
for response in responses:
    print(response)

