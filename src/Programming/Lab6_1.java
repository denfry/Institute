package Programming;

import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        double[] xn = new double[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value of element " + i + ": ");
            xn[i] = scanner.nextDouble();
        }

        double positiveSum = 0.0;
        double positiveProduct = 1.0;

        for (double x : xn) {
            if (x > 0) {
                positiveSum += x;
                positiveProduct *= x;
            } else {
                System.out.println("Negative element: " + x);
            }
        }

        System.out.println("Sum of positive elements: " + positiveSum);
        System.out.println("Product of positive elements: " + positiveProduct);
    }
}
