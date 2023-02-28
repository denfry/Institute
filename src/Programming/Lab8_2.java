package Programming;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab8_2 {
    public static void main(String[] args) {
        String str = generateRandomString(100); // Generate a random string of length 10
        char ch = 'a'; // Specify the character to search for
        int lastPosition = findLastPosition(str, ch);
        System.out.println("Random string: " + str);
        System.out.println("Last position of '" + ch + "': " + lastPosition);
    }

    public static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a'); // Generate a random lowercase letter
            sb.append(c);
        }
        return sb.toString();
    }
    public static int findLastPosition(String str, char ch) {
        int lastPosition = -1;
        int currentPosition = 0;

        Pattern pattern = Pattern.compile("\\p{Punct}+|\\s+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            String word = str.substring(currentPosition, matcher.start());
            currentPosition = matcher.end();

            if (word.contains(String.valueOf(ch))) {
                lastPosition = currentPosition - (word.length() - word.lastIndexOf(ch)) - 1;
            }

            if (matcher.group().matches("\\p{Punct}+")) {
                lastPosition = currentPosition - 1;
            }
        }

        String lastWord = str.substring(currentPosition);
        if (lastWord.contains(String.valueOf(ch))) {
            lastPosition = str.length() - (lastWord.length() - lastWord.lastIndexOf(ch)) - 1;
        }

        return lastPosition;
    }
}
