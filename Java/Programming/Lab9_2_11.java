package Programming;

import java.util.Scanner;

public class Lab9_2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива Xm: ");
        int m = scanner.nextInt();
        double[] X = new double[m];

        System.out.println("Введите элементы массива Xm:");
        for (int i = 0; i < m; i++) {
            System.out.print("x(" + i + ") = ");
            X[i] = scanner.nextInt();
        }

        System.out.print("Введите размер массива Yn: ");
        int n = scanner.nextInt();
        double[] Y = new double[n];

        System.out.println("Введите элементы массива Yn:");
        for (int i = 0; i < n; i++) {
            System.out.print("y(" + i + ") = ");
            Y[i] = scanner.nextInt();
        }

        int countXm = 0;
        int countYn = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] % 2 == 0) {
                countXm++;
            }
        }
        for (int i = 0; i < Y.length; i++) {
            if (Y[i] % 2 != 0) {
                countYn++;
            }
        }
        double[] Z = new double[countXm + countYn];

        mergeArrays(X, Y, Z);

        System.out.println("Результат (массив Zk):");
        for (int i = 0; i < Z.length; i++) {
            System.out.print("z(" + i + ") = ");
            System.out.println(Z[i]);
        }
    }

    public static void mergeArrays(double[] X, double[] Y, double[] Z) {
        int Z_Index = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] % 2 == 0) {
                Z[Z_Index] = X[i];
                Z_Index++;
            }
        }

        for (int i = 0; i < Y.length; i++) {
            if (Y[i] % 2 != 0) {
                Z[Z_Index] = Y[i];
                Z_Index++;
            }
        }
    }
}
