package highSchoolLocker;
//Yasmin Torres Module 3
public class CombinationLock 
{	
	private static int dial = 0;
	private static int num1;
	private static int num2;
	private static int num3;
	
	public CombinationLock(int num1, int num2, int num3)
	{
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	
	}
	
	public static boolean openLock(int n1, int n2, int n3)
	{
		if(n1 == num1 && n2 == num2 && n3 == num3)			
		return true;
		return false;
	}
	public String toString()
	{
		return num1 + ", " + num2 + ", " + num3;
	}
}
