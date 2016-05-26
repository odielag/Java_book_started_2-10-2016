package chapter_6;

/**
 * <h1>(Game: chance of winning at craps)</h1> Revise Exercise 6.30 to run it
 * 10,000 times and display the number of winning games.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-26
 *
 */

public class Exercise_6_32__ChanceOfWinningAtCraps
{
	/** main method for testing and initializing */
	public static void main(String[] args)
	{
		int win = 0;
		int loss = 0;
		for (int i = 0; i < 10000; i++)
		{
			if (craps())
				win++;
			else
				loss++;
		}
		System.out.printf("Wins: %d\nLosses: %d", win, loss);
	}

	/** craps method for random generation, tally and print */
	public static boolean craps()
	{
		/*
		 * creating two dice and randomizing an integer from/including 1
		 * to/including 6. evaluate if it won(natural), lost(craps) or set a
		 * point(other). If it set a point roll until it gets that point (win)
		 * or gets a sum of 7 (loss).
		 */
		int dice1 = (int) (6 * Math.random() + 1);
		int dice2 = (int) (6 * Math.random() + 1);
		int sum1 = dice1 + dice2;
		int sum2 = -1; // sum2 in a more global range for else below.
		System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum1);
		// craps if
		if (sum1 == 2 || sum1 == 3 || sum1 == 12)
		{
			System.out.printf("You lose\n");
			return false;
		}
		// natural if
		else if (sum1 == 7 || sum1 == 11)
		{
			System.out.printf("You win\n");
			return true;
		} else
		{
			while (sum1 != sum2 && sum2 != 7)
			{
				System.out.printf("point is %d\n", sum1);
				dice1 = (int) (6 * Math.random() + 1);
				dice2 = (int) (6 * Math.random() + 1);
				sum2 = dice1 + dice2;
				System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum2);
				if (sum1 == sum2)
				{
					System.out.printf("You win\n");
					return true;
				} else if (sum2 == 7)
				{
					System.out.printf("You lose\n");
					return false;
				}
			}
			return false;		// just to eliminate a method error.
		}
	}
}
