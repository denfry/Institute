package Practice;
import static java.lang.Math.*;

public class p1 {
    public static void main(String[] args) {
        double a = 16.0;
        double b = 5.0;
        double c = 3.0;
        double d;
        d = sin((b + c) / a) + ((pow((b + c), (1.0/3))) / a) + b*b;
        System.out.println(d);
    }
}
