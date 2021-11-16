package builder;
//Yasmin Torres Module 3
import java.util.Scanner;
public class Builder 
{
	private static Scanner scan;

	public static void main(String[] args) 
	{	
		scan = new Scanner(System.in);
		System.out.println("Input string please.");
		StringBuilder str = new StringBuilder(scan.nextLine());
		System.out.println("Capacity: " + str.capacity());
		str.append("I love it!");
		System.out.println("Please write 'Yes'");
		StringBuilder yis = new StringBuilder(scan.nextLine());
		System.out.println(str.replace(11, 12, ". "+ yis + ", "));
		
	}

}
