n = int(input("Введите размер квадратной матрицы: "))

X = [[0 for j in range(n)] for i in range(n)]
for i in range(n):
    for j in range(n):
        X[i][j] = float(input(f"Введите элемент в строке {i + 1} столбце {j + 1}: "))

print("Изначальная матрица:")
for i in range(n):
    for j in range(n):
        fmat = "{:.2f}".format(X[i][j])
        print(fmat, end="\t")
    print()

sum = 0
for i in range(n):
    for j in range(n):
        if i % 2 == 1 and X[i][j] % 1 != 0:
            sum += X[i][j]

for i in range(n):
    X[i][n - 1 - i] = sum

print("Матрица после замены:")
for i in range(n):
    for j in range(n):
        fmat = "{:.2f}".format(X[i][j])
        print(fmat, end="\t")
    print()
