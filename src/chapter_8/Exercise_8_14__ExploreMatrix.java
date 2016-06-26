package chapter_8;

import java.util.Scanner;

/**
 * <h1>(Explore matrix)</h1> Write a program that prompts the user to enter the
 * length of a square matrix, randomly fills in 0 s and 1 s into the matrix,
 * prints the matrix, and finds the rows, columns, and diagonals with all 0 s or
 * 1 s. Here is a sample run of the program:
 * 
 * Enter the size for the matrix: 4
 * 
 * 0111
 * 
 * 0000
 * 
 * 0100
 * 
 * 1111
 * 
 * All 0s on row 1
 * 
 * All 1s on row 3
 * 
 * No same numbers on a column
 * 
 * No same numbers on the major diagonal
 * 
 * No same numbers on the sub-diagonal
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-25
 */

public class Exercise_8_14__ExploreMatrix
{
	// public main
	public static void main(String[] args)
	{
		createMatrix();
	}

	// create matrix method
	public static void createMatrix()
	{
		System.out.print("Enter the size for the matrix: ");
		Scanner input = new Scanner(System.in);
		int matrixSize = input.nextInt();
		int[][] matrix = new int[matrixSize][matrixSize];
		input.close();
		randomFill(matrix);
	}

	// random fill method
	public static void randomFill(int[][] matrix)
	{
		for (int row = 0; row < matrix.length; row++)
		{
			for (int column = 0; column < matrix[row].length; column++)
			{
				matrix[row][column] = (int) (Math.random() * 2);
			}
		}
		printMatrix(matrix);
	}

	// print matrix method
	public static void printMatrix(int[][] matrix)
	{
		for (int[] row : matrix)
		{
			for (int column : row)
			{
				System.out.print(column);
			}
			System.out.println();
		}
		evaluateMatrix(matrix);
	}

