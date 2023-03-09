package Programming;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = in.nextInt();
        System.out.print("x2 = ");
        int x2 = in.nextInt();
        System.out.print("x3 = ");
        int x3 = in.nextInt();
        System.out.print("x4 = ");
        int x4 = in.nextInt();
        System.out.print("x5 = ");
        int x5 = in.nextInt();

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
        int mn;
        if (x1 < x2) {
            mn = x1;
        } else {
            mn = x2;
        }

        double max = mn;

        if (x3 > max) {
            max = x3;
        }
        if (x4 + x5 > max) {
            max = x4 + x5;
        }

        if (min * max + 5 == 0) {
            System.out.println("Ошибка деления на ноль при этих значениях");
        } else {
            double y = ((3 * pow(min, 2)) - sqrt(3 * max + 1)) / (min * max + 5);
            System.out.println("y = " + y);
        }
    }
}