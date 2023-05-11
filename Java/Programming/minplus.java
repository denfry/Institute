package Programming;

import java.util.Scanner;

public class minplus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        int punctuationCount = 0;
        int digitCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isDefined(c) && !Character.isLetter(c) && !Character.isWhitespace(c)) {
                punctuationCount++;
            }
        }

        System.out.println("Количество знаков препинания: " + punctuationCount);
        System.out.println("Количество цифр: " + digitCount);
    }
}
