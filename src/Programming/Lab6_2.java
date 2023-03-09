package Programming;

import java.util.Scanner;
public class Lab6_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите длину массива: ");
            int n = scanner.nextInt();

            double[] Y = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("x(" + i + ") = ");
                Y[i] = scanner.nextDouble();
            }

            int secondLast = -1;
            int last = -1;

            for (int i = 0; i < n; i += 2) {
                if (Y[i] % 2 == 1) {
                    secondLast = last;
                    last = i;
                }
            }

            if (secondLast != -1) {
                System.out.println("Предпоследний нечетный элемент с четным индексом равен: Y(" + secondLast + ") = " + Y[secondLast]);
            } else {
                System.out.println("Нет предпоследнего нечетного элемента с четным индексом.");
            }

            int count = 0;
            int temp = 0;

            for (int i = 0; i < n && count < 3; i++) {
                if (Y[i] < 0) {
                    Y[i] = 0;
                    count++;
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.println("Массив не содержит отрицательных элементов.");
            } else if(temp >= 3) {
                System.out.println("Массив с замененными первыми 3 отрицательными элементами: ");
                for (int i = 0; i < n; i++) {
                    System.out.println("Y(" + i + ") = " + Y[i]);
                }
            } else {
                System.out.println("В массиве меньше 3 отрицательных элементов.");
            }
        }
    }