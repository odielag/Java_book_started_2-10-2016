package chapter_8;

import java.util.Scanner;

/**
 * <h1>(Latin square)</h1> A Latin square is an n-by-n array filled with n different Latin let-
ters, each occurring exactly once in each row and once in each column. Write a
program that prompts the user to enter the number n and the array of characters,
as shown in the sample output, and checks if the input array is a Latin square.
The characters are the first n characters starting from A .

Enter number n: 4
Enter 4 rows of letters separated by spaces:
A B C D
B A D C
C D B A
D C A B
The input array is a Latin square

Enter number n: 3
Enter 3 rows of letters separated by spaces:
A F D
Wrong input: the letters must be from A to C
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-7-6
 *
 */
public class Exercise_8_36__LatinSquare
{
	public static void main(String[] args)
	{
		latinSquare();		
	}
	public static void latinSquare()
	{
		// scanner input
		Scanner input = new Scanner(System.in);
		// ask user for number n
		System.out.print("Enter number n: ");
		// capture inputed number and save n
		int n = input.nextInt();
		// create matrix of size n by n.
		char[][] matrix = new char[n][n];
		// ask user to enter n rows of letters.
		System.out.printf("Enter %d rows of letters separated by spaces:\n", n);
		// check every horizontal line after it's entered to see if it's a latin square.
		for(int row = 0; row < matrix.length; row++)
		{
			for(int column = 0; column < matrix[row].length; column++)
			{
				matrix[row][column] = input.next().charAt(0);
				// check that the input is within the proper range.
				if(matrix[row][column] < 'A' || matrix[row][column] > 'A' + n - 1)
				{
					System.out.printf("Wrong input: the letters must be from %c to %c\n", 'A', 'A' + n - 1);
					System.exit(-1);
				}
			}
		}
		// check if it is a Latin square.
		System.out.printf("The input array is %sa Latin square", 
				latinSquareCheck(matrix)?"":"not ");
		// print if the input is a Latin square or not.
		input.close();
	}
	public static boolean latinSquareCheck(char[][] matrix)
	{
		// create boolean array of size n-by-n.
		boolean[] charCheck = new boolean[matrix.length];
		// loop through array and for each (char - 'A') and check if index...
		// ... is already true (then return false). If not, true it.
		/// looping through different rows.
		for(int row = 0; row < matrix.length; row++)
		{
			// loop through to true the charCheck array.
			for(int column = 0; column < matrix[row].length; column++)
			{
				if(charCheck[matrix[row][column] - 'A'])
					return false;
				else
					charCheck[matrix[row][column] - 'A'] = true;
			}
			// clean charCheck array by making all false.
			for(int makingFalse = 0; makingFalse < charCheck.length; makingFalse++)
			{
				charCheck[makingFalse] = false;
			}
		}
		/// looping through different columns.
		for(int column = 0; column < matrix[0].length; column++)
		{
			for(int row = 0; row < matrix.length; row++)
			{
				if(charCheck[matrix[row][column] - 'A'])
					return false;
				else
					charCheck[matrix[row][column] - 'A'] = true;
			}
			// clean charCheck array by making all false.
			for(int makingFalse = 0; makingFalse < charCheck.length; makingFalse++)
			{
				charCheck[makingFalse] = false;
			}
		}
		// If after gone through the whole loop then return true.
		return true;
	}
}
