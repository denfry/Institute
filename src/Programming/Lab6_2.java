package Programming;

import java.util.Scanner;
public class Lab6_2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите длину массива: ");
            int n = scanner.nextInt();
            if (n < 10) {
                System.out.println("Длина массива должна быть не менее 10");
                return;
            }

            int[] Y = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("x(" + i + ") = ");
                Y[i] = scanner.nextInt();
            }

            int penultimateIndex = -1;

            for (int i = n - 2; i >= 0; i -= 2) {
                if (Y[i] % 2 == 1) {
                    penultimateIndex = i;
                    break;
                }
            }

            if (penultimateIndex != -1) {
                System.out.println("Предпоследний нечетный элемент с четным индексом равен: Y(" + penultimateIndex + ") = " + Y[penultimateIndex]);
            } else {
                System.out.println("Нет предпоследнего нечетного элемента с четным индексом.");
            }

            int count = 0;

            for (int i = 0; i < n && count < 3; i++) {
                if (Y[i] < 0) {
                    Y[i] = 0;
                    count++;
                }
            }

            System.out.println("Массив после замены первых трех отрицательных элементов нулями:");

            for (int i = 0; i < n; i++) {
                System.out.println("Y(" + i + ") = " + Y[i]);
            }
        }
    }