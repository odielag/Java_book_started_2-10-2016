package chapter_8;

/**
 * <h1>(Check Sudoku solution)</h1> Listing 8.4 checks whether a solution is
 * valid by check- ing whether every number is valid in the board. Rewrite the
 * program by checking whether every row, every column, and every small box has
 * the numbers 1 to 9.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-7-2
 *
 */

public class Exercise_8_24__CheckSudokuSolution
{
	public static void main(String[] args)
	{
		// create a 9 by 9 int array named board from listing 8.4
		int[][] board =
		{
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 },
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 },
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 },
				{ 4, 2, 6, 8, 5, 3, 7, 9, 1 },
				{ 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 },
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 },
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		// send it to validityCheck method
		System.out.printf("The board is %s\n", (validityCheck(board)) ? "Valid" : "Invalid");
	}

	public static boolean validityCheck(int[][] board)
	{
		return (horizontalCheck(board) && verticalCheck(board) && subsquareCheck(board));
	}

	// horizontal checks
	public static boolean horizontalCheck(int[][] board)
	{
		for (int row = 0; row < board.length; row++)
		{
			// making an array to temp store numbers 1-9 to check if they are
			// all there.
			boolean[] numbers = new boolean[board[row].length];
			for (int i = 0; i < numbers.length; i++)
			{
				numbers[i] = false;
			}
			for (int column = 0; column < board[row].length; column++)
			{
				numbers[board[row][column] - 1] = true;
			}
			// insert check loop to see if all numbers are there
			for (int i = 0; i < numbers.length; i++)
			{
				if (!numbers[i])
				{
					// System.out.println("During horizontal numbers check
					// number " + i + " is missing.");
					return false;
				}
			}
		}
		return true;
	}

	public static boolean verticalCheck(int[][] board)
	{
		// vertical checks
		for (int column = 0; column < board[0].length; column++)
		{
			// making an array to temp store numbers 1-9 to check if they are
			// all there.
			boolean[] numbers = new boolean[board.length];
			for (int i = 0; i < numbers.length; i++)
			{
				numbers[i] = false;
			}
			for (int row = 0; row < board.length; row++)
			{
				numbers[board[row][column] - 1] = true;
			}
			// insert check loop to see if all numbers are there
			for (int i = 0; i < numbers.length; i++)
			{
				if (!numbers[i])
				{
					// System.out.println("During vertical numbers check number
					// " + i + " is missing.");
					return false;
				}
			}
		}
		return true;
	}

	// subsquare checks
	public static boolean subsquareCheck(int[][] board)
	{
		/// Going to specify the center of subsquare and work from that
		// horizontally and vertically.
		for (int row = 0; row * 3 + 1 < board.length; row++)
		{
			row = row * 3 + 1;
			for (int column = 0; column * 3 + 1 < board[row].length; column++)
			{
				column = column * 3 + 1;
				// sub-box movement
				boolean[] numbers = new boolean[board.length];
				for (int i = 0; i < numbers.length; i++)
				{
					numbers[i] = false;
				}
				for (int subrow = -1; subrow < 2; subrow++)
				{
					for (int subcolumn = -1; subcolumn < 2; subcolumn++)
					{
						numbers[board[row + subrow][column + subcolumn] - 1] = true;
					}
				}
				// insert check loop to see if all numbers are there
				for (int i = 0; i < numbers.length; i++)
				{
					if (!numbers[i])
					{
						// System.out.printf("During small boxes numbers check
						// nummber " + i + 1 +
						// " is missing in the subsquare of row " +
						// row + " and column " + column);
						return false;
					}
				}
			}
		}
		return true;
	}
}
