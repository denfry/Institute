package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        System.out.print("Введите A: ");
        double A = scanner.nextDouble();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ") = ");
            X[i] = scanner.nextDouble();
        }


        int index = -1;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > A) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Первый элемент массива, значение которого больше, A x(" + index +
                    "): " + X[index]);
        } else {
            System.out.println("В массиве нет элементов, значение которого больше A");
        }
        int countindex = 0;
        for (int i = 0; i < X.length; i++) {
            if ((i + 1) % 5 != 0) {
                X[countindex] = X[i];
                countindex++;
            }
        }
        X = Arrays.copyOf(X, countindex);


        double sum = 0;
        int count = 0;
        for (int i = 0; i < X.length; i += 2) {
            sum += X[i];
            count++;
        }

        if (count > 0) {
            double mean = sum / count;
            for (int i = X.length - 1; i >= X.length - 3; i--) {
                X[i] = mean;
            }
        }

        System.out.println("Измененный массив: ");
        for (int i = 0; i < X.length; i++) {
            System.out.println("x(" + i + ") = " + X[i]);
        }
    }
}

