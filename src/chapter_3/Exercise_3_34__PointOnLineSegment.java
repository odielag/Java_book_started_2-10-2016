package chapter_3;

public class Exercise_3_34__PointOnLineSegment {
	
	/*
(Geometry: point on line segment) Programming Exercise 3.32 shows how to test
whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
test whether a point is on a line segment. Write a program that prompts the user
to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
segment from p0 to p1. Here are some sample runs:

Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)

Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
(3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)
	 */
	
	/*
from exercise 3.32

line = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)

if(line > 0) p2 is on the left side of the line
if(line == 0) p2 is on the same line
if(line < 0) p2 is on the right side of the line
	 */
	
	public static void main(String[] args){
		
		// input
		double x0, y0, x1, y1, x2, y2;
		double line;
		String output;
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter three points for p0, p1 and p2: ");
		x0 = input.nextDouble();
		y0 = input.nextDouble();
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		
		// processing
		line = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		
		/// boundaries check and on line check.
		if ((((x0 <= x2 && x2 <= x1) || (x1 <= x2 && x2 <= x0)) && 
		((y0 <= y2 && y2 <= y1) || (y1 <= y2 && y2 <= y0))) && (line == 0))
			output = String.format(
					"(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)", 
					x2, y2, x0, y0, x1, y1);
		
		else 
			output = String.format(
					"(%.1f, %.1f) is not on the line from (%.1f, %.1f) to (%.1f, %.1f)", 
					x2, y2, x0, y0, x1, y1);
		
		
		// output
		System.out.print(output);
		
	}

}
