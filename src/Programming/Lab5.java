package Programming;

import java.util.Scanner;
import static java.lang.Math.*;
public class Lab5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the start of the interval: ");
            double start = scanner.nextDouble();

            System.out.print("Enter the end of the interval: ");
            double end = scanner.nextDouble();

            System.out.print("Enter the number of points (N): ");
            int n = scanner.nextInt();

            System.out.println("Function values:");

            double max = Double.NEGATIVE_INFINITY;
            double min = Double.POSITIVE_INFINITY;

            for (int i = 0; i < n; i++) {
                double x = start + (i * (end - start) / (n - 1));
                double y = function(x);
                System.out.println(x + " -> " + y);

                if (y > max) {
                    max = y;
                }

                if (y < min) {
                    min = y;
                }
            }

            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }

        public static double function(double x) {
            // Replace with the desired function
            return 0.25 * pow(x, 3) - 2 * x*x - pow(x, -1);
        }
    }


