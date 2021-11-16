import java.util.Scanner;
public class Problem1 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your student ID number");
		int id = scan.nextInt();
		int chapter = (id%3) + 3;
		int exercise = 0;
		int pg = 0;
		
		if(chapter == 3 || chapter ==2)
			exercise = (id%34) +1;
		
		else if(chapter == 4)//Ch.6
				exercise = (id/38)+1;
		
		else if(chapter == 5)
			exercise = (id%46)+1;
			
		System.out.println("Please enter the number of the page number that chapter " + chapter + " exercise #" + exercise + " is on");
		pg = scan.nextInt();
		System.out.println("Solve programming exercise #" + exercise + " from chapter " + chapter + ", page "+ pg);
	}

}
