package Programming;

import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("N = ");
        int N = in.nextInt();
        System.out.print("M = ");
        int M = in.nextInt();
        System.out.print("b = ");
        double b = in.nextDouble();


        double p = 1, s;
        for (int i = 1; i <= N; i++) {
            s = 0;
            for (int k = 1; k <= M; k++) {
                s = s + (i / k + b);
            }
            p = p * (i + s);
        }
        double y = p;
        System.out.println("y = " + y);
    }
}
