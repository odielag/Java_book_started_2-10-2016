package testing;

/**
 * <h1>(Business application: checking ISBN )</h1> Use loops to simplify
 * Programming Exercise 3.9.
 * 
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-7
 *
 */

public class Exercise_5_36__CheckingISBN
{

	/*
	 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
	 * consists of 10 digits: d1 d2 d3 d4 d5 d6 d7 d8 d9 d10 . The last digit, d
	 * 10 , is a checksum, which is calculated from the other nine digits using
	 * the following formula:
	 * 
	 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 +
	 * d9 * 9) % 11;
	 * 
	 * If the checksum is 10 , the last digit is denoted as X according to the
	 * ISBN-10 convention. Write a program that prompts the user to enter the
	 * first 9 digits and displays the 10-digit ISBN (including leading zeros).
	 * Your program should read the input as an integer. Here are sample runs:
	 * 
	 * Enter the first 9 digits of an ISBN as integer: 013601267 
	 * The ISBN-10 number is 0136012671
	 * 
	 * Enter the first 9 digits of an ISBN as integer: 013031997 
	 * The ISBN-10 number is 013031997X
	 */

	public static void main(String[] args)
	{

		// input
		int integers;
		int integersBak;
		String iSBN10;
		int[] d = new int[9];
		String lastDigitStr;
		int lastDigitInt;

		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		integers = input.nextInt();
		integersBak = integers;
		for (int i = 8; i >= 0; i--)
		{
			d[i] = integers % 10;
			integers /= 10;
		}
		input.close();

		// processing
		lastDigitInt = ((d[0] * 1 + d[1] * 2 + d[2] * 3 + d[3] * 4 + d[4] * 5 + d[5] * 6 + d[6] * 7 + d[7] * 8
				+ d[8] * 9) % 11);
		if (lastDigitInt == 10)
			lastDigitStr = "X";
		else
			lastDigitStr = String.valueOf(lastDigitInt);
		iSBN10 = integersBak + lastDigitStr;

		// output
		System.out.printf("%s", iSBN10);
	}
}
