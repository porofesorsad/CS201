import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Problem4 
{
private static ArrayList<Integer> list = new ArrayList<>();

	public static Integer max(ArrayList<Integer> l)
	{
		list = l;
		if(l == null)
			return null;
		
		if(l.isEmpty())
			return null;
				
		Integer max = Collections.max(l);
		return max;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter numbers that end in zero, type 0 when you're done.");
		while(scan.nextInt() != 0)
			list.add(scan.nextInt());
		System.out.println(max(list));
	}
}