	// evaluate 0s and 1s method
	public static void evaluateMatrix(int[][] matrix)
	{
		// evaluate rows with columns
		boolean foundrow = false;
		for (int row = 0; row < matrix.length; row++)
		{
			int sum = 0;
			for (int column = 0; column < matrix[row].length; column++)
			{
				sum += matrix[row][column];
			}
			if (sum == 0)
			{
				System.out.printf("All 0s on row %d\n", row);
				foundrow = true;
			}
			if (sum == matrix.length)
			{
				System.out.printf("All 1s on row %d\n", row);
				foundrow = true;
			}
		}
		if (!foundrow)
			System.out.println("No same numbers on a row");
		// evluate columns with rows
		boolean foundColumn = false;
		for (int column = 0; column < matrix[0].length; column++)
		{
			int sum = 0;
			for (int row = 0; row < matrix.length; row++)
			{
				sum += matrix[row][column];
			}
			if (sum == 0)
			{
				System.out.printf("All 0s on column %d\n", column);
				foundColumn = true;
			}
			if (sum == matrix.length)
			{
				System.out.printf("All 1s on column %d\n", column);
				foundColumn = true;
			}
		}
		if (!foundColumn)
			System.out.println("No same numbers in a column");
		// evaluate major diagonal direction:down/right
		boolean majorDiagonal = false;
		int sum = 0;
		for (int rowAndColumn = 0; rowAndColumn < matrix.length; rowAndColumn++)
		{
			sum += matrix[rowAndColumn][rowAndColumn];
		}
		if (sum == 0)
		{
			System.out.printf("All 0s on major diagonal down/right\n");
			majorDiagonal = true;
		}
		if (sum == matrix.length)
		{
			System.out.printf("All 0s on major diagonal down/right\n");
			majorDiagonal = true;
		}
		// evaluate major diagonal direction:up/right
		sum = 0;
		for (int rowAndColumn = 0; rowAndColumn < matrix.length; rowAndColumn++)
		{
			sum += matrix[matrix.length - 1 - rowAndColumn][rowAndColumn];
		}
		if (sum == 0)
		{
			System.out.printf("All 0s on major diagonal up/right\n");
			majorDiagonal = true;
		}
		if (sum == matrix.length)
		{
			System.out.printf("All 1s on major diagonal up/right\n");
			majorDiagonal = true;
		}
		if (!majorDiagonal)
		{
			System.out.println("No same numbers on a major diagonal");
		}
		// evaluate sub-diagonal direction down/right starting at 1,0 ...
		// and going down to matrix.length - 1, 0
		boolean subDiagonal = false;
		int ones = 0;
		int zeroes = 0;
		for (int row = 1; row < matrix.length - 1; row++)
		{
			ones = 0;
			zeroes = 0;
			for (int incremental = 0; row + incremental < matrix.length; incremental++)
			{
				if (matrix[row + incremental][incremental] == 0)
					zeroes++;
				else if (matrix[row + incremental][incremental] == 1)
					ones++;
			}
			if (zeroes > 1 && ones == 0)
			{
				System.out.printf("All 0s on minor diagonal row %d down/right\n", row);
				subDiagonal = true;
			}
			if (ones > 1 && zeroes == 0)
			{
				System.out.printf("All 1s on minor diagonal row %d down/right\n", row);
				subDiagonal = true;
			}
		}
		// evaluate sub-diagonal direction up/right starting at 1,0 ...
		// and going down to matrix.length - 1, 0
		for (int row = 1; row < matrix.length - 1; row++)
		{
			ones = 0;
			zeroes = 0;
			for (int incremental = 0; row - incremental >= 0; incremental++)
			{
				if (matrix[row - incremental][incremental] == 0)
					zeroes++;
				else if (matrix[row - incremental][incremental] == 1)
					ones++;
			}
			if (zeroes > 1 && ones == 0)
			{
				System.out.printf("All 0s on minor diagonal row %d up/right\n", row);
				subDiagonal = true;
			}
			if (ones > 1 && zeroes == 0)
			{
				System.out.printf("All 1s on minor diagonal row %d up/right\n", row);
				subDiagonal = true;
			}
		}
		// evaluate sub-diagonal direction up/right starting at matrix.length -
		// 1,1 and going right until row < matrix.length - 1.
		for (int column = 1; column < matrix.length - 1; column++)
		{
			int row = matrix.length - 1;
			ones = 0;
			zeroes = 0;
			for (int incremental = 0; row - incremental > 0 && column + incremental < matrix.length; incremental++)
			{
				if (matrix[row - incremental][column + incremental] == 0)
					zeroes++;
				else if (matrix[row - incremental][column + incremental] == 1)
					ones++;
			}
			if (zeroes > 1 && ones == 0)
			{
				System.out.printf("All 0s on minor diagonal column %d up/right\n", column);
				subDiagonal = true;
			}
			if (ones > 1 && zeroes == 0)
			{
				System.out.printf("All 1s on minor diagonal column %d up/right\n", column);
				subDiagonal = true;
			}
		}
		// evaluate sub-diagonal direction down/right at 0, 1 and end outside
		// ... loop at 0, (column) < matrix.length - 1.
		// ... 2 things need to change. initial row and direction of increment.
		for (int column = 1; column < matrix.length - 1; column++)
		{
			int row = 0;
			ones = 0;
			zeroes = 0;
			for (int incremental = 0; row + incremental < matrix.length - 1
					&& column + incremental < matrix.length; incremental++)
			{
				if (matrix[row + incremental][column + incremental] == 0)
					zeroes++;
				else if (matrix[row + incremental][column + incremental] == 1)
					ones++;
			}
			if (zeroes > 1 && ones == 0)
			{
				System.out.printf("All 0s on minor diagonal column %d down/right\n", column);
				subDiagonal = true;
			}
			if (ones > 1 && zeroes == 0)
			{
				System.out.printf("All 1s on minor diagonal column %d down/right\n", column);
				subDiagonal = true;
			}
		}
		// print if there were no sub-diagonals.
		if (!subDiagonal)
		{
			System.out.println("No same numbers on a sub-diagonal");
		}
	}
}
