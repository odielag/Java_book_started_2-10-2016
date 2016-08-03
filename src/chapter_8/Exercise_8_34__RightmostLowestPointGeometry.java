package chapter_8;

import java.util.Scanner;

/**
 * <h1>(Geometry: rightmost lowest point)</h1> In computational geometry, often
 * you need to find the rightmost lowest point in a set of points. Write the
 * following method that returns the rightmost lowest point in a set of points.
 * 
 * public static double[] getRightmostLowestPoint(double[][] points)
 * 
 * Write a test program that prompts the user to enter the coordinates of six
 * points and displays the rightmost lowest point. Here is a sample run:
 * 
 * Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
 * 
 * The rightmost lowest point is (6.5, -7.0)
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-7-6
 *
 */

public class Exercise_8_34__RightmostLowestPointGeometry
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 6 points: ");
		double[][] points = new double[6][2];
		for(int row = 0; row < points.length; row++)
		{
			for(int column = 0; column < points[row].length; column++)
			{
				points[row][column] = input.nextDouble();
			}
		}
		double[] returnable = getRightmostLowestPoint(points).clone();
		System.out.printf("The rightmost lowest point is (%.3f, %.3f)", returnable[0], returnable[1]);
		input.close();
	}
	public static double[] getRightmostLowestPoint(double[][] points)
	{
		double value;
		double[] returnable = new double[2];
		value = points[0][0] - points[0][1];
		returnable[0] = points[0][0];
		returnable[1] = points[0][1];
		for(int row = 1; row < points.length; row++)
		{
			if(points[row][0] - points[row][1] > value)
			{
				returnable[0] = points[row][0];
				returnable[1] = points[row][1];
				value = points[row][0] - points[row][1];
			}
		}
		return returnable;
	}
}
