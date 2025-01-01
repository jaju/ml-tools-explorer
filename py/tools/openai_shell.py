from functools import cache
from openai import OpenAI
from openai.pagination import SyncPage
from openai.types import Model
import json
from textwrap import dedent
from typing import List, Dict, Any

client = OpenAI()

@cache
def get_models() -> SyncPage[Model]:
    return client.models.list()

print(get_models().model_dump_json())
