package chapter_3;

public class Exercise_3_25__IntersectingPoint {
	
	/*
(Geometry: intersecting point) Two points on line 1 are given as ( x1 , y1 ) and ( x2 ,
y2 ) and on line 2 as ( x3 , y3 ) and ( x4 , y4 ), as shown in Figure 3.8a–b.

The intersecting point of the two lines can be found by solving the following
linear equation:

(y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
(y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3

This linear equation can be solved using Cramer’s rule (see Programming Exer-
cise 3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).114 Chapter 3 Selections

Write a program that prompts the user to enter four points and displays the inter-
secting point.

Two lines intersect in (a and b) and two lines are parallel in (c).

Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
The intersecting point is at (2.88889, 1.1111)

Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
The two lines are parallel
	 */

	public static void main(String[] args){
		
		// input
		double x1, y1, x2, y2;		// Line one coords
		double x3, y3, x4, y4;		// Line two coords
		double x, y;				// coords of answer
		double a, b, c;				// Line one standard form
		double d, e, f;				// line two standard form
		
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		x3 = input.nextDouble();
		y3 = input.nextDouble();
		x4 = input.nextDouble();
		y4 = input.nextDouble();
		input.close();
		
		// processing
		a = y1 - y2;
		b = -(x1 - x2);
		e = (y1 - y2) * x1 - (x1 - x2) * y1;
		c = (y3 - y4);
		d = -(x3 - x4);
		f = (y3 - y4) * x3 - (x3 - x4) * y3;

		if (a * d - b * c == 0){
			System.out.println("The two lines are parallel");
			System.exit(0);
		}
		
		x = (e * d - b * f) / (a * d - b * c);
		y = (a * f - e * c) / (a * d - b * c);
		
		// output
		System.out.printf("The intersecting point is at (%f, %f)\n", x, y);
		
	}
	
}

// I had a hard time with this math wise. It is completed and works.