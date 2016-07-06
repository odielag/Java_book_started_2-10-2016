package chapter_8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Row sorting) Implement the following method to sort the rows in a two-
dimensional array. A new array is returned and the original array is intact.
public static double[][] sortRows(double[][] m)
Write a test program that prompts the user to enter a 3 * 3 matrix of double
values and displays a new row-sorted matrix. Here is a sample run:

Enter a 3-by-3 matrix row by row:
0.15 0.875 0.375
0.55 0.005 0.225
0.30 0.12 0.4

The row-sorted array is
0.15 0.375 0.875
0.005 0.225 0.55
0.12 0.30 0.4
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-7-6
 *
 */

public class Exercise_8_26__RowSorting
{
	public static void main(String[] args)
	{
		// have user enter a 3-by-3 double array
		Scanner input = new Scanner(System.in);
		double[][] m = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for(int row = 0; row < m.length; row++)
		{
			for(int column = 0; column < m[row].length; column++)
			{
				m[row][column] = input.nextDouble();
			}
			System.out.println();
		}
		// make new array from sending above array to sortRows method
		double[][] n = sortRows(m).clone();
		// print out array n.
		for(double[] row:n)
		{
			for(double column:row)
			{
				System.out.print(column + " ");
			}
			System.out.println();
		}
		input.close();
	}
	// method to sort columns of rows in inputed double array
	public static double[][] sortRows(double[][] m)
	{
		double[][] n = m.clone();
		for(int row = 0; row < m.length; row++)
		{
			Arrays.sort(n[row]);
		}
		return n;
	}
}
