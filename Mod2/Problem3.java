/*
 * Yasmin Torres
 * Module 2 problem 2
 */
import java.util.Arrays;
import java.util.Scanner;
public class Problem3 
{
private static String month;
private static Scanner scan = new Scanner(System.in);
private static double low = 0;
private static double high = 0;
private static double[][] temp = new double[2][12];// temp array
private static String[] months = { "January", "February", "March",
        "April", "May", "June", "July", 
        "August", "September", "October",
        "November", "December" }; 

public static void inputTempForMonth(String m, double[][] t)
{
//Purpose is to input high and low temp for cERtaiN month
	System.out.println("Please input the high and the the low temp for the month");
	high = scan.nextDouble();
	low = scan.nextDouble();
	
	for(int i = 0; i < 1; i++)//row
	{
		for(int j = Arrays.asList(months).indexOf(m); j < 1; j++)//column
		{
			t[0][j] = high;
			t[1][j] = low; 
		}	
			
	}
	System.out.println(m + " has a high of " + high + " and a low of " + low);
}

public static void inputTempForYear()
{
//Input high and low temp for each month of year, returns array of year temp
	System.out.println("Please input the high and then low temp");
	for(int i = 0; i < 2; i++)
	{
		for(int j = 0; j < 12; j++)
			temp[i][j] = scan.nextDouble();
	}
	int k = 0;
	for(int i = 0; i < 2; i ++ )//r
	{
		for(int j = 0; j < 11;j+=2)//c
		{
			System.out.println(months[k] + " has a high of " +
		temp[i][j] + " and a low of " + temp[i][j+1]);
			k++;
		}	
	}
	//System.out.println(months[11] + " has a high of " + temp[0][11] 
	//		+ " and a low of " + temp[1][11]);	
	
}

public static double calculateAverageHigh(double[][] t)
{
	//Returns average high temp for year
	double avg = 0;
	for(int i = 0; i < t.length;i++)
	{	
		for(int j = 0; j < t[0].length; j+=2)
		avg += t[0][j];
	}	
	return (int)avg/12;
}

public static double calculateAverageLow(double[][] t)
{
	//Returns average low for year
	double avg = 0;
	for(int i = 0; i < t.length;i++)
	{	
		for(int j = 1; j < t[0].length; j+=2)
		avg += t[1][j];
	}	
	return (int)avg/12;
}

public static double findHighestTemp(double[][] t)
{
	//Returns index of high temp, if occurs more than once, return index of first month
	double high = t[0][1];
	for(int i = 0; i <t.length;i++)
	{
		for(int j = 0; j < t[0].length; j++)
		{
		if(t[i][j] > high)
			high = t[i][j];
		}
	}
	return high;
}

public static double findLowestTemp(double[][] t)
{
	//Returns index of lowest temp, if occurs more than once, return index of first month
	double low = t[0][0];
	for(int i = 0; i < t.length;i++)
	{
		for(int j = 0; j <t[0].length;j++)
		{
		if(t[i][j] < low)
			low = t[i][j];
		}
	}
	return low;
}

	public static void main(String[] args) 
	{
		inputTempForYear();
		System.out.println("The highest average temperature is " + calculateAverageHigh(temp));
		System.out.println("The lowest average temperature is " + calculateAverageLow(temp));
		System.out.println("The highest temperature overall is " + findHighestTemp(temp));
		System.out.println("The lowest temperature overall is " + findLowestTemp(temp));
	}

}
