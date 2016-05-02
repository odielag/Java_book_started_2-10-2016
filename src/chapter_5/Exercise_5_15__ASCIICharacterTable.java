package chapter_5;

/**
 * <h1>(Display the ASCII character table)</h1> Write a program that prints the
 * characters in the ASCII character table from ! to ~ . Display ten characters
 * per line. The ASCII table is shown in Appendix B. Characters are separated by
 * exactly one space.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-1
 */

public class Exercise_5_15__ASCIICharacterTable
{
	public static void main(String[] args)
	{
		// Decleare int outputCount and initialize to 0;
		// Create character i intialize at '!' and stop loop at '~'
		// Display character then space and increment outputCount
		// If outputCount % 10 == 0 then println

		int outputCount = 0;
		for (char i = '!'; i <= '~'; i++)
		{
			System.out.printf("%c ", i);
			++outputCount;
			if (outputCount % 10 == 0)
				System.out.println();
		}
	}
}
