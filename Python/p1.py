import math

a = int(input("a = "))
b = int(input("b = "))
c = int(input("c = "))
d = math.sin((b + c) / a) + (((b + c) ** (1 / 3)) / a) + b ** 2
print("d =", d)
