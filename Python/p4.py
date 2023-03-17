n = int(input("Введите длину массива: "))
X = [0] * n

for i in range(len(X)):
    X[i] = float(input(f"x({i}) = "))

A = float(input("Введите A: "))

index = -1
for i in range(len(X)):
    if X[i] > A:
        index = i
        break

if index != -1:
    print(f"Первый элемент массива, значение которого больше A x({index}): {X[index]}")
else:
    print("В массиве нет элементов, значение которого больше A")

for i in range(4, len(X), 4):
    X.pop(i)

if len(X) > 0:
    sum_ = 0
    count = 0
    for i in range(0, len(X), 2):
        if i % 2 == 0:
            sum_ += X[i]
            count += 1
    if count > 0:
        mean = sum_ / count
        for i in range(min(n, len(X)) - 1, max(0, len(X) - 3) - 1, -1):
            X[i] = mean

print("Измененный массив: ")
for i in range(len(X)):
    print(f"x({i}) = {X[i]}")
