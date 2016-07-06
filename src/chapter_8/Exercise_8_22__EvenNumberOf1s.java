package chapter_8;

/**
 * <h1>(Even number of 1s)</h1> Write a program that generates a 6-by-6 two-dimensional
matrix filled with 0s and 1s, displays the matrix, and checks if every row and
every column have an even number of 1s.
 * 
 * @author William ODieLag Pennington
 * @since 2016-7-2
 * @version 1.1
 */

public class Exercise_8_22__EvenNumberOf1s
{
	public static int[][] matrix = new int[6][6];
	public static void main(String[] args)
	{
		fillMatrix();
		displayMatrix();
		checkMatrix();
	}
	public static void fillMatrix()
	{
		for(int row = 0; row < matrix.length; row++)
		{
			for(int column = 0; column < matrix[row].length; column++)
			{
				matrix[row][column] = (int)(Math.random() * 2);
			}
		}
	}
	public static void displayMatrix()
	{
		for(int[] row:matrix)
		{
			for(int column:row)
			{
				System.out.print(column);
			}
			System.out.println();
		}
	}
	public static void checkMatrix()
	{
		int ones = 0;
		// for loops to count ones and see if a column has even ones.
		for(int row = 0; row < matrix.length; row++)
		{
			for(int column = 0; column < matrix[row].length; column++)
			{
				if(matrix[row][column] == 1)
					++ones;
			}
			if(ones % 2 == 0 && ones > 0)
				System.out.println("Row " + row + " has an even number of ones.");
			ones = 0;
		}
		// for loops to count ones and see if a row has even ones.
		for(int column = 0; column < matrix[0].length; column++)
		{
			for(int row = 0; row < matrix.length; row++)
			{
				if(matrix[row][column] == 1)
					++ones;
			}
			if(ones % 2 == 0 && ones > 0)
				System.out.println("Column " + column + " has an even number of ones.");
			ones = 0;
		}
	}
}
