//NUMBER DIVISIBLE BY 3 

import java.util.Scanner;

class Prog4 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a number to check if it is divisible by 3 or not: ");
        int num = sc.nextInt();

        String res = (num%3 == 0) ? "Num is divisible by 3" : "Num is not divisible by 3";
        System.err.print(res);
    }
}
