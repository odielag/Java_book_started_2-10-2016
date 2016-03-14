package chapter_3;

public class Exercise_3_23__PointInARectangle {

	/*
(Geometry: point in a rectangle?) Write a program that prompts the user to enter
a point (x, y) and checks whether the point is within the rectangle centered at
( 0 , 0 ) with width 10 and height 5 . For example, ( 2 , 2 ) is inside the rectangle and
( 6 , 4 ) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
rectangle if its horizontal distance to ( 0 , 0 ) is less than or equal to 10 / 2 and its
vertical distance to ( 0 , 0 ) is less than or equal to 5.0 / 2 . Test your program to
cover all cases.) Here are two sample runs.

Enter a point with two coordinates: 2 2
Point (2.0, 2.0) is in the rectangle

Enter a point with two coordinates: 6 4
Point (6.0, 4.0) is not in the rectangle
	 */

	public static void main(String[] args){
		
		// input
		double x, y;		// user entered coordinates
		String output;
		
		System.out.println("Enter a point with two coordinates: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		input.close();
		
		// processing
		if (Math.abs(x) < 10 && Math.abs(y) < 5) 
			output = String.format("Point (%.1f, %.1f) is in the rectangle", x, y);
		else if (Math.abs(x) >= 10 || Math.abs(y) >= 5) 
			output = String.format("Point (%.1f, %.1f) is not in the rectangle", x, y);
		else
			output = " oops. Something went wrong. ";
		
		// output
		System.out.println(output);
		
	}
	
}

// Completed by William ODieLag Pennington on 3/14/2016;