package Practice;


import java.util.Scanner;

import static java.lang.Math.*;


public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        System.out.print("Введите b: ");
        double b = in.nextDouble();
        System.out.print("Введите c: ");
        double c = in.nextDouble();
        System.out.print("Введите a1: ");
        double a1 = in.nextDouble();
        System.out.print("Введите b1: ");
        double b1 = in.nextDouble();
        System.out.print("Введите c1: ");
        double c1 = in.nextDouble();
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        double y;
        if (x == a1 && x == b1 && x == c1) {
            y = sin(x);
        } else if (x <= a && b <= x && x <= c) {
            y = cos(x);
        } else {
            y = abs(x);
        }
        System.out.println("y = " + y);
    }
}
