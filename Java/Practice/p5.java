package Practice;

import java.text.DecimalFormat;
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
                String fmat = new DecimalFormat("#0.00").format(matrix[i][j]);
                System.out.print(fmat + "\t");
            }
            System.out.println();
        }
        double[] sums = new double[m / 2];
        for (int j = 0; j < m; j += 2) {
            double sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] < 0) {
                    sum += matrix[i][j];
                    count++;
                }
            }
            if (count > 0) {
                sums[j / 2] = sum / 2;
            }
        }


        System.out.println("Половины сумм отрицательных элементов в четных столбцах:");
        for (int i = 0; i < m / 2; i++) {
            System.out.println(sums[i]);
        }
    }
}
