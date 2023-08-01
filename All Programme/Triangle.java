import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        double base, height, Area;

        System.out.print("Enter The Base: ");
        base = Scan.nextDouble();
        System.out.print("Enter The Height: ");
        height = Scan.nextDouble();

        Area = (base * height) / 2;
        System.out.println("The Area of the Triangle: " + Area + " SQ.Unit");

    }
}