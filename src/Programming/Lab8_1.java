package Programming;

import java.util.Scanner;

public class Lab8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите символ для поиска: ");
        char ch = scanner.next().charAt(0);
        int lastIndex = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) {
                lastIndex = i;
                break;
            }
        }
        if (lastIndex != 0) {
            System.out.println("Последняя позиция символа '" + ch + "' : " + lastIndex);
        } else {
            System.out.println("'" + ch + "' символ не найден в строке.");
        }
    }
}