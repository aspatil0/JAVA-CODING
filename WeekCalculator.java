import java.util.Scanner;

public class WeekCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter date (1-31): ");
        int date = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        int[] monthCodes = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        int monthCode = monthCodes[month - 1];

        int century = year / 100;
        int yearInCentury = year % 100;

        // Century code
        int centuryCode = 0;

        switch (century) {
            case 17: centuryCode = 4; break;
            case 18: centuryCode = 2; break;
            case 19: centuryCode = 0; break;
            case 20: centuryCode = 6; break;
            case 21: centuryCode = 4; break;
            default: centuryCode = 6; break; // default to 2000s
        }

        int leapYearCorrection = yearInCentury / 4;

        int sum = date + monthCode + yearInCentury + leapYearCorrection + centuryCode;

        if ((month == 1 || month == 2) && isLeapYear(year)) {
            sum -= 1;
        }

        int dayOfWeek = sum % 7;

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println("Day of the week is: " + days[dayOfWeek]);
    }

    public static boolean isLeapYear(int y) {
        if (y % 400 == 0) return true;
        if (y % 100 == 0) return false;
        return y % 4 == 0;
    }
}
