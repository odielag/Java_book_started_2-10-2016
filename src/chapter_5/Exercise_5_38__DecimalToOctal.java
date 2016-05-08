package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Decimal to octal)</h1> Write a program that prompts the user to enter a
 * decimal integer and displays its corresponding octal value. Don’t use Java’s
 * Integer .toOctalString(int) in this program.
 * 
 * @author William ODieLag Pennington
 * @version 1.1
 * @since 2016-5-7
 *
 */

public class Exercise_5_38__DecimalToOctal
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		long userNumber, userNumberProcessing;
		String octal = "";

		System.out.print("Please input the decimal number: ");
		userNumber = input.nextLong();
		userNumberProcessing = userNumber;
		while (userNumberProcessing != 0)
		{
			octal = Long.toString(userNumberProcessing % 8) + octal;
			userNumberProcessing /= 8;
		}
		System.out.printf("Octal number:\n%s\n", octal);
		input.close();
	}
}
