package chapter_9;

import java.util.Scanner;

/**
 * <h1>(Geometry: intersecting point)</h1> Suppose two line segments intersect. The two end-
points for the first line segment are ( x1 , y1 ) and ( x2 , y2 ) and for the second line
segment are ( x3 , y3 ) and ( x4 , y4 ). Write a program that prompts the user to enter
these four endpoints and displays the intersecting point. As discussed in Program-
ming Exercise 3.25, the intersecting point can be found by solving a linear equa-
tion. Use the LinearEquation class in Programming Exercise 9.11 to solve this
equation. See Programming Exercise 3.25 for sample runs.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-8-22
 * 
 */

public class Exercise_9_12__IntersectionPointGeometry
{
	public static void main(String[] args)
	{
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		
	}
}

class IntersectingPointGeometry
{
	// input
	private double x1, y1, x2, y2;		// Line one coords
	private double x3, y3, x4, y4;		// Line two coords
	private double x, y;				// coords of answer
	private double a, b, c;				// Line one standard form
	private double d, e, f;				// line two standard form
	
//This is the area that doesn't seem to be working vvv
	public IntersectingPointGeometry(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}
	
	
	// processing
	this.a = y1 - y2;
	this.b = -(x1 - x2);
	this.e = (y1 - y2) * x1 - (x1 - x2) * y1;
	this.c = (y3 - y4);
	this.d = -(x3 - x4);
	this.f = (y3 - y4) * x3 - (x3 - x4) * y3;


	
	if (a * d - b * c == 0){
		System.out.println("The two lines are parallel");
		System.exit(0);
	}
	
	x = (e * d - b * f) / (a * d - b * c);
	y = (a * f - e * c) / (a * d - b * c);
	
	// output
	System.out.printf("The intersecting point is at (%f, %f)\n", x, y);
}