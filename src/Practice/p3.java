package Practice;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N = ");
        int N = scanner.nextInt();
        System.out.print("M = ");
        int M = scanner.nextInt();
        double sum = 0;
        double prod;
        for (int i = 1; i <= N; i++) {
            prod = 1.0;
            for (int j = 0; j <= M; j++) {
                prod *= (double) (2 * j + M) / i;
            }
            sum += (double) (i + 3) / (i + 4) + prod;
        }

        System.out.println("y = " + sum);

    }
}
