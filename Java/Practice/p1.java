package Practice;
import java.util.Scanner;

import static java.lang.Math.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        double y;
        y = sin((b + c) / a) + ((pow((b + c), (1.0/3))) / a) + b*b;
        System.out.println("d = " + y);
    }
}
