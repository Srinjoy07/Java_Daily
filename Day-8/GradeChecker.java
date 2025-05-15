/*5.WAP to check student's grade---- 
 * 
 * Excellent --> 100
 * A+ ---------> 90-99
 * A ----------> 80-89
 * B+ ---------> 70-79
 * B ----------> 60-69
 * C ----------> 50-59
 * D ----------> 40-49
 * Fail, Give re exam --> less than 40
*/

import java.util.Scanner;

class GradeChecker {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a grade to check: ");
        int marks = sc.nextInt();

        if(marks == 100)
        {
            System.err.println("Excellent grade.");
        }
        else if(marks>=90 && marks<=99)
        {
            System.err.println("A+ grade");
        }
        else if(marks>= 80 && marks<= 89)
        {
            System.err.println("A grade");
        }
        else if(marks>= 70 && marks<= 79)
        {
            System.err.println("B+ grade");
        }
        else if(marks>= 60 && marks<= 69)
        {
            System.err.println("B grade");
        }
        else if(marks>= 50 && marks<= 59)
        {
            System.err.println("C grade");
        }
        else if(marks>= 40 && marks<= 49)
        {
            System.err.println("D grade");
        }
        else 
        {
            System.err.println("You failed. Give re-exam");
        }
    }
}
