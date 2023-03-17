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


            long start = System.currentTimeMillis();
            double[][] matrix = new double[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Введите элемент в строке " + (i+1) + " столбце " + (j+1) + ": ");
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


            double[] sums = new double[n];
            boolean flag = false;
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] > 0) {
                        sums[i] += matrix[i][j];
                        flag = true;
                    }
                }
            }


            System.out.println("Суммы положительных элементов в чётных строках:");
            if (flag) {
                for (int i = 0; i < n; i+=2) {
                    System.out.println(sums[i]);
                }
            } else {
                System.out.println("Нет положительных элементов");
            }
            long end = System.currentTimeMillis();
            System.out.println("Время выполнения: " + (end - start)/1000 + " с");
        }
    }
