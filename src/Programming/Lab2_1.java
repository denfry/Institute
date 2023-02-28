package Programming;

import java.util.Scanner;
import static java.lang.Math.*;
public class Lab2_1 {
    public static void main(String[] args){
//        int a = Integer.MAX_VALUE;
//        int b = Integer.MIN_VALUE;
        int mn = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("x1 = ");
        int x1 = in.nextInt();
        System.out.print("x2 = ");
        int x2 = in.nextInt();
        System.out.print("x3 = ");
        int x3 = in.nextInt();
        System.out.print("x4 = ");
        int x4 = in.nextInt();
        System.out.print("x5 = ");
        int x5 = in.nextInt();
//        if (x1 < a){
//            a = x1;
//            if (x2 + x3 < a){
//                a = x2 + x3;
//                if (x4 < a){
//                    a = x4;
//                    if (x5 < a){
//                        a = x5;
//                    }
//                }
//            }
//        }
//        if (x1 < x2){
//            mn = x1;
//        } else {
//            mn = x2;
//        }
//        if (mn > b) {
//            b = mn;
//            if (x3 > b) {
//                b = x3;
//            } else if(x4 + x5 > b){
//                b = x4 + x5;
//            }
//        }
        double min = x1;

        if (x2 + x3 < min){
            min = x2 + x3;
        }
        if (x4 < min){
            min = x4;
        }
        if (x5 < min){
            min = x5;
        }
        if (x1 < x2){
            mn = x1;
        } else {
            mn = x2;
        }

        double max = mn;

        if (x3 > max){
            max = x3;
        }
        if (x4 + x5 > max){
            max = x4 + x5;
        }
        double y = ((3 * pow(min, 2)) - sqrt(3 * max + 1)) / (min * max + 5);
        System.out.println("y = " + y);
    }
}
// 2 sec, 453 ms
// 1 sec, 606 ms