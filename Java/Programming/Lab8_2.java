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


        StringBuilder result = new StringBuilder();
        String[] split = text.split("(?<=\\b|\\s)|(?=\\b|\\s)|(?<=\\p{Punct})|(?=\\p{Punct})");
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (word.length() < maxNumber) {
                if (word.matches("\\p{Punct}")) {
                    if (i < split.length - 1 && !split[i + 1].matches("\\p{Punct}")) {
                        result.append(word);
                    } else {
                        result.append(word);
                    }
                } else {
                    result.append(word);
                    isFound = true;
                }
            }
        }


        String newText = result.toString().trim();
        if (isFound) {
            System.out.println("Новый текст: " + newText);
        } else {
            System.out.println("Таких слов нет в данном тексте.");
        }
    }
}


//.,..еккенкекв,., uqfdiouwe,. dqw. dwqdq.  оролрпорпор.