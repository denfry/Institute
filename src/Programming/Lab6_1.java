package Programming;

import java.util.Scanner;


public class Lab6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ") = ");
            X[i] = scanner.nextDouble();
        }


        System.out.print("Начальный массив: ");
        printArray(X);


        double sum = 0.0;
        double product = 1.0;

        for (int i = 1; i < n; i++) {
            if (X[i] > 0) {
                sum += i;
                product *= i;
            }
        }

        if (sum > 0 && product > 0) {
            System.out.println("Сумма положительных элементов: " + sum);
            System.out.println("Произведение положительных элементов: " + product);
        } else {
            System.out.println("Нет положительных элементов");
        }

        int temp = 0;
        System.out.print("Отрицательные элементы: ");
        for (int i = 0; i < n; i++) {
            if (X[i] < 0) {
                System.out.print(X[i] + " ");
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Нет отрицательных элементов");
        }
    }

    private static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
