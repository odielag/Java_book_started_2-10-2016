package chapter_8;

import java.util.Scanner;

/**
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 * in the major diagonal in an n * n matrix of double values using the following
 * header:
 * 
 * public static double sumMajorDiagonal(double[][] m)
 * 
 * Write a test program that reads a 4-by-4 matrix and displays the sum of all
 * its elements on the major diagonal. Here is a sample run:
 * 
 * Enter a 4-by-4 matrix row by row:
 * 
 * 1 2 3 4.0
 * 
 * 5 6.5 7 8
 * 
 * 9 10 11 12
 * 
 * 13 14 15 16
 * 
 * Sum of the elements in the major diagonal is 34.5
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-22
 */

public class Exercise_8_2__SumTheMajorDiagonalInAMatrix
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		// ask user to input doubles "Enter a 4-by-4 matrix row by row: "
		System.out.print("Enter a 4-by-4 matrix row by row: ");
		// make a 4 by 4 double array
		double[][] array = new double[4][4];
		// make 2 for loops to read in the elements
		for(int col = 0; col < array.length; col++)
		{
			for(int row = 0; row < array[col].length; row++)
			{
				array[col][row] = input.nextDouble();
			}
		}
		System.out.printf(""
				+ "Sum of the elements in the major diagonal is %.1f", sumMajorDiagonal(array));
		input.close();
	}
	// make a function that returns a dub of the sum of diagonal numbers
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum = 0;
		// find out if column length is the same as initial row length.
		if(m.length != m[0].length)
		{
			System.out.printf("\nError: The array is not symetrical.");
			System.exit(-1);
		}

		// summing up diagonals with a for loop.
		for(int i = 0;i < m.length; i++)
		{
			sum += m[i][i];
		}
		// return sum double.
		return sum;
	}
}
