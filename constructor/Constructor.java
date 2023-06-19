/**
 * Constructor
 */
public class Constructor {

    public Constructor(int x, int y) {
        int sum = x + y;
        System.out.println("The Summation Of " + x + " & " + y + " = " + sum);
    }

    public static void main(String[] args) {
        // Constructor Object
        Constructor Obj = new Constructor(5, 10);
    }
}
