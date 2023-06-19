import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = scan.nextInt();

        int i, j, temp = 0;

        j = x / 2;

        if (x == 0 || x == 1) {
            System.out.println("This is not a prime number");
        } else {
            for (i = 2; i <= j; i++) {
                if (x % i == 0) {
                    System.out.println("This is not a prime");
                    break;
                } else {
                    temp += 1;
                }
            }
            if (temp >= 1) {
                System.out.println("This is a prime");
            }

        }

    }
}
