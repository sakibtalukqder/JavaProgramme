
// ==============================
// ===== * LargestNumber  * =====
// ==============================

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner Scanf = new Scanner(System.in);

        int a, b, c, lg;

        System.out.print("Enter The First Value: ");
        a = Scanf.nextInt();
        System.out.print("Enter The Second Value: ");
        b = Scanf.nextInt();
        System.out.print("Enter The Third Value: ");
        c = Scanf.nextInt();

        if (a > b && a > c) {
            lg = a;
        }

        else if (b > a && b > c) {
            lg = b;
        }

        else {
            lg = c;
        }

        System.out.println("The Largest number is: " + lg);

    }
}
