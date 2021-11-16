import java.util.Scanner;
//Yasmin Torres Chapter 4 Problem 2
public class Chapter4Problem2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter point 1(lattitude & longitude) in degrees.");
		double lat1 = scan.nextDouble();
		double lon1 = scan.nextDouble();
		
		System.out.println("Enter point 2(lattitude & longitude) in degrees.");
		double lat2 = scan.nextDouble();
		double lon2 = scan.nextDouble();
		
		 double d = 6371.01 * Math.acos((Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))) 
		+ (Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lon1)
				- Math.toRadians(lon2))));
		    
		        System.out.printf("The distance between the two points is %f km.%n", d);    
		    }

}
