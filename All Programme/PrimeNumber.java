// import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Scanner Scanf = new Scanner(System.in);
        System.out.println(
                " ============================ \n Prime Numbers Between 1-100 \n ============================ ");

        int i, j;
        // int range = 100;

        for (i = 2; i <= 100; i++) {
            for (j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j > (i / j)) {
                System.out.print(i + " ");

            }
        }
    }

}
