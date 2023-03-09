package Programming;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class Lab5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало интервала: ");
        double start = scanner.nextDouble();

        System.out.print("Введите конец интервала: ");
        double end = scanner.nextDouble();

        System.out.print("Введите число точек (N): ");
        int n = scanner.nextInt();

        System.out.println("Значения функции:");

        double x;
        double y;
        double min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            x = start + (i * (end - start) / (n - 1));
            y = function(x);
            String fx = new DecimalFormat("#0.000").format(x);
            String fy = new DecimalFormat("#0.000").format(y);
            System.out.println(i+ ": " + fx + " -> " + fy);


            if (y < min) {
                min = y;
            }
        }


        System.out.println("Минимум: " + min);
    }

    public static double function(double x) {
        return 0.25 * pow(x, 3) - 2 * x * x - pow(x, -1);
    }
}


