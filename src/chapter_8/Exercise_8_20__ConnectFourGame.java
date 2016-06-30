package chapter_8;

import java.util.Scanner;

/**
 * <h1>(Game: connect four)</h1> Connect four is a two-player board game in
 * which the players alternately drop colored disks into a seven-column, six-row
 * vertically suspended grid, as shown below.
 * 
 * The objective of the game is to connect four same-colored disks in a row, a
 * col- umn, or a diagonal before your opponent can do likewise. The program
 * prompts two players to drop a red or yellow disk alternately. In the
 * preceding figure, the red disk is shown in a dark color and the yellow in a
 * light color. Whenever a disk is dropped, the program redisplays the board on
 * the console and determines the status of the game (win, draw, or continue).
 * 
 * @author William ODieLag Pennington
 * @version 0.1
 * @since 2016-6-26
 *
 */

public class Exercise_8_20__ConnectFourGame
{
	public static char[][] slots = new char[6][7];
	public static boolean won = false;
	public static boolean redsNotYellowsTurn = true;

	public static void main(String[] args)
	{
		startConnectFour();
	}

	public static void startConnectFour()
	{
		// create board method.
		createBoard();
		while (!won)
		{
			// display board method.
			displayBoard();
			// ask user for input and if possible take input and add it to
			// board.
			displayText();
			// take input and add it to board method.
			inputMethod();
			// check if there are 4 in a row anywhere.
			checkIfWon();
			if (won)
				break;
			if (redsNotYellowsTurn)
				redsNotYellowsTurn = false;
			else
				redsNotYellowsTurn = true;
		}
		displayBoard();
		displayWhoWon();
	}

	public static void createBoard()
	{
		// two for loops to put all spaces in slots array.
		for (int row = 0; row < slots.length; row++)
		{
			for (int column = 0; column < slots[row].length; column++)
			{
				slots[row][column] = ' ';
			}
		}
	}

	public static void displayBoard()
	{
		for (int row = 0; row < slots.length; row++)
		{
			for (int column = 0; column < slots[row].length; column++)
			{
				if (column == 0)
					System.out.print("|");
				System.out.printf("%c|", slots[row][column]);
			}
			System.out.println();
		}
		for (int column = 0; column < slots[slots.length - 1].length; column++)
		{
			if (column == 0)
				System.out.print("-");
			System.out.print("--");
		}
		System.out.println();
	}

	public static void displayText()
	{
		if (redsNotYellowsTurn)
			System.out.print("Drop a red disk at column (0–6): ");
		else
			System.out.print("Drop a yellow disk at column (0–6): ");
	}

	public static void inputMethod()
	{
		Scanner input = new Scanner(System.in);
		int chosenColumn = input.nextInt();
		while (!(chosenColumn >= 0 && chosenColumn <= 6))
		{
			System.out.printf("\nWrong input, try again: ");
			chosenColumn = input.nextInt();
		}
		while (!checkIfColumnIsFree(chosenColumn))
		{
			System.out.printf("\nColumn is not empty, try again: ");
			chosenColumn = input.nextInt();
		}
		drop(chosenColumn);
		// input.close();
	}

	public static boolean checkIfColumnIsFree(int chosenColumn)
	{
		if (slots[0][chosenColumn] != ' ')
			return false;
		else
			return true;
	}

	public static void drop(int chosenColumn)
	{
		for (int row = slots.length - 1; row >= 0; row--)
		{
			if (slots[row][chosenColumn] != ' ')
				continue;
			else if (redsNotYellowsTurn)
			{
				slots[row][chosenColumn] = 'R';
				break;
			} else
			{
				slots[row][chosenColumn] = 'Y';
				break;
			}
		}
	}

	public static void checkIfWon()
	{
		// check if there are 4 in a row and if so break the !won while loop.
		int R = 0;
		int Y = 0;
		// horizontal.
		for (int row = 0; row < slots.length; row++)
		{
			for (int column = 0; column < slots[row].length; column++)
			{
				if (slots[row][column] == ' ')
				{
					Y = 0;
					R = 0;
				} else if (slots[row][column] == 'R')
				{
					Y = 0;
					++R;
					if (R == 4)
					{
						won = true;
						// System.out.print("\nRed won, testing output\n");
					}
				} else if (slots[row][column] == 'Y')
				{
					R = 0;
					++Y;
					if (Y == 4)
					{
						won = true;
						// System.out.print("\nYellow won, testing output\n");
					}
				} else
					System.out.printf("\nError in horizontal CheckIfWon method at row: %d column: %d", row, column);
			}
			Y = 0;
			R = 0;
		}
		// vertical.
		for (int column = 0; column < slots[0].length; column++)
		{
			for (int row = 0; row < slots.length; row++)
			{
				if (slots[row][column] == ' ')
				{
					Y = 0;
					R = 0;
				} else if (slots[row][column] == 'R')
				{
					Y = 0;
					++R;
					if (R == 4)
					{
						won = true;
					}
				} else if (slots[row][column] == 'Y')
				{
					R = 0;
					++Y;
					if (Y == 4)
					{
						won = true;
					}
				} else
					System.out.printf("\nError in horizontal CheckIfWon method at row: %d column: %d", row, column);
			}
			Y = 0;
			R = 0;
		}
		// direction of inner loop is up right.
		int[][] upRightStarts = {
				{3, 0},
				{4, 0},
				{5, 0},
				{5, 1},
				{5, 2},
				{5, 3},
		};
		for(int starts = 0; starts < upRightStarts.length && !won; starts++)
		{
			int row = upRightStarts[starts][0];
			int column = upRightStarts[starts][1];
			while(row >= 0 && column < slots[row].length && !won){
				if (slots[row][column] == ' ')
				{
					Y = 0;
					R = 0;
				} else if (slots[row][column] == 'R')
				{
					Y = 0;
					++R;
					if (R == 4)
					{
						won = true;
					}
				} else if (slots[row][column] == 'Y')
				{
					R = 0;
					++Y;
					if (Y == 4)
					{
						won = true;
					}
				} else
					System.out.printf("\nError in horizontal CheckIfWon method at row: %d column: %d", row, column);
				row--;
				column++;
			}
		}
		// direction of inner loop is down right.
		int[][] downRightStarts = {
				{2, 0},
				{1, 0},
				{0, 0},
				{0, 1},
				{0, 2},
				{0, 3},
		};
		for(int starts = 0; starts < downRightStarts.length && !won; starts++)
		{
			int row = downRightStarts[starts][0];
			int column = downRightStarts[starts][1];
			while(row < slots.length && column < slots[row].length && !won){
				if (slots[row][column] == ' ')
				{
					Y = 0;
					R = 0;
				} else if (slots[row][column] == 'R')
				{
					Y = 0;
					++R;
					if (R == 4)
					{
						won = true;
					}
				} else if (slots[row][column] == 'Y')
				{
					R = 0;
					++Y;
					if (Y == 4)
					{
						won = true;
					}
				} else
					System.out.printf("\nError in horizontal CheckIfWon method at row: %d column: %d", row, column);
				row++;
				column++;
			}
		}
	}

	public static void displayWhoWon()
	{
		if (redsNotYellowsTurn)
			System.out.print("\nThe red player won");
		else
			System.out.print("\nThe yellow player won");

	}
}
