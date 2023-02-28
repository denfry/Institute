package Programming;

import java.util.Scanner;
public class Lab7_3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the size of the square matrix: ");
            int n = input.nextInt();

            double[][] matrix = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Enter element (" + (i+1) + "," + (j+1) + "): ");
                    matrix[i][j] = input.nextDouble();
                }
            }

            // Display the original matrix
            System.out.println("Original matrix:");
            displayMatrix(matrix);

            // Replace elements below the secondary diagonal
            int count = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (i % 2 == 1 && j % 2 == 0 && matrix[i][j] < 0) {
                        count++;
                    }
                    matrix[i][j] = (i % 2 == 1 && j % 2 == 0) ? count : matrix[i][j];
                }
            }

            // Display the modified matrix
            System.out.println("Modified matrix:");
            displayMatrix(matrix);
        }

        public static void displayMatrix(double[][] matrix) {
            for (double[] doubles : matrix) {
                for (double aDouble : doubles) {
                    System.out.print(aDouble + "\t");
                }
                System.out.println();
            }
        }
    }
