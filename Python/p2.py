import math
a = float(input("a = "))
b = float(input("b = "))
c = float(input("c = "))
x = float(input("x = "))
if x == a and x == b and x == c:
    y = math.sin(x)
elif x <= a and b <= x <= c:
    y = math.cos(x)
else:
    y = abs(x)
print("y =", y)
