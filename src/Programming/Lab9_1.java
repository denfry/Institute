package Programming;

import java.util.Scanner;
public class Lab9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        double[] X = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ") = ");
            X[i] = scanner.nextDouble();
        }

        int sum1 = sumPositive(X);
        System.out.print("Сумма номеров положительных элементов: " + sum1);
    }
    public static int sumPositive(double[] X) {
        int sum = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                sum += i;
            }
        }
        return sum;
    }
}
