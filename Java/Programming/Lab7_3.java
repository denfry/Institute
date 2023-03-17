package Programming;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab7_3 {

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
                String fmat = new DecimalFormat("#0.00").format(X[i][j]);
                System.out.print(fmat + "\t");
            }
            System.out.println();
        }
        int countNegatives = 0;
        for (int i = 0; i < n; i+=2) {
            for (int j = 1; j < n; j+=2) {
                if (X[i][j] < 0) countNegatives++;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j > n - 1 - i; j--) {
                X[i][j] = countNegatives;
            }
        }



        System.out.println("Матрица после замены:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                String fmat = new DecimalFormat("#0.00").format(X[i][j]);
                System.out.print(fmat + "\t");
            }
            System.out.println();
        }
    }

}
