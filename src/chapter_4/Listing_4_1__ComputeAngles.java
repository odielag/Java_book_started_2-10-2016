package chapter_4;

public class Listing_4_1__ComputeAngles {

	/*
4.2.6
Case Study: Computing Angles of a Triangle

You can use the math methods to solve many computational problems. Given the three sides
of a triangle, for example, you can compute the angles by using the following formula:

A = acos((a * a - b * b - c * c) / (-2 * b * c))
B = acos((b * b - a * a - c * c) / (-2 * a * c))
C = acos((c * c - b * b - a * a) / (-2 * a * b))

Listing 4.1 is an example of a program that prompts the user to enter the x- and y-coordinates
of the three corner points in a triangle and then displays the three angles.

Enter three points: 1 1 6.5 1 6.5 2.5
The three angles are 15.26 90.0 74.74

	 */

	public static String ComputeAngles
	(double x0, double y0, double x1, double y1, double x2, double y2){

		// input
		double a, b, c;		/// The three line lengths from a triangle
		double A, B, C;		/// The angle of a corner with the same triangle
		// double x0, y0, x1, y1, x2, y2;		/// The user inputed points of the triangle

		/*		turning this into a method
		System.out.print("Enter the coordinates of three points separated "
				+ "by spaces like x1 y1 x2 y2 x3 y3: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		*/

		// processing
		//// lineLength... 
		a = lineLength(x0, y0, x1, y1);
		b = lineLength(x1, y1, x2, y2);
		c = lineLength(x2, y2, x0, y0);

		//// angles
		A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

		// output
		return String.format("Three angles of the triangle: %.2f, %.2f, %.2f", A, B, C);

	}

	private static double lineLength(double firstX, double firstY, double secondX, double secondY){
		return Math.pow(Math.pow((secondX - firstX), 2) + Math.pow((secondY - firstY), 2), 0.5);
	}

}

// Completed by William ODieLag Pennington on 3/20/2016;
// Modified by same guy to make it into a method on 4/8/2016;