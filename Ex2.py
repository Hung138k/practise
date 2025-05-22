"""
Ex2 phương trình bậc 2
"""
from math import sqrt

print("phương trình bậc 2: ax^2 + bx + c = 0")

print("a = ")
a = float(input())

print("b = ")
b = float(input())

print("c = ")
c = float(input())

if a == 0:
    if b == 0:
        if c == 0:
            print("Phuong trinh vo so nghiem")
        else:
            print("Phuong trinh vo nghiem")
    else:
        if c == 0:
            print("Phuong trinh co 1 nghiem x = 0")
        else:
            print("Phuong trinh co 1 nghiem x = " + str(-c / b))
else:
    delta = b ** 2 - 4 * a * c
    if delta < 0:
        print("Phuong trinh vo nghiem")
    elif delta == 0:
        print("Phuong trinh co 1 nghiem x = " + str(-b / (2 * a)))
    else:
        print("Phuong trinh co 2 nghiem phan biet")
        print("x1 = ", float((-b - sqrt(delta)) / (2 * a)))
        print("x2 = ", float((-b + sqrt(delta)) / (2 * a)))

