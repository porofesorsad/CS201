/*
 * Yasmin Torres
 * Module 2 problem 2
 */
import java.util.Scanner;	 
public class Problem2 
{
private static Scanner scan = new Scanner(System.in);
private static double score = 0;
private static double[] scores = new double[7];

public static void inputValidScore(int judge)
{
   for(int i = 0; i < 7; i++)
   {
	   System.out.println("Judge #" + (i+1));
	   double score = scan.nextDouble();
	   if(score >= 0 && score <= 10) 
   	{
		scores[i] = score;
   	}
    }  
}	

/*public static void inputAllScores()//Uses the valid score method to store array
{
	  for(int i = 0; i <7; i++)
	  scores[i] = inputValidScore(i);
	}
*/
public static double validDegreeOfDifficulty()
{
	System.out.println("Please enter degree of difficulty");
	return scan.nextDouble();
}
public static double calculateScore()
{
	/*
	The highest and lowest scores are thrown out and the remaining scores are added together. 
	The sum is then multiplied by the degree of difficulty for that dive. 
	The degree of difficulty ranges from 1.2 to 3.8 points. 
	The total is then multiplied by 0.6 to determine the diver’s score
	*/
	//Must sort array
	java.util.Arrays.sort(scores);
	double sum = 0;
	double[] nScores = new double[5];
	for(int i = 1; i < 6; i ++)
		nScores[i-1] = scores[i];
	//Gets sum
	for(double x: nScores)
		sum+=x;
	return (int)sum*0.6;
	
}

	public static void main(String[] args) 
	{
		validDegreeOfDifficulty();//Prompts for degree	
		System.out.println("Please enter valid score (0-10)");
		inputValidScore(1);	
		System.out.println("The final score is..." + calculateScore());
	}
}	
