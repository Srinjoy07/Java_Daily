//ELIGIBLE FOR VOTE OR NOT

import java.util.Scanner;

class Prog2 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.err.print("Enter your age: ");
        int age = sc.nextInt();

        String str = age>=18 ? "Eligible for vote" : "Not eligible for vote" ;
        System.err.println(str);
    }
}
