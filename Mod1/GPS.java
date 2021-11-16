import java.io.*;

import java.util.Random;

import java.lang.Math;

// Declare a class

public class GPS

{

// Definition of the function.

public static int randSel(int start, int fin)

{

// Declare the object of a class.

Random r = new Random();

// Declare an integer value and store

// value in it.

int rNum = r.nextInt((fin - start) + 1) + start;

// return value.

return rNum;

}

// Definition of the function.

public static double DistFromOrig(double X, double Y)

{

// Declare a double variable.

double dist;

// Calculate the distance.

dist = Math.sqrt(X * X + Y * Y);

// return distance.

return dist;

}

// Start the main method.

public static void main(String[] args)

{

try

{

// declare variables

double X = 0, Y = 0;

int time = 60;

final int north = 0;

final int east = 1;

final int south = 2;

final int west = 3;

int Direction = 0;

// Start the while loop

while (time > 0)

{

// check whether the time is greater

// than 5 or not.

if (time >= 5)

{

// update the value of time.

time -= 5;

// call to the method.

Direction = randSel(0, 3);

if (Direction == north)

{

// update the value of y cordinate.

Y = Y + 5;

// display the statement on console.

System.out.println("Moved north");

}

// Check the direction

if (Direction == east)

{

// update the value of x cordinate.

X = X + 5;

// display the statement on console.

System.out.println("Moved east");

}

// Check the direction

if (Direction == west)

{

// update the value of x cordinate.

X = X - 5;

// display the statement on console.

System.out.println("Moved west");

}

// Check the direction

if (Direction == south)

{

// update the value of y cordinate.

Y = Y - 5;

// display the statement on console.

System.out.println("Moved south");

}

}

else

{

// Check the direction

if (Direction == north)
{
Y = Y + time * 1;
time = 0;
}

if (Direction == east)
{
X = X + time * 1;
time = 0;
}

// Check the direction

if (Direction == west)

{
X = X - time * 1;
time = 0;
}

if (Direction == south)
{
Y = Y - time * 1;
time = 0;
}
}
}
System.out.println("Distance of Car After Traveling 1 Hr: "

+ DistFromOrig(X, Y)

+ " miles");

}

// Start the catch block.

catch (Exception e)

{

e.printStackTrace();

}

}

}