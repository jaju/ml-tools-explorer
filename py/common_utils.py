import os
import requests
import tqdm
from typing import Tuple
from sympy.logic.boolalg import Boolean


def _file_from_url(url: str):
    file_component = str.split(url, "/")[-1]
    return file_component


def download(url: str, destination: str) -> Tuple[bool, str]:
    if os.path.isdir(destination):
        filename = _file_from_url(url)
        destination = os.path.join(destination, filename)

    if os.path.exists(destination):
        print(f"Destination {destination} already exists. Skipping download.")
        return False, destination

    response = requests.get(url, stream=True)
    total_size = int(response.headers.get("content-length", 0))
    print(f"Total size: {total_size}")
    with tqdm.tqdm(total=total_size, unit="B", unit_scale=True) as progress_bar:
        with open(destination, "wb") as outfile:
            for chunk in response.iter_content(chunk_size=4096):
                if chunk:
                    progress_bar.update(len(chunk))
                    outfile.write(chunk)

    return True, destination
