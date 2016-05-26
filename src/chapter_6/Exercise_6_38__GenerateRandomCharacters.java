package chapter_6;

import chapter_6.Listing_6_10__RandomCharacter;

/**
 * <h1>(Generate random characters)</h1> Use the methods in RandomCharacter in
 * Listing 6.10 to print 100 uppercase letters and then 100 single digits,
 * printing ten per line.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-26
 *
 */

// Listing_6_10__RandomCharacter.getRandomUpperCaseLetter()
// Listing_6_10__RandomCharacter.getRandomDigitCharacter()

public class Exercise_6_38__GenerateRandomCharacters
{
	/** main method */
	public static void main(String[] args)
	{
		for(int i = 1; i <= 100; i++)
		{
			System.out.printf("%c", Listing_6_10__RandomCharacter.getRandomUpperCaseLetter());
			if (i % 10 == 0)
				System.out.println();
		}
		for(int i = 1; i <= 100; i++)
		{
			System.out.printf("%c", Listing_6_10__RandomCharacter.getRandomDigitCharacter());
			if (i % 10 == 0)
				System.out.println();
		}
	}
}
