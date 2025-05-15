//1.WAP to check a number is -ve, 0 or +ve

import java.util.Scanner;

class CheckNum {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 0)
        {
            System.err.println(num + " is positive number");
        }
        else if (num == 0)
        {
            System.err.println(num + " is 0");
        }
        else
        {
            System.err.println(num + " is negative");
        }


    }
}
