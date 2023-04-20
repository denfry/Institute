package Programming;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1 = ");
        double x1 = in.nextDouble();
        System.out.print("x2 = ");
        double x2 = in.nextDouble();
        System.out.print("x3 = ");
        double x3 = in.nextDouble();
        System.out.print("x4 = ");
        double x4 = in.nextDouble();
        System.out.print("x5 = ");
        double x5 = in.nextDouble();

        double min = x1;

        if (x2 + x3 < min) {
            min = x2 + x3;
        }
        if (x4 < min) {
            min = x4;
        }
        if (x5 < min) {
            min = x5;
        }
        double mn = x1;
        if (x2 < x1) {
            mn = x2;
        }

        double max = mn;

        if (x3 > max) {
            max = x3;
        }
        if (x4 + x5 > max) {
            max = x4 + x5;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        if (min * max + 5 == 0 || sqrt(3 * max + 1) < 0 ) {
            System.out.println("Ошибка");
        } else {
            double y = ((3 * min*min) - sqrt(3 * max + 1)) / (min * max + 5);
            System.out.println("y = " + y);
        }
    }
}