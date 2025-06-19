/*Question 1
● Company & Year: TCS NQT 2023
● Topic: Java Syntax, Input/Output
● Problem Statement: Take a user’s name and birth year, and print the current age.
● Approach: Use Scanner for input and subtract from system year.
● Hint: Use java.util.Calendar.getInstance().get(Calendar.YEAR)
● Logic: Simple arithmetic and input/output*/


import java.util.Scanner;
import java.util.Calendar;
class One{
    public static void main (String[] args){
        Scanner inp = new Scanner(System.in);
 System.out.println("Enter the Name");
 String name = inp.nextLine();

 System.out.println("Enter the Birth year");
 int year = inp.nextInt();

 int Curr_year= Calendar.getInstance().get(Calendar.YEAR);

 float age = Curr_year - year;
 System.out.println("MR/Miss." + name + " "+"your age is :" + age);
    }
}
