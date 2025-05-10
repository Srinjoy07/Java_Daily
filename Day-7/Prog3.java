//ODD OR EVEN

import java.util.Scanner;

class Prog3 {
    public static void main(String[ ] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a number to check odd or even: ");
        int num = sc.nextInt();

        String res = (num%2 == 0) ? "Num is even" : "Num is odd";
        System.err.print(res);
    }
}
