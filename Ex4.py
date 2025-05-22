"""
4 du bao thoi tiet ket hop FastAPI
"""

from fastapi import FastAPI
import requests

app = FastAPI()

API_KEY = "c3bfa4a97818cc7233c337997d755638"

@app.get("/weather")
def get_weather(city : str):
    url = f"https://api.openweathermap.org/data/2.5/weather?q={city}&appid={API_KEY}&units=metric&lang=vi"
    response = requests.get(url)

    if response.status_code == 200:
        data = response.json()
        return {
            "City" : data["name"],
            "Temperature": data["main"]["temp"],
            "Description": data["weather"][0]["description"],
            "Humidity" : data["main"]["humidity"],
            "Wind Speed" : data["wind"]["speed"],
        }
    else:
        return {"Error" : "Khong tim thay thanh pho"}