import java.util.Scanner;

public class CountManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of boys: ");
        int boysCount = scanner.nextInt();

        System.out.print("Enter the number of girls: ");
        int girlsCount = scanner.nextInt();

        int total = boysCount + girlsCount;
        System.out.println("Total   students: " + total);

        if (boysCount > girlsCount) {
            System.out.println("There are more boys than girls.");
        } else if (girlsCount > boysCount) {
            System.out.println("There are more girls than boys.");
        } else {
            System.out.println("The number of boys and girls is equal.");
        }

    

        scanner.close();
    }
}
