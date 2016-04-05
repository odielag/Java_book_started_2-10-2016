package chapter_4;

import java.util.Scanner;

public class Exercise_4_2__GreatCircleDistance {
	
/*
(Geometry: great circle distance) The great circle distance is the distance between
two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographi-
cal latitude and longitude of two points. The great circle distance between the two
points can be computed using the following formula:

d = radius * Math.arccos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

Write a program that prompts the user to enter the latitude and longitude of two
points on the earth in degrees and displays its great circle distance. The average
earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
using the Math.toRadians method since the Java trigonometric methods use
radians. The latitude and longitude degrees in the formula are for north and west.
Use negative to indicate south and east degrees. Here is a sample run:

Enter point 1 (latitude and longitude) in degrees: 39.55, -116.25
Enter point 2 (latitude and longitude) in degrees: 41.5, 87.37
The distance between the two points is 10691.79183231593 km
 */

	public static void main(String[] args){
		
		// input
		double radius = 6371.01;	// average earth radius
		double d;					// distance between the two points
		double x1, y1;				// first point coordinates
		double x2, y2;				// second point coordinates
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		Scanner input = new Scanner(System.in);
		x1 = Math.toRadians(input.nextDouble());
		y1 = Math.toRadians(input.nextDouble());
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		x2 = Math.toRadians(input.nextDouble());
		y2 = Math.toRadians(input.nextDouble());
		input.close();
		
		// processing
		d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + 
				Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
		
		// output
		System.out.printf("The distance between the two points is %f", d);
		
	}
	
	public static double GreatCircleDistance(double x1, double y1, double x2, double y2){
		double radius = 6371.01;
		double x1r = Math.toRadians(x1);
		double y1r = Math.toRadians(y1);
		double x2r = Math.toRadians(x2);
		double y2r = Math.toRadians(y2);
		return radius * Math.acos(Math.sin(x1r) * Math.sin(x2r) + 
				Math.cos(x1r) * Math.cos(x2r) * Math.cos(y1r - y2r));
	}
	
}
