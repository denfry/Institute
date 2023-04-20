package Programming;

import java.util.Scanner;

import static Programming.BubbleSort.bubbleSort;

public class Lab9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        double[] Z = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("z(" + i + ") = ");
            Z[i] = scanner.nextDouble();
        }

        newArray(Z, n);
    }

    public static void newArray(double[] Z, int n) {
        double[] Y = new double[n];
        double[] Z_new = new double[n];
        double sum = 0;
        int m = 0;

        for (int i = 0; i < n; i++) {
            if (Z[i] % 2 == 0) {
                Y[m] = Z[i];
                sum += Z[i];
                m++;
            } else {
                Z_new[i] = Z[i];
            }
        }

        double average = sum / m;

        Y[m] = average;


        System.out.println("Новый массив Ym: ");

        for (int i = 0; i < m + 1; i++) {
            System.out.println("y(" + i + ") = " + Y[i]);
        }
        bubbleSort(Z_new);
        System.out.println("Отсортированный массив Z по возрастанию: ");

        for (int i = 0; i < n; i++) {
            if (Z_new[i] != 0) {
                System.out.println("z(" + i + ") = " + Z_new[i]);
            }
        }
    }


}
