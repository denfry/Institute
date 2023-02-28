package Programming;

import java.util.Scanner;

public class Lab7_1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of rows in the matrix: ");
            int rows = scanner.nextInt();

            System.out.print("Enter the number of columns in the matrix: ");
            int columns = scanner.nextInt();

            int[][] matrix = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter the element at row " + (i+1) + " column " + (j+1) + ": ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Matrix:");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix[i][j] + "\t");
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

            System.out.println("Columns with maximum integer value:");
            for (int j = 0; j < columns; j++) {
                if (maxIsInteger[j]) {
                    System.out.println("Column " + (j+1) + ": " + maxValues[j]);
                }
            }
        }

        private static boolean isInt(double value) {
            return (value == (int) value);
        }
    }
