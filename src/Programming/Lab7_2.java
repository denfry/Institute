package Programming;

import java.util.Scanner;
public class Lab7_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read in the dimensions of the matrix
            System.out.print("Enter the number of rows: ");
            int n = scanner.nextInt();

            System.out.print("Enter the number of columns: ");
            int m = scanner.nextInt();

            // Create the matrix
            double[][] matrix = new double[n][m];

            // Read in the elements of the matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("Enter the element at position (" + (i+1) + ", " + (j+1) + "): ");
                    matrix[i][j] = scanner.nextDouble();
                }
            }

            // Display the matrix
            System.out.println("Matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Calculate the sums of positive elements in even rows
            double[] sums = new double[n/2];
            for (int i = 0; i < n; i += 2) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] > 0) {
                        sums[i/2] += matrix[i][j];
                    }
                }
            }

            // Display the sums
            System.out.println("Sums of positive elements in even rows:");
            for (int i = 0; i < n/2; i++) {
                System.out.println(sums[i]);
            }
        }
    }
