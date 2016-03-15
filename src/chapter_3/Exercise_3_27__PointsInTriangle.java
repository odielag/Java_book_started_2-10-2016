package chapter_3;

public class Exercise_3_27__PointsInTriangle {
	
	/*
(Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
shown below. The right-angle point is placed at (0, 0), and the other two points
are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
a point with x- and y-coordinates and determines whether the point is inside the
triangle. Here are the sample runs:

Enter a point's x- and y-coordinates: 100.5 25.5
The point is in the triangle

Enter a point's x- and y-coordinates: 100.5 50.5
The point is not in the triangle
	 */

	public static void main(String[] args){
		
		// input
		double x, y;
		String in = "uhoh...";
		
		System.out.print("Enter a point's x and y coordinates: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		input.close();
		
		// processing
		if(x > 0 && y > 0 && 0.5 * x + y < 100) in = "";
		else in = "not ";
		
		// output
		System.out.printf("The point is %sin the triangle", in);
	}
	
}

// Completed by William ODieLag Pennington on 3/15/2016;