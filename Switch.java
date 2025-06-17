import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = sc.nextInt();
        String grade;

        // Convert marks to grade bracket
        switch (marks / 10) {
            case 10:
            case 9:
                grade = "A+";
                break;
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
                break;
            case 5:
                grade = "D";
                break;
            case 4:
                grade = "E (Pass)";
                break;
            default:
                grade = "F (Fail)";
                break;
        }

        System.out.println("Your Grade is: " + grade);
    }
}
