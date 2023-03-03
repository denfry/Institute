package Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab9_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int m = 0;
        int[] Z = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("z(" + i + ") = ");
            Z[i] = scanner.nextInt();
        }


        newArray(Z);
    }
    public static void newArray(int[] Z) {
        int n = Z.length;
        int[] Y = new int[n];
        ArrayList<Integer> Z_new = new ArrayList<>();
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

        Arrays.sort(new ArrayList[]{Z_new});

        System.out.println("Новый массив Ym: ");

        for (int i = 0; i < m + 1; i++) {
            System.out.println("y(" + i + ") = " + Y[i]);
        }

        System.out.println("\nОтсортированный массив Z по возрастанию: ");

        for (int i = 0; i < m; i++) {
            System.out.println("z(" + i + ") = " + Z_new.get(i));
        }
    }
}
