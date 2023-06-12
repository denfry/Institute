package Programming;
import java.util.Scanner;

public class Lab9_2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива Xm: ");
        int m = scanner.nextInt();
        double[] Xm = new double[m];

        System.out.println("Введите элементы массива Xm:");
        for (int i = 0; i < m; i++) {
            System.out.print("x(" + i + ") = ");
            Xm[i] = scanner.nextInt();
        }

        System.out.print("Введите размер массива Yn:");
        int n = scanner.nextInt();
        double[] Yn = new double[n];

        System.out.println("Введите элементы массива Yn:");
        for (int i = 0; i < n; i++) {
            System.out.print("y(" + i + ") = ");
            Yn[i] = scanner.nextInt();
        }

        double[] Zk = mergeArrays(Xm, Yn);

        System.out.println("Результат (массив Zk):");
        for (int i = 0; i < Zk.length; i++) {
            System.out.print("z(" + i + ") = ");
            System.out.println(Zk[i]);
        }
    }

    public static double[] mergeArrays(double[] Xm, double[] Yn) {
        int countXm = 0;
        int countYn = 0;
        for (int i = 0; i < Xm.length; i++) {
            if (Xm[i] % 2 == 0) {
                countXm++;
            }
        }
        for (int i = 0; i < Yn.length; i++) {
            if (Yn[i] % 2 != 0) {
                countYn++;
            }
        }
        double[] Zk = new double[countXm + countYn];

        int zkIndex = 0;

        for (int i = 0; i < Xm.length; i++) {
            if (Xm[i] % 2 == 0) {
                Zk[zkIndex] = Xm[i];
                zkIndex++;
            }
        }

        for (int i = 0; i < Yn.length; i++) {
            if (Yn[i] % 2 != 0) {
                Zk[zkIndex] = Yn[i];
                zkIndex++;
            }
        }


        return Zk;
    }
}
