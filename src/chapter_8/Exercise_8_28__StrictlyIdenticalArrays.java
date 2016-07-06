package chapter_8;

import java.util.Scanner;

/**
 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
identical if their corresponding elements are equal. Write a method that returns
true if m1 and m2 are strictly identical, using the following header:

public static boolean equals(int[][] m1, int[][] m2)

Write a test program that prompts the user to enter two 3 * 3 arrays of
integers and displays whether the two are strictly identical. Here are the
sample runs.

Enter list1: 51 22 25 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are strictly identical

Enter list1: 51 25 22 6 1 4 24 54 6
Enter list2: 51 22 25 6 1 4 24 54 6
The two arrays are not strictly identical
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-7-6
 *
 */

public class Exercise_8_28__StrictlyIdenticalArrays
{
	// main method for testing and input/output
	public static void main(String[] args)
	{
		// scanner input.
		Scanner input = new Scanner(System.in);
		// make two int[][] arrays called m1 and m2.
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];
		// output "Enter list1: ".
		System.out.print("Enter list1: ");
		// collect all numbers without println
		for(int row = 0; row < m1.length; row++)
		{
			for(int column = 0; column < m1[row].length; column++)
			{
				m1[row][column] = input.nextInt();
			}
		}
		// output "Enter list2: "
		System.out.print("Enter list2: ");
		// collect all numbers to m2 without println
		for(int row = 0; row < m2.length; row++)
		{
			for(int column = 0; column < m2[row].length; column++)
			{
				m2[row][column] = input.nextInt();
			}
		}
		// send m1 and m2 to "equals" method and print out...
		// "The two arrays are strictly identical" ... or...
		// "The two arrays are not strictly identical".
		System.out.printf("The two arrays are %sstrictly identical", (equals(m1, m2))?"":"not ");
		// close input
		input.close();
	}
	// method to check if two arrays are strictly identical
	public static boolean equals(int[][] m1, int[][] m2)
	{
		// return false if arrays aren't same size.
		if(m1.length != m2.length || m1[0].length != m2[0].length)
			return false;
		// create two for loops to compare elements and ...
		// return false if any are not the same.
		for(int row = 0; row < m1.length; row++)
		{
			for(int column = 0; column < m1[row].length; column++)
			{
				if(m1[row][column] != m2[row][column])
					return false;
			}
		}
		// if nothing else, return true.
		return true;
	}
}
