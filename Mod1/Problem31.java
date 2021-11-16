/*
Write a program that prompts the user to enter an amount (e.g., 10000), the annual
percentage yield (e.g., 6.15), and the number of months (e.g., 18) and displays a
table as shown in the sample run.
 */
import java.util.Scanner;
public class Problem31 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial deposit amount: ");
		double num = scan.nextDouble();
		System.out.println("Enter the annual percentage yield: ");
		double per = scan.nextDouble();
		System.out.println("Enter the maturity period (# of months)");
		int month = scan.nextInt();
		
		for(int i = 1; i <= month; i++)
		{
			num += (int)(num*per)/1200;
			System.out.println("Month" + "\tCD Value");
			System.out.println(i + "\t" + num);
		}
	}

}
