package Practice;


import java.util.Scanner;
import static java.lang.Math.*;



public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        System.out.print("Input c: ");
        int c = in.nextInt();
        System.out.print("Input x: ");
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
