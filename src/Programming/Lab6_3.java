package Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] zn = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the value of element " + i + ": ");
            zn[i] = scanner.nextInt();
        }

        int[] ym = new int[length];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (zn[i] % 2 == 1) {
                ym[count] = zn[i];
                count++;
            }
            sum += zn[i];
        }

        double mean = (double) sum / length;

        ym[count] = (int) Math.round(mean);

        System.out.print("New array Ym: ");

        for (int i = 0; i < count + 1; i++) {
            System.out.print(ym[i] + " ");
        }

        Arrays.sort(zn);

        System.out.print("\nSorted array Zn: ");

        for (int i = 0; i < length; i++) {
            System.out.print(zn[i] + " ");
        }
    }
}


