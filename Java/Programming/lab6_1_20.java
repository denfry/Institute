package Programming;

import java.util.Scanner;

public class lab6_1_20 {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        System.out.print("Введите начало отрезка: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец отрезка: ");
        int end = scanner.nextInt();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ") = ");
            X[i] = scanner.nextDouble();
        }

        System.out.println("Значения лежащие в интервале от " + start + " до " + end + ": ");
        for (int i = 0; i <= X.length - 1; i++) {
            if (X[i] >= start && X[i] <= end) {
                System.out.println("x(" + i + ") = " + X[i]);
            }
        }
    }
}
