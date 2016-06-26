package chapter_8;

/**
 * <h1>(Largest row and column)</h1> Write a program that randomly fills in 0s
 * and 1s into a 4-by-4 matrix, prints the matrix, and finds the first row and
 * column with the most 1s. Here is a sample run of the program:
 * 
 * 0011
 * 
 * 0011
 * 
 * 1101
 * 
 * 1010
 * 
 * The largest row index: 2
 * 
 * The largest column index: 2
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-23
 *
 */

public class Exercise_8_10__LargestRowAndColumn
{
	public static void main(String[] args)
	{
		// create 4-by-4 matrix array.
		int[][] matrix = new int[4][4];
		// populate it randomly with 1s and 0s.
		for(int column = 0; column < matrix.length; column++)
		{
			for(int row = 0; row < matrix[column].length; row++)
			{
				matrix[column][row] = (int)(Math.random() * 2);
			}
		}
		// print matrix to standard output.
		printMatrix(matrix);
		// find largest row index and display.
		System.out.printf("The largest row index: %d\n", largestRow(matrix));
		// find largest column index and display.
		System.out.printf("The largest column index: %d\n", largestColumn(matrix));
	}
	public static void printMatrix(int[][] matrix)
	{
		for(int[] column: matrix)
		{
			for(int row: column)
			{
				System.out.print(row);
			}
			System.out.println();
		}
	}
	public static int largestRow(int[][] matrix)
	{
		int largestRowIndex = 0;
		int largestRowValue = 0;
		for(int row = 0; row < matrix.length; row++)
		{
			int sum = 0;
			for(int col = 0; col < matrix[row].length; col++)
			{
				sum += matrix[row][col];
			}
			if(sum > largestRowValue)
			{
				largestRowIndex = row;
				largestRowValue = sum;
			}
		}
		return largestRowIndex;
	}
	public static int largestColumn(int[][] matrix)
	{
		int largestColIndex = 0;
		int largestColValue = 0;
		for(int col = 0; col < matrix[0].length; col++)
		{
			int sum = 0;
			for(int row = 0; row < matrix.length; row++)
			{
				sum += matrix[row][col];
			}
			if(sum > largestColValue)
			{
				largestColIndex = col;
				largestColValue = sum;
			}
		}
		return largestColIndex;
	}
}
