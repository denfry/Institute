package Programming;

import java.util.Scanner;
public class Lab4 {


    public static class RecurrentSum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the accuracy (e.g. 0.0001): ");
            double accuracy = scanner.nextDouble();

            double sum = 0.0;
            double x = 1.0;
            int step = 0;

            double prevSum = 0.0;
            do {
                prevSum = sum;
                sum += 1.0 / (x * (x + 1.0));
                x++;
                step++;
            } while (Math.abs(sum - prevSum) >= accuracy);

            double functionValue = 1.0 - (1.0 / x);
            double difference = Math.abs(sum - functionValue);

            System.out.println("Sum: " + sum);
            System.out.println("Function value: " + functionValue);
            System.out.println("Difference: " + difference);
            System.out.println("Steps: " + step);
        }
    }

}
