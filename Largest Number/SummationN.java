import java.util.Scanner;

public class SummationN {
    public static void main(String[] args) {

        Scanner Scanf = new Scanner(System.in);

        int i, N, Sum;

        System.out.print("Enter The Value of N: ");
        N = Scanf.nextInt();
        Sum = 0;

        for (i = 2; i <= N; i++) {
            if (i % 2 == 0) {
                Sum += i;
            }
        }
        System.out.println("The Summation of the Series between 0-" + N + ", is: " + Sum);
    }
}
