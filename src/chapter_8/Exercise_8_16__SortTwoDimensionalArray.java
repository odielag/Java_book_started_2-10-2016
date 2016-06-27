package chapter_8;

import java.util.Arrays;

/**
 * <h1>(Sort two-dimensional array)</h1> Write a method to sort a
 * two-dimensional array using the following header:
 * 
 * public static void sort(int m[][])
 * 
 * The method performs a primary sort on rows and a secondary sort on columns.
 * For example, the following array
 * 
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
 * 
 * will be sorted to
 * 
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-26
 *
 */

public class Exercise_8_16__SortTwoDimensionalArray
{
	public static void main(String[] args)
	{
		int[][] testArray =
		{
				{ 4, 2 },
				{ 1, 7 },
				{ 4, 5 },
				{ 1, 2 },
				{ 1, 1 },
				{ 4, 1 } };
		sort(testArray);
	}

	public static void sort(int m[][])
	{
		for (int row = 0; row < m.length - 1; row++)
		{
			for (int otherRow = row + 1; otherRow < m.length; otherRow++)
			{
				incrementalCompare(m, row, otherRow, 0);
			}
		}
		System.out.println(Arrays.deepToString(m));
	}

	public static void transpose(int m[][], int row, int otherRow)
	{
		for (int i = 0; i < m[row].length && i < m[otherRow].length; i++)
		{
			int temp = m[row][i];
			m[row][i] = m[otherRow][i];
			m[otherRow][i] = temp;
		}
	}
	public static void incrementalCompare(int[][] m, int row, int otherRow, int increment)
	{
		if(m[row][increment] > m[otherRow][increment])
		{
			transpose(m, row, otherRow);
		}
		else if(m[row][increment] == m[otherRow][increment] && increment < m[row].length - 1)
		{
			incrementalCompare(m, row, otherRow, increment + 1);
		}
		else
			return;
	}
}
