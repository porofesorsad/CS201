package highSchoolLocker;
import java.util.Scanner;
//Yasmin Torres Module 3
public class Locker 
{
	private static int book= 0;
	private static int lockerNumber;
	private static Scanner scan = new Scanner(System.in);
	private static String name;
	private static int num1;
	private static int num2;
	private static int num3;
	private CombinationLock combLock = new CombinationLock(num1, num2, num3);
	public Locker(int lockerNumber, String name, int book, CombinationLock combLock) 
	{
		super();
		this.lockerNumber = lockerNumber;
		this.name = name;
		this.book = book;
		this.combLock = combLock;
	}
	public void putBookInLocker()
	{
		book += 1;
		System.out.println("1 book has been added to " + name + "'s locker");
	}
	
	public boolean removeBookFromLocker()
	{
		if(book > 0)
		{
			book --;
			System.out.println("1 book has been removed from " + name + "'s locker");
			return true;
		}
		else if(book < 0)
		{
		System.out.println("Locker is empty.");
		return false;
		}
		return true;
	}
	public int getLockerNumber() 
	{
		return lockerNumber;
	}
	
	public boolean openLocker()
	{
		System.out.println("Please input the three digit combination for locker #" + getLockerNumber());
		if(CombinationLock.openLock(scan.nextInt(), scan.nextInt(), scan.nextInt()))
		{
			System.out.println("Locker opened");
			return true;
		}
		System.out.println("Wrong combination. Please try again.");
		return false;
	}
	
	public String toString()
	{
		return "Locker #" + getLockerNumber() + "\n" + "Owner: " + name + "\n" + "Contains: " + book + 
				" books";
	}
}	
	
 