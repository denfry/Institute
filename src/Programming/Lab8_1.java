package Programming;

import java.util.Random;

public class Lab8_1 {

    public static void main(String[] args) {
        String str = generateRandomString(100); // generate a random string of length 10
        char ch = '2'; // specify the character to search for

        System.out.println("Random string: " + str);

        int lastIndex = str.lastIndexOf(ch);
        if (lastIndex != -1) {
            System.out.println("Last position of '" + ch + "' is: " + lastIndex);
        } else {
            System.out.println("'" + ch + "' not found in the string.");
        }
    }

    // method to generate a random string of a given length
    public static String generateRandomString(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random rand = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }

        return sb.toString();
    }
}
