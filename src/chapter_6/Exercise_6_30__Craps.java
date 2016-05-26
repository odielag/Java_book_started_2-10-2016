package chapter_6;

/**
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
 * to play a variation of the game, as follows: Roll two dice. Each die has six
 * faces representing values 1, 2, ..., and 6, respec- tively. Check the sum of
 * the two dice. If the sum is 2, 3, or 12 (called craps), you lose; if the sum
 * is 7 or 11 (called natural), you win; if the sum is another value (i.e., 4,
 * 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until
 * either a 7 or the same point value is rolled. If 7 is rolled, you lose.
 * Otherwise, you win. Your program acts as a single player. Here are some
 * sample runs.
 * 
 * You rolled 5 + 6 = 11 You win
 * 
 * You rolled 1 + 2 = 3 You lose
 * 
 * You rolled 4 + 4 = 8 point is 8 You rolled 6 + 2 = 8 You win
 * 
 * You rolled 3 + 2 = 5 point is 5 You rolled 2 + 5 = 7 You lose
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-05-26
 *
 */

public class Exercise_6_30__Craps
{
	/** main method for testing and initializing */
	public static void main(String[] args)
	{
		craps();
	}

	/** craps method for random generation, tally and print */
	public static void craps()
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
			System.out.printf("You lose\n");
		// natural if
		else if (sum1 == 7 || sum1 == 11)
			System.out.printf("You win\n");
		else
		{
			while (sum1 != sum2 && sum2 != 7)
			{
				System.out.printf("point is %d\n", sum1);
				dice1 = (int) (6 * Math.random() + 1);
				dice2 = (int) (6 * Math.random() + 1);
				sum2 = dice1 + dice2;
				System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum2);
				if (sum1 == sum2)
					System.out.printf("You win\n");
				else if (sum2 == 7)
					System.out.printf("You lose\n");
			}
		}
	}
}
