import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get name input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Remove leading/trailing spaces and count characters
        int charCount = name.trim().length();

        System.out.println("Number of characters: " + charCount);

        if (charCount % 2 == 0) {
            System.out.println("Result: God");
        } else {
            System.out.println("Result: Devil");
        }

        scanner.close();
    }
}
