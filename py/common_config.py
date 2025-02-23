import os

_DEFAULT_DIR=os.path.abspath(os.getcwd() + "/..")
BASE_DIR=os.getenv("BASE_DIR", _DEFAULT_DIR)
DATA_DIR=os.path.abspath(BASE_DIR + "/data")
print(BASE_DIR)
print(DATA_DIR)

if not os.path.exists(DATA_DIR):
    os.mkdir(DATA_DIR)

def data_path(file_name):
    return os.path.abspath(os.path.join(DATA_DIR, file_name))
