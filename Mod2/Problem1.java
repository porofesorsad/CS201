/*
 * Yasmin Torres
 * Module 2 problem 1
 */
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of girl scouts please");
		int scoutNum = scan.nextInt();
		int[] boxNum = new int[scoutNum];
		int[] range = new int[5];
		for(int i = 0;i < scoutNum; i++)
		{
			System.out.println("Number of boxes sold for girl #" + (i+1));
			boxNum[i] =scan.nextInt();
			if(boxNum[i] >= 0 && boxNum[i] <= 10)
				range[0]++;
			
			else if(boxNum[i] >= 11 && boxNum[i] <= 20)
				range[1]++;
			
			else if(boxNum[i] >= 21 && boxNum[i] <= 30)
				range[2]++;
			
			else if(boxNum[i] >= 31 && boxNum[i] <= 40)
				range[3]++;
			
			else if(boxNum[i] >= 41)
				range[4]++;
		}
		System.out.println("Total Boxes \t" +  "# of Girl Scouts");
		System.out.println("0 to 10 \t" + range[0]);
		System.out.println("11 to 20 \t" + range[1]);
		System.out.println("21 to 30 \t" + range[2]);
		System.out.println("31 to 40 \t" + range[3]);
		System.out.println("41 or more \t" + range[4]);		
	}

}
