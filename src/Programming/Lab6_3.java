package Programming;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        if (n < 10) {
            System.out.println("Длина массива должна быть не менее 10");
            return;
        }

        int[] Z = new int[n];
        ArrayList<Integer> Z_new = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("z(" + i + ") = ");
            Z[i] = scanner.nextInt();
        }

        int[] Y = new int[n];
        double sum = 0;
        int m = 0;

        for (int i = 0; i < n; i++) {
            if (Z[i] % 2 == 0) {
                Y[m] = Z[i];
                m++;
            } else {
                Z_new.add(Z[i]);
                sum += Z[i];
            }
        }

        double average = sum / n;

        Y[m] = (int) Math.round(average);

        System.out.println("Новый массив Ym: ");

        for (int i = 0; i < m + 1; i++) {
            System.out.println("y(" + i + ") = " + Y[i]);
        }

        Arrays.sort(new ArrayList[]{Z_new});

        System.out.println("\nОтсортированный массив Z по возрастанию: ");

        for (int i = 0; i < m; i++) {
            System.out.println("z(" + i + ") = " + Z_new.get(i));
        }
    }
}


