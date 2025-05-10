//SUM OF TWO

import java.util.Scanner;

class Prog1 {
    public static void main(String[] args)
    {
       @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your first number: ");
       int a = sc.nextInt();

       System.out.print("Enter your second number: ");
       int b = sc.nextInt();

       int result = a + b;
       System.out.print("The result of a + b is : " + result);
    }
}
