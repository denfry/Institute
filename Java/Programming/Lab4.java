package Programming;

import java.util.Scanner;
import static  java.lang.Math.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        System.out.print("Введите точность (e.g., 0.0001): ");
        double accuracy = input.nextDouble();

        double R = ((2*x-1)*pow(x, 3))/6;
        double sum = R;
        double functionValue;

        int k = 1;
        do {
            k++;
            R *= (4*pow(k, 3)*pow(x, 3) - 6*k*k*pow(x, 3) + 2*k*pow(x, 3) - 2*k*k*x*x + 3*k*x*x - x*x)/
                    (4*pow(k, 3)*x - 2*k*k*x - 2*k*x - 2*k*k - k);
            sum += R;
        } while (abs(R/sum) > accuracy && k < 1000);

        if (k == 1000) {
            System.out.println("Нет необходимой точности");
        } else {
             functionValue = log(((pow(1 + x, x + (double) 1 / 2)) /
                    (sqrt(1 - x)))) - (x * x) - x;
            double difference = abs(sum - functionValue);
            System.out.printf("sum = %f\nfunctionValue = %f\ndifference = %f\nk = %d\n", sum, functionValue,
                    difference, k);
        }
    }
}

