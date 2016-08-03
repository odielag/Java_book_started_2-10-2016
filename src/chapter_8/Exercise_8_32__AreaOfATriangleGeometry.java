package chapter_8;

import java.util.Scanner;

/**
 * (Geometry: area of a triangle) Write a method that returns the area of a
 * triangle using the following header:
 * 
 * public static double getTriangleArea(double[][] points)
 * 
 * The points are stored in a 3-by-2 two-dimensional array points with points[0]
 * [0] and points[0][1] for ( x1 , y1 ). The triangle area can be computed using
 * the formula in Programming Exercise 2.19. The method returns 0 if the three
 * points are on the same line. Write a program that prompts the user to enter
 * three points of a triangle and displays the triangle's area. Here is a sample
 * run of the program:
 * 
 * Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0 The area of the triangle
 * is 2.25
 * 
 * Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6 The three points are on the
 * same line
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-7-6
 *
 */

public class Exercise_8_32__AreaOfATriangleGeometry
{
	public static void main(String[] args)
	{
		// scanner
		Scanner input = new Scanner(System.in);
		// points array. example... x1, y1 = triangle[0][0], triangle[0][1].
		double[][] triangle = new double[3][2];
		// area variable
		double area = 0;
		// ask for input
		System.out.printf("Enter x1, y1, x2, y2, x3, y3: ");
		// input loop
		for (int row = 0; row < triangle.length; row++)
		{
			for (int column = 0; column < triangle[row].length; column++)
			{
				triangle[row][column] = input.nextDouble();
			}
		}
		input.close();
		area = getTriangleArea(triangle);
		if(area > 0)
			System.out.printf("The area of the triangle is %f", area);
		else
			System.out.print("The three points are on the same line");
	}

	public static double getTriangleArea(double[][] points)
	{
		// processing
		double dx1 = points[0][0] - points[1][0];
		double dy1 = points[0][1] - points[1][1];
		double side1 = Math.sqrt(dx1 * dx1 + dy1 * dy1);

		double dx2 = points[1][0] - points[2][0];
		double dy2 = points[1][1] - points[2][1];
		double side2 = Math.sqrt(dx2 * dx2 + dy2 * dy2);

		double dx3 = points[2][0] - points[0][0];
		double dy3 = points[2][1] - points[0][1];
		double side3 = Math.sqrt(dx3 * dx3 + dy3 * dy3);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		return area;
	}
}
