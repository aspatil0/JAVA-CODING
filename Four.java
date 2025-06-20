import java.util.Scanner;


class Four{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks= sc.nextInt();
        System.out.println("enter the income");
        int income = sc.nextInt();

        if(marks > 60){
            if(income < 250){
                System.out.println("you are eligible for scholoship");
            }
            else{
            System.out.println("you are not eligible boss");

            }
            

        }
        else{
            System.out.println("your are not eligible");
        }
    }
}