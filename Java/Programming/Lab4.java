package Programming;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите x: ");
        double x = input.nextDouble();

        System.out.print("Введите точность (e.g., 0.0001): ");
        double accuracy = input.nextDouble();

        double R = pow(x, 3);
        double sum = R * ((2*x -1)/(2*3));
        double functionValue;
        double x2 = x*x;

        int k = 1;
        do {
            k++;
            R *= x2;
            sum += R *((2*k*x-1)/(2*k*(2*k+1)));
        } while (abs(R * ((2*k*x-1)/(2*k*(2*k+1)))/ sum) > accuracy && k < 1000);

        if (k == 1000) {
            System.out.println("Нет необходимой точности");
        } else {
            functionValue = log(((pow(1 + x, x + (double) 1 / 2)) /
                    (sqrt(1 - x)))) - x2 - x;
            double difference = abs(sum - functionValue);
            System.out.printf("sum = %f\nfunctionValue = %f\ndifference = %f\nk = %d\n", sum, functionValue,
                    difference, k);
        }
    }
}

