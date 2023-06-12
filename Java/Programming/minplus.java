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
/*



1: a=5, b=5, c=5, a1=5, b1=5, c1=5, x=5
y = sin(5) = -0.958924

2: a=10, b=3, c=11, a1=10, b1=3, c1=11, x=-4
y = cos(5) = 0.283662

3: a=10, b=12, c=9, a1=10, b1=12, c1=9, x=-4
y = abs(-4) = 4
 */
