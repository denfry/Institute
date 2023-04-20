package Practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер квадратной матрицы: ");
        int n = input.nextInt();

        double[][] X = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите элемент в строке " + (i + 1) + " столбце " + (j + 1) + ": ");
                X[i][j] = input.nextDouble();
            }
        }


        System.out.println("Изначальная матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%6.2f", X[i][j]);
            }
            System.out.println();
        }
        double sum = 0;
        boolean valuesReplaced = false;
        for (int i = 1; i < n; i+=2) {
            for (int j = 0; j < n; j++) {
                if (X[i][j] % 1 != 0) {
                    sum += X[i][j];
                    valuesReplaced = true;
                }
            }
        }
        if (valuesReplaced) {
            for (int i = 0; i < n; i++) {
                X[i][n - 1 - i] = sum;
            }
            System.out.println("Матрица после замены:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%6.2f", X[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println("Нет значений, подходящих для замены.");
        }
    }
}