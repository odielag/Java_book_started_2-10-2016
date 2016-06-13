package chapter_7;

/**
 * (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
 * on a chessboard such that no two queens can attack each other (i.e., no two
 * queens are on the same row, same column, or same diagonal). There are many
 * possible solutions. Write a program that displays one such solution. A sample
 * output is shown below:
 *  
 * |Q| | | | | | | | 
 * 
 * | | | | |Q| | | |
 *  
 * | | | | | | | |Q|
 * 
 * | | | | | |Q| | | 
 * 
 * | | |Q| | | | | | 
 * 
 * | | | | | | |Q| | 
 * 
 * | |Q| | | | | | | 
 * 
 * | | | |Q| | | | |
 * 
 * @author William ODieLag Pennington
 * @version 1.1
 * @since 2016-6-8
 *
 */

public class Exercise_7_22__EightQueensGame
{
	public static boolean[][] board = new boolean[8][8]; // first index is
															// horizontal/row.
	public static boolean[][] tryArray = new boolean[8][8];

	public static void main(String[] args)
	{
		eightQueensGame();
	}

	public static void eightQueensGame()
	{
		int queensPlaced = 0;
		while (queensPlaced != 8)
		{
			// generate random horizontal and vertical index.
			int horizontal = (int) (Math.random() * board.length);
			int vertical = (int) (Math.random() * board.length);
			// if it doesn't interfere then put queen there using true.
			if (!doesItInterfere(horizontal, vertical))
			{
				board[horizontal][vertical] = true;
				++queensPlaced;
			}
			// checking if everything has been tried
			int tried = 0;
			for (int yTry = 0; yTry < tryArray[0].length; ++yTry)
			{
				for (int xTry = 0; xTry < tryArray.length; ++xTry)
				{
					if (tryArray[xTry][yTry])
						++tried;
				}
			}
			// if so, reset the arrays.
			if (tried == 8 * 8 && queensPlaced != 8)
			{
				boolean[][] newArrayOne = new boolean[8][8];
				boolean[][] newArrayTwo = new boolean[8][8];
				board = newArrayOne;
				tryArray = newArrayTwo;
				queensPlaced = 0;
			}

		}
		displayBoard(board);
	}

	// incremental placement doesn't work.

	public static boolean doesItInterfere(int x, int y)
	{
		// make true on tryArray where horizontal and vertical
		tryArray[x][y] = true;
		// vertically up
		if(doesItInterfereDirection(x, y, 0, 1))
			return true;
		// vertical down
		if(doesItInterfereDirection(x, y, 0, -1))
			return true;
		// horizontally right
		if(doesItInterfereDirection(x, y, 1, 0))
			return true;
		// horizontally left
		if(doesItInterfereDirection(x, y, -1, 0))
			return true;
		// diagonally up and right
		if(doesItInterfereDirection(x, y, 1, 1))
			return true;
		// diagonally up and left
		if(doesItInterfereDirection(x, y, -1, 1))
			return true;
		// diagonally down and right
		if(doesItInterfereDirection(x, y, 1, -1))
			return true;
		// diagonally down and left
		if(doesItInterfereDirection(x, y, -1, -1))
			return true;
		return false;
	}

	// doesItInterfereDirection
	public static boolean doesItInterfereDirection(int x, int y, int xDirection, int yDirection)
	{
		while (x < board.length && x >= 0 && y < board[0].length && y >= 0)
		{
			if (board[x][y])
				return true;
			x += xDirection;
			y += yDirection;
		}
		return false;
	}
	public static void displayBoard(boolean[][] board)
	{

		// code to display a board with '|' and 'Q'.
		for (int y = 0; y < board[0].length; ++y)
		{
			for (int x = 0; x < board.length;)
			{
				if (x == 0)
					System.out.print("|");
				if (board[x][y])
					System.out.print("Q|");
				else
					System.out.print(" |");
				++x;
				if (x % 8 == 0 && x != 0)
					System.out.print("\n");
			}
		}
		System.out.println();
	}
}
