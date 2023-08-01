import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi, r, Area;
        pi = 3.1416;

        System.out.print("Enter The Value of r: ");
        r = input.nextDouble();

        Area = pi * Math.pow(r, 2);
        System.out.println("Area Of the Circle = " + Area + "SQ. Unit");

    }
}
