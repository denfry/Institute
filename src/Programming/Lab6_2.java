package Programming;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        double[] Y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Y(" + i + ") = ");
            Y[i] = scanner.nextDouble();
        }

        int penultimate = -1;
        int temp = 0;

        int m;
        if (n % 2 == 1) {
            m = n - 3;
        } else {
            m = n - 4;
        }
        for (int i = m; i >= 0; i -= 2) {
            if (Y[i] % 2 == 1) {
                penultimate = i;
                temp++;
            }
            if (temp == 1) {
                break;
            }
        }

        if (penultimate != -1) {
            System.out.println("Предпоследний нечетный элемент с четным индексом равен: Y(" +
                    penultimate + ") = " + Y[penultimate]);
        } else {
            System.out.println("Нет предпоследнего нечетного элемента с четным индексом.");
        }

        int count = 0;

        for (int i = 0; i < n && count < 3; i++) {
            if (Y[i] < 0) {
                Y[i] = 0;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Массив не содержит отрицательных элементов.");
        } else if (count >= 3) {
            System.out.println("Массив с замененными первыми 3 отрицательными элементами: ");
            for (int i = 0; i < n; i++) {
                System.out.println("Y(" + i + ") = " + Y[i]);
            }
        } else {
            System.out.println("В массиве меньше 3 отрицательных элементов.");
        }
    }
}