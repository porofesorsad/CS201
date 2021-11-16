/*
A complex number is defined as z=a+i*b, where a is the real part, and b is the imaginary part. 
In other words, in order to define a complex number, we need the two floating numbers a and b.  
Write methods that perform for each of the following operations with complex numbers z1 = a1 + i*b1, 
and z2 = a2 + i*b2:
•	Addition: z1 + z2=(a1+a2) +  i*(b1+b2)
•	Subtraction: z1 - z2=(a1-a2) +  i*(b1-b2)
•	Multiplication: z1*z2 = (a1*a2 – b1*b2) + i*(a1*b2 + b1*a2)
•	Division: z1/z2 = (a1*a2 +b1*b2)/(a2^2 + b2^2) + i*(b1*a2 – a1*b2)/(a2^2 + b2^2) 
Create a test program that asks for the real and imaginary parts of two complex numbers from the user, 
and displays the results of the four operations, writing the formula as shown above, 
and replacing the a1, a2, b1 and b2 with the numbers entered by the user.
 */
import java.util.Scanner;
public class Problem4 
{
 
    static double a = 0;
    static double b = 0;
    static double c = 0;
    static double d = 0;
    static double i = Math.pow(-1,1/2);
    
    public static void main(String[] args) 
    {
 
        Scanner input = new Scanner(System.in);
        System.out.println(" Calculating Complex Numbers ");
        System.out.printf("%15s\n","z = a + (i*b) and z = c + (i*d)");
        System.out.print("Enter a: ");
        a = input.nextFloat();       
        System.out.print("Enter b: ");
        b = input.nextFloat();
        System.out.print("Enter c: ");
        c = input.nextFloat();
        System.out.print("Enter d: ");
        d = input.nextFloat();
 
        addition("Addition: ");
        subtraction("Subtraction: ");
        multiplication("Multiplication: ");
        division("Division: ");
    }
    public static void addition(String name)
    {
        double add = (a + c) + i*(b + d);
        System.out.println(name + add);
    }
    public static void subtraction(String name)
    {
        double subtract = (a - c) + i*(b - d);
        System.out.println(name + subtract);
    }
    public static void multiplication(String name)
    {
        double multiply = ((a * c) - (b * d)) + i*((b * c) + (a * d));
        System.out.println(name + multiply);
    }
    public static void division(String name)
    {
        c *= c;
        d *= d;
        double division = (int)(((a * c) + (b * d)) / (c + d)) + i*((b * c)- 
                          (a * d)) / ((c + d));
        System.out.println(name + division);
    }
}
