//CHECK A CHARACTER IS UPPERCASE OR LOWERCASE

import java.util.Scanner;

class Prog5 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter your character: ");
        char character = sc.next().charAt(0);

        String res = (character >= 'A' && character <='Z') ? character + " is an uppercase letter" :  (character >= 'a' && character <= 'z') ? character + " is a lowercase letter" : character + "is not an alphabetic character";
        System.err.print(res);
    }
}
