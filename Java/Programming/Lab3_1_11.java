package Programming;

import java.util.Scanner;

public class Lab3_1_11 {
    public static void main(String[] args) {
        double sum_for, sum_while, sum_do_while;
        double sum = 0;
        double prod2 = 1;
        double prod1 = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("M = ");
        int M = in.nextInt();
        System.out.print("L = ");
        int L = in.nextInt();
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.println("Цикл For");
        for (int k = 1; k <= M; k++) {
            prod1 = prod1 * (k + a);
        }
        for (int j = 2; j <= L; j++) {
            prod2 = prod2 * ((double) (L - j) / 2);
            sum += (((double) j / 2 - a));
        }
        sum_for = prod2 - prod1 + sum;
        System.out.println(sum_for);


//        System.out.println("Цикл While");
//        s1 = 0;
//        s2 = 0;
//        prod = 1;
//        int j = 2, k = 0;
//        while (j <= M) {
//            s1 = s1 + ((j + 2) / a);
//            j++;
//        }
//        while (k <= L) {
//            s2 = (s2 + (k + a * a));
//            prod = prod * ((2 * a) / (k + 1));
//            k++;
//        }
//        sum_while = s1 + 1.2 * prod - s2;
//        System.out.println(sum_while);
//        System.out.println("Цикл Do While");
//
//        s1 = 0;
//        s2 = 0;
//        prod = 1;
//        j = 2;
//        k = 0;
//        do {
//            s1 = s1 + ((j + 2) / a);
//            j++;
//        } while (j <= M);
//        do {
//            s2 = (s2 + (k + a * a));
//            prod = prod * ((2 * a) / (k + 1));
//            k++;
//        } while (k <= L);
//        sum_do_while = s1 + 1.2 * prod - s2;
//        System.out.println(sum_do_while);

    }
}
