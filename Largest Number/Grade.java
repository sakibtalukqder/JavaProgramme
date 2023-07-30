import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner Scanf = new Scanner(System.in);

        System.out.println("Enter Your Score");
        int Score = Scanf.nextInt();

        // double Scoreing = Score / 10;
        String Grade = null;

        switch (Score / 10) {
            case 10:
            case 8:
                Grade = "A+";
                break;
            case 7:
                Grade = "A";
                break;
            case 6:
                Grade = "B";
                break;
            case 5:
                Grade = "C";
                break;
            case 4:
                Grade = "D";
                break;
            default:
                Grade = "F";
                break;

        }

        System.out.println("Grade = " + Grade);

    }
}
