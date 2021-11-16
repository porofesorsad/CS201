import java.util.Scanner;
public class Problem2 
{	
	static Scanner scan = new Scanner(System.in);
	public static void changeOut(double change)
	{
	    int quarters = 0;
	    int dimes = 0;
	    int nickels = 0;
	    change *= 100;
	    while (change >= 25)
	    {
	        quarters += 1;
	        change = change - 25;
	    }
	    while (change >= 10)
	    {
	        dimes = dimes + 1;
	        change = change - 10;
	    }	
	    while (change >= 5)
	    {
	        nickels = nickels + 1;
	        change = change - 5;
	    }
    System.out.println("Here's your change: " +  quarters + " quarters, " + 
	     dimes + " dimes, " + nickels + " nickels " + change + " pennies");
	}
	public static void main(String[] args) 
	{
		String[] items = {"Chips", "Water", "Chocolate", "Soda", "Gum"};
		double[] price = {1.25, 2.00, 1.00, 2.50, 1.00};
		int input = 1;
		while(input != 0)
		{
			for(String x: items)
				System.out.println(x);
			System.out.println("What item would you like to get? Enter 0 to cancel at anytime" + 
				"\n" + "Please input the number correspondant to the item that you'd like");
			input = scan.nextInt();
			if(input == 0)
			{
				System.out.println("Okay thank you!");
				System.exit(0);
			}
			double total = price[input-1];
			System.out.println("Your total will be $" + total);
			changeOut(total);
		}

	}

}