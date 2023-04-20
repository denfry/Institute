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
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();


        double sum = 0.0;
        double product = 1.0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if (X[i] > 0) {
                sum += i;
                product *= i;
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Нет положительных элементов");
        } else {
            System.out.println("Сумма номеров положительных элементов: " + sum);
            System.out.println("Произведение номеров положительных элементов: " + product);
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
}
