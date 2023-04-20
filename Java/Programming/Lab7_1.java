package Programming;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во строк в матрице: ");
        int rows = scanner.nextInt();

        System.out.print("Введите кол-во столбцов в матрице: ");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Введите элемент в строке " + (i + 1) + " столбце " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }


        System.out.println("Матрица:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%6.2f", matrix[i][j]);
            }
            System.out.println();
        }


        System.out.println("Столбцы с макс. целым значением:");
        double max;
        boolean temp = false;
        for (int j = 0; j < columns; j++) {
            max = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            if (max % 1 == 0) {
                System.out.println("Столбец " + (j + 1) + ": " + max);
                temp = true;
            }
        }
        if (!temp) {
            System.out.println("Нет столбцов с макс. целым значением");
        }
    }
}
