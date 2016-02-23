package chapter_2;

public class Exercise_2_15__PointsDistance {
	
	/*
(Geometry: distance of two points) Write a program that prompts the user to enter
two points (x1, y1) and (x2, y2) and displays their distance between them.
The formula for computing the distance is 

Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

Note that
you can use Math.pow(a, 0.5) to compute (square root of a). Here is a sample run:

Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
	 */

	private static double x1, x2, y1, y2, distance;
	
	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter x1 and y1: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		System.out.printf("Enter x2 and y2: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		
		// processing
		distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);
		
		// output
		System.out.printf("The distance between the two points is %.15f", distance);
		
	}

}

// Finished by William ODieLag Pennington
