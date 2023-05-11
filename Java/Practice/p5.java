package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class p5 {
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

        System.out.println("Половины сумм отрицательных элементов в четных столбцах:");
        boolean hasNegativeElements = false;
        double[] sums = new double[m];
        int count = 0;
        for (int j = 0; j < m; j += 2) {
            double sum = 0;
            hasNegativeElements = false;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < 0) {
                    sum += matrix[i][j];
                    hasNegativeElements = true;
                }
            }
            if (hasNegativeElements) {
                sums[count] = sum / 2;
                count++;
            }
        }
        sums = Arrays.copyOf(sums, count);

        if (!hasNegativeElements) {
            System.out.println("Нет отрицательных элементов ни в одном столбце");
        } else {
            for (double sum : sums) {
                System.out.println(sum);
            }
        }
    }
}