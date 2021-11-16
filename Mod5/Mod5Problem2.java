
//Yasmin Torres Mod 5
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Mod5Problem2
{
//For the file area, create a file first, then for writing into it, use the filewriter class and then use a scan to print(remember to close input)
	private double numberOfWheels = 4;
	private double weight = 100;
		
		public Mod5Problem2() throws NegativeNumberException
		{
			this(100, 1000);
		}
		
		public Mod5Problem2(int numberOfWheels, int weight) throws NegativeNumberException
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
		Mod5Problem2 t2 = new Mod5Problem2(4, 12);
		File cyTxt = new File("C:\\Users\\twin_\\Documents\\Cycle.txt"); //Creates File
		if(cyTxt.exists() && !cyTxt.isDirectory())
		{
		FileWriter writer = new FileWriter("Cycle.txt"); //Create file writer
		writer.write(t2.toString()); //Write to file
		writer.close(); //Close input
		Scanner scan = new Scanner(cyTxt); //Prints out file
		while (scan.hasNextLine()) 
		      System.out.println(scan.nextLine());
		}
	}

}
