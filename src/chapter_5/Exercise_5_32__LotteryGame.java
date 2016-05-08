package chapter_5;

/**
 * <h1>(Game: lottery)</h1> Revise Listing 3.8, Lottery.java, to generate a
 * lottery of a two- digit number. The two digits in the number are distinct.
 * (Hint: Generate the first digit. Use a loop to continuously generate the
 * second digit until it is different from the first digit.)
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-7
 */

public class Exercise_5_32__LotteryGame
{
	public static void main(String[] args)
	{
		int leftDigit, rightDigit;
		rightDigit = (int)(Math.random() * 10);
		do
		{
			leftDigit = (int)(Math.random() * 10);
		} while (leftDigit == rightDigit);
		System.out.printf("The lottery number is: %s", 
				Integer.toString(leftDigit).concat(Integer.toString(rightDigit)));
	}
}
