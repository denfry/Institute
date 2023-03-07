package Programming;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        double y = 1.0/9 + sqrt((pow(a, 2) + b) / (0.4 * a)) -
                (pow(10, 4) * (exp(a*c))) + (cos(sqrt(pow(a, 2) + b))) +
                ((sin(3)) / (5 * (pow(a, 2) + b)));
        double cos = cos(sqrt(a * a + b));
        if (a * 0.4 != 0 && (a * a + b) / (0.4 * a) >= 0 && -1 <= cos && cos <= 1 && (a * a + b) != 0) {
            System.out.println("y = " + y);
        } else {
            System.out.println("Нет решения для данных параметров");
        }
    }
}