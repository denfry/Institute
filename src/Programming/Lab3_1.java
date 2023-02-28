package Programming;

import java.util.Scanner;
import static java.lang.Math.*;

public class Lab3_1 {
    public static void main(String[] args){
        double sf, sw, sd;
        int s1 = 0;
        int s2 = 0;
        int p = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("M = ");
        int M = in.nextInt();
        System.out.print("L = ");
        int L = in.nextInt();
        System.out.print("a = ");
        int a = in.nextInt();
        System.out.println("For");
        for (int j = 2; j <= M; j++){
             s1 = s1 + ((j + 2) / a);
        }
        for (int k = 0; k <= L; k++){
            s2 = (int) (s2 + (k + pow(a, 2)));
            p = p * ((2 * a) / (k + 1));
        }
        sf = s1 + 1.2 * p - s2;
        System.out.println(sf);


        System.out.println("While");
        s1 = 0;
        s2 = 0;
        p = 1;
        int j = 2, k = 0, i = 0;
        while (j <= M){
            s1 = s1 + ((j + 2) / a);
            j++;
        }
        while (k <= L){
            s2 = (int) (s2 + (k + pow(a, 2)));
            p = p * ((2 * a) / (k + 1));
            k++;
        }
        sw = s1 + 1.2 * p - s2;
        System.out.println(sw);
        System.out.println("Do While");

        s1 = 0;
        s2 = 0;
        p = 1;
        do{
            s1 = s1 + ((j + 2) / a);
            j++;
        } while (j <= M);
        do{
            s2 = (int) (s2 + (k + pow(a, 2)));
            p = p * ((2 * a) / (k + 1));
            k++;
        } while (k <= L);
        sd = s1 + 1.2 * p - s2;
        System.out.println(sd);

    }
}
