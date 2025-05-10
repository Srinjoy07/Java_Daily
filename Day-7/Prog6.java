//STUDENT DETAILS
import java.util.Scanner;

class Prog6 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter your name: ");
        String name = sc.nextLine();

        System.err.print("Enter your roll: ");
        int roll = sc.nextInt();

        System.err.print("Enter your gender: ");
        char gender = sc.next().charAt(0);

        System.err.print("Enter your phone number: ");
        long phoneNumber = sc.nextLong();

        System.err.println();
        System.err.print("Hello, my name is: "+ name + ". My roll no. is: " + roll + ". My gender is: " + gender + ". My phone number is: " + phoneNumber + ".");
    }
}
