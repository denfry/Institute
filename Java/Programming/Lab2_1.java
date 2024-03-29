package Programming;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        double a = in.nextDouble();
        double y;
        if ((a == 1) || (5 <= a && 10 >= a)) {
            y = exp(a) / a;
        } else if ((-15 <= a && -4 >= a) || (a == 24) || (a >= 50)) {
            y = 2 * a + sqrt(a);
        } else if (a < -20 || a == 40 || a == 54) {
            y = a - 3;
        } else {
            y = cos(2 * a);
        }
        System.out.println("y = " + y);

        double y1 = 0;
        switch ((a == 1) || (5 <= a && 10 >= a) ? 1 : 0) {
            case 1 -> y1 = exp(a) / a;
            case 0 -> {
                switch ((-15 <= a && -4 >= a) || (a == 24) || (a >= 50) ? 1 : 0) {
                    case 1 -> y1 = 2 * a + sqrt(a);
                    case 0 -> {
                        switch ((a < -20) || (a == 40 || a == 54) ? 1 : 0) {
                            case 1 -> y1 = a - 3;
                            default -> y1 = cos(2 * a);
                        }
                    }
                }
            }
        }
        System.out.println("y1 = " + y1);
    }
}

