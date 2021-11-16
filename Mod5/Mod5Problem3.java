//Yasmin Torres Mod 5
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Mod5Problem3
{

	private double numberOfWheels = 4;
	private double weight = 100;
		
		public Mod5Problem3() throws NegativeNumberException
		{
			this(100, 1000);
		}
		
		public Mod5Problem3(int numberOfWheels, int weight) throws NegativeNumberException
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
		
		//Main
		public static void main(String[] args) throws IOException, NegativeNumberException 
		{
		File cyTxt = new File("C:\\Users\\twin_\\Documents\\Cycle.txt"); //Creates File
		if(cyTxt.exists() && !cyTxt.isDirectory())
		{
		System.out.println("File found");
		Scanner scan = new Scanner(cyTxt); //Prints out file
		while (scan.hasNextLine())  //Values were inputted from within the file now, it will just print them
		      System.out.println(scan.nextLine());
		}
	}

}
