import math

n = int(input("Введите кол-во строк в матрице: "))
m = int(input("Введите кол-во столбцов в матрице: "))

matrix = []
for i in range(n):
    row = []
    for j in range(m):
        element = float(input(f"Введите элемент в строке {i+1} столбце {j+1}: "))
        row.append(element)
    matrix.append(row)

print("Матрица:")
for row in matrix:
    for element in row:
        print("{:.2f}".format(element), end="\t")
    print()

sums = []
for j in range(0, m, 2):
    sum = 0
    count = 0
    for i in range(n):
        if matrix[i][j] < 0:
            sum += matrix[i][j]
            count += 1
    if count > 0:
        sums.append(sum / 2)

print("Половины сумм отрицательных элементов в четных столбцах:")
for s in sums:
    print("{:.2f}".format(s))
