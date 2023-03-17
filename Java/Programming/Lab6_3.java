package Programming;

import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        double[] Z = new double[n];
        double[] Y = new double[n];
        double sum = 0;
        int m = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("z(" + i + ") = ");
            Z[i] = scanner.nextDouble();
        }


        for (int i = 0; i < n; i++) {
            if (Z[i] % 2 == 0) {
                Y[m] = Z[i];
                m++;
            } else {
                sum += Z[i];
            }
        }

        double average = sum / (n - m);

        Y[m] = average;

        System.out.println("Новый массив Ym: ");

        for (int i = 0; i < m + 1; i++) {
            System.out.println("y(" + i + ") = " + Y[i]);
        }


        bubbleSort(Z);
        System.out.println("Отсортированный массив Z по возрастанию: ");

        for (int i = 0; i < n; i++) {
            if (Z[i] != 0) {
            System.out.println("z(" + i + ") = " + Z[i]);
            }
        }


    }

    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}


