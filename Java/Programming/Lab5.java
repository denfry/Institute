package Programming;

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

        System.out.println("    x      ->       y");

        double x;
        double y;
        double min = Double.POSITIVE_INFINITY;
        double temp = 0;

        for (int i = 0; i < n; i++) {
            x = start + (i * (end - start) / (n - 1));
            y = 0.25 * pow(x, 3) - 2 * x * x - pow(x, -1);
            System.out.printf("%-10f ->  %f\n", x, y);


            if (y < min) {
                min = y;
                temp = x;
            }
        }


        System.out.println("Минимум в точке " + temp + ": " + min);
    }
}


