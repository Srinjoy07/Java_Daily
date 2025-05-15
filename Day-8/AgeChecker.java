//4.WAP to check if a person is child, teenage or adult
import java.util.Scanner;

class AgeChecker {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter any age: ");
        int age = sc.nextInt();

        if(age<=6)
        {
            System.err.println("The person is a child");
        }
        else if(age>6 && age<13)
        {
            System.err.println("The person is a teenager");
        }
        else if(age>18)
        {
            System.err.println("The person is an adult");
        }
    }
}
