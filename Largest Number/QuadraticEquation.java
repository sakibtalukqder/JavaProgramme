import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner Scanf = new Scanner(System.in);

        double a, b, c, d, x, x1, x2;

        System.out.print("Enter The Value of a: ");
        a = Scanf.nextDouble();
        System.out.print("Enter The Value of b: ");
        b = Scanf.nextDouble();
        System.out.print("Enter The Value of c: ");
        c = Scanf.nextDouble();

        d = Math.pow(b, 2) - (4.0 * a * c);
        if (d == 0) {
            x = -b / (2 * a);
            System.out.println("The Roots, X=" + x);
        } else if (d > 0) {
            x1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The Rutes are, X1 = " + x1 + " & X2 = " + x2);
        } else {
            System.out.println("Roots are imagenary");
        }
    }
}
