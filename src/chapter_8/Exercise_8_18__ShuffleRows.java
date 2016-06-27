package chapter_8;

import java.util.Arrays;

/**
 * <h1>(Shuffle rows)</h1> Write a method that shuffles the rows in a
 * two-dimensional int array using the following header:
 * 
 * public static void shuffle(int[][] m)
 * 
 * Write a test program that shuffles the following matrix:
 * 
 * int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-26
 *
 */

public class Exercise_8_18__ShuffleRows
{
	public static void main(String[] args)
	{
		int[][] m =
		{
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 },
				{ 7, 8 },
				{ 9, 10 } };
		System.out.println(Arrays.deepToString(shuffle(m)));
	}

	public static int[][] shuffle(int[][] m)
	{
		// new array to make into the new m
		int[][] n = new int[m.length][m[0].length];
		// array to keep track of posted elements.
		boolean[] d = new boolean[m.length];
		for (int row = 0; row < m.length; row++)
		{
			int random = (int) (Math.random() * m.length);
			while (d[random])
			{
				random = (int) (Math.random() * m.length);
			}
			transposeRows(m, n, row, random);
			d[random] = true;
		}
		return n;
	}

	public static void transposeRows(int[][] sourceArray, int[][] destArray, int sourceRow, int destinationRow)
	{
		for (int column = 0; column < sourceArray[sourceRow].length; column++)
		{
			int temp = sourceArray[sourceRow][column];
			sourceArray[sourceRow][column] = destArray[destinationRow][column];
			destArray[destinationRow][column] = temp;
		}
	}
}
