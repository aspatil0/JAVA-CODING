// Question 2
// ● Company & Year: Wipro Elite 2022
// ● Topic: Variables & Data Types
// ● Problem Statement: Create a program to accept marks of 5 subjects and display
// average with two decimal precision.
// ● Approach: Use double, sum and divide, then format output
// ● Hint: Use System.out.printf()
// ● Logic: Type casting + formatted print


import java.util.Scanner;
class Two{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks for perticular subjects ");
        System.out.println("enter the marks for marathi ");
        float mc= sc.nextfloat();
        System.out.println("enter the marks for english");
        float E= s.nextfloat();
        System.out.println("enter the marks for hindi ");
        float H= s.nextfloat();
        System.out.println("enter the marks for Chem ");
        float Chem= s.nextfloat();
        System.out.println("enter the marks for Phy ");
        float Phy= s.nextfloat();

float total = mc+ E+ H + Chem + Phy;
float avg = total /5;
System.out.println("your total is" + total + " and the avegrage is" + avg );
System.out.println("Following is marks \n" + "english :" + E);






    }
}

