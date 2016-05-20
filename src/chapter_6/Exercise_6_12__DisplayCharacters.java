package chapter_6;

/**
 * <h1>(Display characters)</h1> Write a method that prints characters using the
 * following header:
 * 
 * public static void printChars(char ch1, char ch2, int numberPerLine)
 * 
 * This method prints the characters between ch1 and ch2 with the specified num-
 * bers per line. Write a test program that prints ten characters per line from
 * 1 to Z . Characters are separated by exactly one space.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-18
 *
 */

public class Exercise_6_12__DisplayCharacters
{
	/** main method to test printChars method */
	public static void main(String[] args)
	{
		printChars('1', 'Z', 10);
	}
	/** printChars prints chars from one character to another with spaces */
	public static void printChars(char ch1, char ch2, int numberPerLine)
	{
		// Make sure ch1 is lower than ch2
		// make a for loop starting at (int)ch1 and incrementing until int(ch2)
		// numberPerLine should be used at an if(i - (int)ch1 % numberPerLine == 0) println
		if((int)ch2 - (int)ch1 < 0)
			printChars(ch2, ch1, numberPerLine);
		for(int i = (int)ch1; i <= (int)ch2; i++)
		{
			System.out.printf("%c ", (char)i);
			if ((i - (int)ch1 + 1) % 10 == 0)
				System.out.println();
		}
	}
}
