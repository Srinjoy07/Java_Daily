//2.WAP to check a triangle is equilateral, isosceles, scalene

import java.util.Scanner;
class TriangleChecker{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter side 1: ");
        byte side1 = sc.nextByte();

        System.err.print("Enter side 2: ");
        byte side2 = sc.nextByte();

        System.err.print("Enter side 3: ");
        byte side3 = sc.nextByte();

        if(side1==side2 && side2==side3) 
        {
            System.err.println("The triangle is an equilateral triangle");
        }
        else if(side1==side2 || side2==side3 || side3==side1)
        {
            System.err.println("The triangle is isosceles");
        }
        else
        {
            System.err.println("The triangle is scalene");
        }
    }
}
