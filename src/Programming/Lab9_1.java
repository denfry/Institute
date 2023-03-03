package Programming;

import java.util.Scanner;
public class Lab9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x(" + i + ") = ");
            array[i] = scanner.nextInt();
        }

        int sum1 = sumPositive(array);
        System.out.print("Сумма номеров положительных элементов: " + sum1);
    }
    public static int sumPositive(int[] X) {
        int sum = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                sum += i;
            }
        }
        return sum;
    }
}
