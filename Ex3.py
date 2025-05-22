"""
3 dự báo thời tiết
"""

import requests

def get_weather(city_name, api_key):
    url = f"http://api.openweathermap.org/data/2.5/weather?q={city_name}&appid={api_key}&units=metric&lang=vi"

    response = requests.get(url)
    data = response.json()

    if response.status_code == 200:
        weather = data["weather"][0]["description"]
        temperature = data["main"]["temp"]
        humidity = data["main"]["humidity"]
        wind_speed = data["wind"]["speed"]

        print(f" - thoi tiet o {city_name}: ")
        print(f" - Trang thai: {weather}")
        print(f" - Nhiet do: {temperature} oC")
        print(f" - Do am: {humidity}%")
        print(f" - Toc do gio: {wind_speed} m/s")
    else:
        print("Khong tim thay thanh pho hoac loi API")

print("City: ")
city = str(input())

print("Api_key: ")
key = str(input())

get_weather(city,key)
