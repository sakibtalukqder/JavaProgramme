public class Fibonacci {
    public static void main(String[] args) {
        int i, x, y, temp;

        x = 0;
        y = 1;

        for (i = 0; i <= 10; i++) {
            System.out.print(x + " ");
            x = x + y;
            temp = x;
            x = y;
            y = temp;

        }

    }
}
