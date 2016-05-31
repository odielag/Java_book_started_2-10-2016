package chapter_7;

import chapter_6.Listing_6_10__RandomCharacter;

/**
 * The program given in Listing 7.4 does the following:
 * 
 * 1. Generates 100 lowercase letters randomly and assigns them to an array of
 * characters, as shown in Figure 7.7a. You can obtain a random letter by using
 * the getRandomLower- CaseLetter() method in the RandomCharacter class in
 * Listing 6.10.
 * 
 * 2. Count the occurrences of each letter in the array. To do so, create an
 * array, say counts , of 26 int values, each of which counts the occurrences of
 * a letter, as shown in Figure 7.7b. That is, counts[0] counts the number of a
 * ’s, counts[1] counts the number of b ’s, and so on.
 * 
 * FIGURE 7.7 The chars array stores 100 characters, and the counts array stores
 * 26 counts, each of which counts the occurrences of a letter.
 * 
 * Listing_6_10__RandomCharacter.getRandomLowerCaseLetter()
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-31
 *
 */

public class Listing_7_4__CountLettersInArray
{
	/** main method for intializing and testing */
	public static void main(String[] args)
	{
		// create an array "chars" with random chars. 100 long.
		char[] chars = new char[100];

		// fill chars array with random lowercased characters

		System.out.println("The lowercase letters are:");
		for (int i = 0; i < chars.length; i++)
		{
			if(i % 20 == 0 && i != 0)
				System.out.println();
			chars[i] = Listing_6_10__RandomCharacter.getRandomLowerCaseLetter();
			System.out.printf("%c ", chars[i]);
		}
		
		System.out.println();
		System.out.println();
		
		// create an int array called "counts" length 26.
		int[] counts = new int[26];

		// loop that takes the char value and subtracts by 'a'
		// to increment indexe/elements of "counts" array
		for (int i = 0; i < chars.length; i++)
		{
			++counts[chars[i] - 'a'];
		}

		// loop to display character count of "counts" array
		System.out.println("The occurrences of each letter are:");
		for (int i = 0; i < counts.length; i++)
		{
			if(i % 10 == 0 && i != 0)
				System.out.println();
			System.out.printf("%c %d ", 'a' + i, counts[i]);
		}
	}
}
