package Programming;

import java.util.Scanner;

public class Lab8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        System.out.print("Введите макс. число символов в слове: ");
        int maxNumber = scanner.nextInt();
        boolean isFound = false;


        String result = "";
        String[] split = text.split("[,.\\s]+");
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (word.length() < maxNumber) {
                result += word + " ";
                isFound = true;
            }
        }

        String newText = result.trim();
        if (newText.endsWith(".")) {
            newText = newText.substring(0, newText.length() - 1);
        }
        if (isFound) {
            System.out.println("Новый текст: " + newText);
        } else {
            System.out.println("Таких слов нет в данном тексте.");
        }
    }
}
