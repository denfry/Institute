package Programming;

import java.util.Scanner;
public class Lab6_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();

            int[] yn = new int[length];

            for (int i = 0; i < length; i++) {
                System.out.print("Enter the value of element " + i + ": ");
                yn[i] = scanner.nextInt();
            }

            int penultimateOdd = 0;

            for (int i = length - 2; i >= 0; i -= 2) {
                if (yn[i] % 2 == 1) {
                    penultimateOdd = yn[i];
                    break;
                }
            }

            System.out.println("Penultimate odd element with an even index: " + penultimateOdd);

            int negativesReplaced = 0;

            for (int i = 0; i < length; i++) {
                if (yn[i] < 0) {
                    yn[i] = 0;
                    negativesReplaced++;

                    if (negativesReplaced == 3) {
                        break;
                    }
                }
            }

            System.out.print("Updated array: ");

            for (int i = 0; i < length; i++) {
                System.out.print(yn[i] + " ");
            }
        }
    }