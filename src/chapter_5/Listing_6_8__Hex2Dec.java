package chapter_5;

import java.util.Scanner;

/**
 * Listing 5.11, Dec2Hex.java, gives a program that converts a decimal to a
 * hexadecimal. How would you convert a hex number into a decimal?
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-13
 *
 */

public class Listing_6_8__Hex2Dec
{
	public static void main(String[] args)
	{
		String hex;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a hexadecimal string: ");
		hex = input.next();
		System.out.printf("The decimal value for hex %s  is %d", hex, hex2Dec(hex));
		input.close();
	}

	public static long hex2Dec(String hexString)
	{
		hexString = hexString.toUpperCase();
		// loop to check that the hex string has all hex characters.
		for (int i = 0; i < hexString.length(); i++)
		{
			if ((hexString.charAt(i) >= '0' && hexString.charAt(i) <= '9')
					|| (hexString.charAt(i) >= 'A' && hexString.charAt(i) <= 'F'))
				continue;
			else
			{
				System.out.print("\nString is not a hex string. Exiting.\n");
				System.exit(-1);
			}
		}

		long decimalNumber = 0;
		// loop to convert the hex string to long decimalNumber.
		for (int i = 0; i < hexString.length(); i++)
		{
			decimalNumber += hexChar2Dec(hexString.charAt(i)) * Math.pow(16, hexString.length() - i - 1);
		}
		return decimalNumber;
	}

	public static int hexChar2Dec(char ch)
	{
		int dec;
		if (ch >= '0' && ch <= '9')
			dec = ch - '0';
		else
			dec = (ch - 'A') + 10;
		return dec;
	}
}
