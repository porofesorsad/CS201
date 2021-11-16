package Cycle;
//Yasmin Torres Module 3||Mod 4
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Cycle 
{

	private double numberOfWheels = 4;
	private double weight = 100;
	
	public Cycle() throws NegativeNumberException
	{
		this(100, 1000);
	}
	
	public Cycle(int numberOfWheels, int weight) throws NegativeNumberException
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
	
	public String toString()
	{
		return "Weight: " + weight + " Number of wheels: " + numberOfWheels;
	}
	
	public static void main(String[] args) throws IOException, NegativeNumberException 
	{
		//Cycle t1 = new Cycle();
		//Cycle t2 = new Cycle(4, 12);
		//System.out.println(t1);
		//System.out.println(t2);
		File cyTxt = new File("C:\\Users\\twin_\\Documents\\Cycle.txt");
		if(cyTxt.exists() && !cyTxt.isDirectory())
		{
		//FileWriter writer = new FileWriter("Cycle.txt"); //Create file writer
		//writer.write(t1.toString()); //Write to file
		//writer.close(); //Close input
		Scanner scan = new Scanner(cyTxt);
		while (scan.hasNextLine()) 
		      System.out.println(scan.nextLine());
		}
	}

}
