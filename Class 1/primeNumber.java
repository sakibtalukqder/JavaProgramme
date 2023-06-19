import java.util.Scanner;

public class primeNumber {
    public static void main(String args[]) {

        // _______Scanner Object_________
        Scanner scanf = new Scanner(System.in);
        {
            int i, m = 0;
            System.out.print("Enter The Value: ");
            int n = scanf.nextInt();
            m = n / 2;
            if (n == 0 || n == 1) {
                System.out.println(n + " is not a prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        System.out.println(n + " is not a prime number");
                        break;
                    } else {
                        System.out.println(n + " is a prime number");
                        break;
                    }
                }
            }
        }
    }
}
