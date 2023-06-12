package Programming;
import java.util.Scanner;

public class Lab8_2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        System.out.print("Введите номер слова, для которого нужно определить количество букв: ");
        int k = scanner.nextInt();

        System.out.print("Введите номер слова, которое нужно вывести: ");
        int m = scanner.nextInt();

        String[] words = text.split(" ");

        if (k <= words.length) {
            String kthWord = words[k - 1];
            int kthWordLength = kthWord.length();
            System.out.println("Количество букв в " + k + "-ом слове: " + kthWordLength);
        } else {
            System.out.println("Текст содержит меньше слов, чем " + k);
        }

        if (m <= words.length) {
            String mthWord = words[m - 1];
            System.out.println(m + "-ое слово: " + mthWord);
        } else {
            System.out.println("Текст содержит меньше слов, чем " + m);
        }
    }
}
