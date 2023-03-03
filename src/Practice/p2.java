package Practice;


import java.util.Scanner;
import static java.lang.Math.*;



public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        System.out.println("Input b: ");
        System.out.println("Input c: ");
        System.out.println("Input x: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int x = in.nextInt();
        double y;
        if (x == a && x == b && x == c) {
            y = sin(x);
        } else if (x <= a && b <= x && x <= c) {
            y = cos(x);
        } else {
            y = abs(x);
        }
        System.out.println("y = " + y);
    }
}
