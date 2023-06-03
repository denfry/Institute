package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class p5_11 {
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

        System.out.println("Суммы положительных элементов в нечетных строках:");
        boolean hasPositiveElements;
        double[] sums = new double[n];
        int count = 0;
        for (int i = 1; i < n; i += 2) {
            double sum = 0;
            hasPositiveElements = false;
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > 0) {
                    sum += matrix[i][j];
                    hasPositiveElements = true;
                }
            }
            if (hasPositiveElements) {
                sums[count] = sum;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Нет положительных элементов в нечетных строках матрицы");
        } else {
            sums = Arrays.copyOf(sums, count);
            for (double sum : sums) {
                System.out.println(sum);
            }
        }
    }
}
