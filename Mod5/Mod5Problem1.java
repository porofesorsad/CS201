
//Yasmin Torres Mod 5
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Mod5Problem1
{
//Create a custom exception, use try and catch and place in try an if statement to detect inputs less than 0
	private double numberOfWheels = 4;
	private double weight = 100;
		
		public Mod5Problem1() throws NegativeNumberException
		{
			this(100, 1000);
		}
		
		public Mod5Problem1(int numberOfWheels, int weight) throws NegativeNumberException
		{ 
			try {
				if(numberOfWheels >= 0 && weight >= 0)
					{
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;	
					}
			
				else
				throw new NegativeNumberException("Values cannot be less than or equal to zero");
			}
			finally {
				System.out.println("Attempting to create Cycle..");
			}
		}
		public class NegativeNumberException extends Exception	 
		{
			 
		    public NegativeNumberException(String message) 
		    {
		        super(message);
		    }
		}

}
