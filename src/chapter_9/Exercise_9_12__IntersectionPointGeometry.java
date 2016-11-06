package chapter_9;

import java.util.Scanner;
import chapter_10.Exercise_10_4__MyPoint;

/**
 * <h1>(Geometry: intersecting point)</h1> Suppose two line segments intersect.
 * The two end- points for the first line segment are ( x1 , y1 ) and ( x2 , y2
 * ) and for the second line segment are ( x3 , y3 ) and ( x4 , y4 ). Write a
 * program that prompts the user to enter these four endpoints and displays the
 * intersecting point. As discussed in Program- ming Exercise 3.25, the
 * intersecting point can be found by solving a linear equa- tion. Use the
 * LinearEquation class in Programming Exercise 9.11 to solve this equation. See
 * Programming Exercise 3.25 for sample runs.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-8-22
 * 
 */

public class Exercise_9_12__IntersectionPointGeometry
{
	public static void main(String[] args)
	{
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		Scanner input = new Scanner(System.in);
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		Exercise_9_12__IntersectionPointGeometry geometries = new Exercise_9_12__IntersectionPointGeometry(x1, y1, x2,
				y2, x3, y3, x4, y4);
		System.out.println(geometries.output());
	}

	// input
	double x1, y1, x2, y2; // Line one coords
	double x3, y3, x4, y4; // Line two coords

	double a = y1 - y2;
	double b = -(x1 - x2);
	double c = (y3 - y4);
	double d = -(x3 - x4);
	double e = (y1 - y2) * x1 - (x1 - x2) * y1;
	double f = (y3 - y4) * x3 - (x3 - x4) * y3;

	double x = (e * d - b * f) / (a * d - b * c);
	double y = (a * f - e * c) / (a * d - b * c);

	public Exercise_9_12__IntersectionPointGeometry(double x1, double y1, double x2, double y2, double x3, double y3,
			double x4, double y4) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
	}

	public Exercise_9_12__IntersectionPointGeometry(Exercise_10_4__MyPoint a, Exercise_10_4__MyPoint b,
			Exercise_10_4__MyPoint c, Exercise_10_4__MyPoint d) {
		this.x1 = a.getX();
		this.y1 = a.getY();
		this.x2 = b.getX();
		this.y2 = b.getY();
		this.x3 = c.getX();
		this.y3 = c.getY();
		this.x4 = d.getX();
		this.y4 = d.getY();
	}

	public boolean intersects()
	{
		// check if the lines are parallel. If so, they do not intersect (in my
		// opinion/easier).
		if (a * d - b * c == 0)
			return false;
		// there is a point within the limits of the lines.
		else if (((Math.min(x1, x2) <= x && Math.max(x1, x2) >= x) && (Math.min(y1, y2) <= y && Math.max(y1, y2) >= y))
				&& ((Math.min(x3, x4) <= x && Math.max(x3, x4) >= x)
						&& (Math.min(y3, y4) <= y && Math.max(y3, y4) >= y)))
			return true;
		else
			return false;
	}

	// output
	public String output()
	{
		if (a * d - b * c == 0)
			return "The two lines are parallel";

		else
			return String.format("The intersecting point is at (%f, %f)\n", x, y);
	}

}