package chapter_2;

public class Exercise_2_19__ {
	
	/*
(Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1) , (x2, y2) , (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is

s = (side1 + side2 + side3)/2;

area =  Math.pow((s * ((s - side1)(s - side2)(s - side3))), 0.5);

Here is a sample run:

Enter three points for a triangle: 1.5 -3.4 4.6 5 9.5 -3.4
The area of the triangle is 33.6
	 */

	private static double x1, y1, x2, y2, x3, y3, side1, side2, side3, area, s;
	
	public static void main(String[] args) {
		

		
		// input
		System.out.printf("Enter three points for a triangle: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		input.close();
		
		// processing
		side1 = Math.sqrt((x2 - x1) - (y2 - y1));
		side1 = Math.sqrt((x3 - x2) - (y3 - y2));
		side1 = Math.sqrt((x1 - x3) - (y1 - y3));
		s = (side1 + side2 + side3) / 2;
		area =  Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
		
		// output
		System.out.printf("The area of the triangle is %d", area);

	}

}

// I don't know why this program isn't working.

