import tempfile
import os
from os import listdir
from pathlib import Path

from common_config import data_path
from common_utils import download

# Source: http://qwone.com/~jason/20Newsgroups/
# dataset url to use
dataset_url = "http://qwone.com/~jason/20Newsgroups/20news-bydate.tar.gz"

def read_file(p):
    return Path(p).read_text(encoding="utf-8", errors="replace")

def _empty_string(s: str):
    return s.strip() == ""

def read_news_file(p):
    try:
        text = read_file(p)
        m = text.rfind('\r\n\r\n')
        if m >= 0:
            return text[m+4:]
        m = text.find('\n\n')
        if m >= 0:
            return text[m+2:]
        return text
    except Exception as e:
        print(f"Exception: {e} on file {p}")

def extract_to(destination_dir: str, tar_gz_file: str):
    import tarfile
    tar = tarfile.open(tar_gz_file, mode="r:gz")
    tar.extractall(destination_dir, filter=lambda tarInfo, x: tarInfo)

def _main():
    # Download the file
    download_file_name = "20news-bydate.tar.gz"
    train_data_dir = "20news-bydate-train"
    _, archive_file_path = download(dataset_url, data_path(download_file_name))
    with tempfile.TemporaryDirectory() as working_directory:
        extract_to(working_directory, archive_file_path)
        for class_name in listdir(os.path.join(working_directory, train_data_dir)):
            count = 0
            for f in listdir(os.path.join(working_directory, train_data_dir, class_name)):
                count += 1
                content = read_news_file(os.path.join(working_directory, train_data_dir, class_name, f))
                if count == 1:
                    print(f"Content: {content}")
            print(f"Class: {class_name}. Number of files: {count}")

_main()
