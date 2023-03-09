package Programming;

import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args){
        double sum_for, sum_while, sum_do_while;
        double s1 = 0;
        double s2 = 0;
        double prod = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("M = ");
        double M = in.nextDouble();
        System.out.print("L = ");
        double L = in.nextDouble();
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.println("Цикл For");
        for (int j = 2; j <= M; j++){
             s1 = s1 + ((j + 2) / a);
        }
        for (int k = 0; k <= L; k++){
            s2 = (s2 + (k + a*a));
            prod = prod * ((2 * a) / (k + 1));
        }
        sum_for = s1 + 1.2 * prod - s2;
        System.out.println(sum_for);


        System.out.println("Цикл While");
        s1 = 0;
        s2 = 0;
        prod = 1;
        int j = 2, k = 0;
        while (j <= M){
            s1 = s1 + ((j + 2) / a);
            j++;
        }
        while (k <= L){
            s2 = (s2 + (k + a*a));
            prod = prod * ((2 * a) / (k + 1));
            k++;
        }
        sum_while = s1 + 1.2 * prod - s2;
        System.out.println(sum_while);
        System.out.println("Цикл Do While");

        s1 = 0;
        s2 = 0;
        prod = 1;
        do{
            s1 = s1 + ((j + 2) / a);
            j++;
        } while (j <= M);
        do{
            s2 = (s2 + (k + a*a));
            prod = prod * ((2 * a) / (k + 1));
            k++;
        } while (k <= L);
        System.out.println("s1 = " + s1);
        sum_do_while = s1 + 1.2 * prod - s2;
        System.out.println(sum_do_while);

    }
}
