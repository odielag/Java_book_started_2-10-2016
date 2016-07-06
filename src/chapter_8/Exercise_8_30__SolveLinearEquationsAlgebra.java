package chapter_8;

import java.util.Scanner;

/**
 * (Algebra: solve linear equations) Write a method that solves the following
2 * 2 system of linear equations:

a00 * x + a01 * y = b0
a10 * x + a11 * y = b1
x = (b0 * a11 - b1 * a01) / (a00 * a11 - a01 * a10)
y = (b1 * a00 - b0 * a10) / (a00 * a11 - a01 * a10)

The method header is

public static double[] linearEquation(double[][] a, double[] b)

The method returns null if (a00 a11 - a01 a10) is 0 . Write a test program that
prompts the user to enter a00 , a01 , a10 , a11 , b0 , and b1 , and displays the result. If
(a00 a11 - a01 a10) is 0 , report that “The equation has no solution.” A sample run is
similar to Programming Exercise 3.3.
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-7-6
 *
 */

public class Exercise_8_30__SolveLinearEquationsAlgebra
{
	public static void main(String[] args)
	{
		double[][] a = new double[2][2];
		double[] b = new double[2];
		Scanner input = new Scanner(System.in);

		// a input
		for(int row = 0; row < a.length; row++)
		{
			for(int column = 0; column < a[row].length; column++)
			{
				System.out.printf("What is a at row: %d column: %d: ", row, column);
				a[row][column] = input.nextDouble();
				System.out.println();
			}
			
		}
		// b input
		for(int column = 0; column < b.length; column++)
		{
			System.out.printf("What is b at column: %d: ", column);
			b[column] = input.nextDouble();
			System.out.println();
		}
		
		double[] coords = linearEquation(a, b).clone();
		System.out.printf("\nx and y are %f and %f", coords[0], coords[1]);
		// close input
		input.close();
	}
	public static double[] linearEquation(double[][] a, double[] b)
	{
		double[] coords = new double[2];	// coords[0] = x and coords[1] = y.
		if((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0)
		{
			System.out.print("The equation has no solution.\n");
			return null;
		}
		coords[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		coords[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		return coords;
	}
}
