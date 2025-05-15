//3.WAP to check if number falls in range (1-50 , 51-100 ,101-200 ) if not print "out of range"
import java.util.Scanner;

class RangeChecker {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter your number: ");
        int num = sc.nextInt();

        if(num>=1 || num<=50) 
        {
            System.err.println(num + " :The range is 1-50");
        }
        else if(num>= 51 || num<=100)
        {
            System.err.println(num + " :The range is 51-100");
        }
        else if(num>=101 || num<=200)
        {
            System.err.println(num + " :The range is 101-200");
        }
        else
        {
            System.err.println(num + " :Number is out of bound");
        }
    }
}
