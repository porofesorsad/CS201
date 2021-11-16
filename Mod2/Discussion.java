import java.util.Scanner;
public class Discussion 
{
	public static boolean isSortedConstantInterval(int[] list)
	{ 
	 for (int i = 0; i < list.length-1; i++)
	    {
		 if(list[i] < list[i+1] && list[list.length-1] > list[list.length-2])
			return true;	
		 }
	return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the number of integers you are going to input first");
		int[] list = new int[scan.nextInt()];
		System.out.println("Please input list.");
		for(int i = 0; i < list.length; i++)
			list[i] = scan.nextInt();
		
		if(isSortedConstantInterval(list))
			System.out.println("The list is sorted");
		else
			System.out.println("The list is not sorted");
	}
}
