N = float(input("N = "))
M = float(input("M = "))
sum = 0
i = 1
while True:
    prod = 1
    j = 0

    while j <= M:
        prod *= (2 * j + M) / i
        j += 1

    sum += (i + 3) / (i + 4) + prod
    i += 1

    if i > N:
        break
y = sum
print("y =", y)
