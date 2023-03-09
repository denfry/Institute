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
                    System.out.print("Введите элемент в строке " + (i) + " столбце " + (j) + ": ");
                    matrix[i][j] = scanner.nextDouble();
                }
            }


            System.out.println("Matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    String fmat = new DecimalFormat("#0.0000").format(matrix[i][j]);
                    System.out.print(fmat + "\t");
                }
                System.out.println();
            }


            double[] sums = new double[n/2];
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] > 0) {
                        sums[i/2] += matrix[i][j];
                    }
                }
            }


            System.out.println("Суммы положительных элементов в чётных строках:");
            for (int i = 0; i < n/2; i++) {
                    System.out.println(sums[i]);
            }
        }
    }
