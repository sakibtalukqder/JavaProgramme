import java.util.Scanner;

class Circle{
  public static void main(String[]args){
    // Scanner Object
    Scanner Scanf = new Scanner(System.in);

    final double pi=3.1416;

    System.out.print("Enter The value of r : ");
    // Scan Next Line
    double r= Scanf.nextDouble();
    double area = pi*r*r;
    System.out.println("The Area of the Circle = "+ area +" Sq. Unit");

  }

}

