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
                    System.out.print("Введите элемент в строке " + (i+1) + " столбце " + (j+1) + ": ");
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            System.out.println("Матрица:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    String fmat = new DecimalFormat("#0.0000").format(matrix[i][j]);
                    System.out.print(fmat + "\t");
                }
                System.out.println();
            }

            int[] maxValues = new int[columns];
            boolean[] maxIsInteger = new boolean[columns];
            for (int j = 0; j < columns; j++) {
                double maxValue = matrix[0][j];
                boolean maxIsInt = isInt(maxValue);
                for (int i = 1; i < rows; i++) {
                    double value = matrix[i][j];
                    if (value > maxValue) {
                        maxValue = value;
                        maxIsInt = isInt(maxValue);
                    } else if (value == maxValue) {
                        maxIsInt &= isInt(value);
                    }
                }
                maxValues[j] = (int) maxValue;
                maxIsInteger[j] = maxIsInt;
            }

            System.out.println("Столбцы с макс. целым значением:");
            for (int j = 0; j < columns; j++) {
                if (maxIsInteger[j]) {
                    System.out.println("Столбец " + (j+1) + ": " + maxValues[j]);
                }
            }
        }

        private static boolean isInt(double value) {
            return (value == (int) value);
        }
    }
