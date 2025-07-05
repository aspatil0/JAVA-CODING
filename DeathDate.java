import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DeathDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Date of Birth (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            LocalDate dob = LocalDate.parse(inputDate, formatter);

            LocalDate estimatedDeathDate = dob.plusYears(75);

            System.out.println("Your estimated death date (based on average lifespan) is: " + estimatedDeathDate);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format! Please enter in yyyy-MM-dd format.");
        }

        scanner.close();
    }
}
