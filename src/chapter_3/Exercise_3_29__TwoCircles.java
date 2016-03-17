package chapter_3;

public class Exercise_3_29__TwoCircles {
	
	/*
(Geometry: two circles) Write a program that prompts the user to enter the center
coordinates and radii of two circles and determines whether the second circle is
inside the first or overlaps with the first, as shown in Figure 3.10. (Hint: circle2 is
inside circle1 if the distance between the two centers <= | r1 - r2 | and circle2
overlaps circle1 if the distance between the two centers <= r1 + r2 . Test your
program to cover all cases.)
Here are the sample runs:

Enter circle1's center x-, y-coordinates, and radius: 0.5 5.1 13
Enter circle2's center x-, y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1

Enter circle1's center x-, y-coordinates, and radius: 3.4 5.7 5.5
Enter circle2's center x-, y-coordinates, and radius: 6.7 3.5 3
circle2 overlaps circle1

Enter circle1's center x-, y-coordinates, and radius: 3.4 5.5 1
Enter circle2's center x-, y-coordinates, and radius: 5.5 7.2 1
circle2 does not overlap circle1

	 */

	public static void main(String[] args){
		
		// input
		double x1, y1, r1;		// first circle's coords and radius
		double x2, y2, r2;		// ..^..
		double d;				// distance between two centers
		String output = "";
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		r1 = input.nextDouble();
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		r2 = input.nextDouble();
		input.close();
		
		// processing
		d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		if(d <= Math.abs(r1 - r2))
			output = "circle2 is inside circle1";
		else if(d <= r1 + r2)
			output = "circle2 overlaps circle1";
		else
			output = "circle2 does not overlap circle1";
		
		// output
		System.out.print(output);		
		
	}
	
}

// Completed by William ODieLag Pennington on 3/16/2016;