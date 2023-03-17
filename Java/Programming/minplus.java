package Programming;

public class minplus {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int y = 0;
        y += -1000000;
        System.out.println("y = " + y);
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (end - start) + " мс");
    }
}
/*
    13  12 12 12
    11
    12



    14
    13
    15


    21
    42
    12
    12
    12
 */