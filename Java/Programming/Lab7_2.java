package Programming;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите кол-во строк в матрице: ");
        int n = scanner.nextInt();

        System.out.print("Введите кол-во столбцов в матрице: ");
        int m = scanner.nextInt();


        double[][] matrix = new double[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введите элемент в строке " + (i + 1) + " столбце " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("Матрица:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%6.2f", matrix[i][j]);
            }
            System.out.println();
        }


        double[] sums = new double[n];
        boolean flag = false;
        int count = 0;
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > 0) {
                    sums[count] += matrix[i][j];
                    flag = true;
                }
            }
            count++;
        }


        System.out.println("Суммы положительных элементов в чётных строках:");
        if (flag) {
            count = 0;
            while (count < sums.length) {
                System.out.println(sums[count]);
                count++;
            }
        } else {
            System.out.println("Нет положительных элементов");
        }
    }
}