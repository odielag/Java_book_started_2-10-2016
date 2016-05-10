package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Computer architecture: bit-level operations)</h1> A short value is
 * stored in 16 bits. Write a program that prompts the user to enter a short
 * integer and displays the 16 bits for the integer. Here are sample runs:
 * 
 * Enter an integer: 5 The bits are 0000000000000101
 * 
 * Enter an integer: -5 The bits are 1111111111111011
 * 
 * (Hint: You need to use the bitwise right shift operator ( >> ) and the
 * bitwise AND operator ( & ), which are covered in Appendix G, Bitwise
 * Operations.)
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-9
 *
 */

public class Exercise_5_44__BitLevelOperations
{
	public static void main(String[] args)
	{
		short number;
		String binary = "";
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter a digit between %d and %d: ", Integer.MAX_VALUE, Integer.MIN_VALUE);
		number = input.nextShort();

		if (number >= 0)
		{
			for (int i = 0; i < 15; i++)
			{
				if (number % 2 == 0)
				{
					binary = "0" + binary;
					number >>= 1;
				} else if (number % 2 == 1)
				{
					binary = "1" + binary;
					number >>= 1;
				} else
				{
					System.out.printf("\nerror in for statement when i = %d in positive loop", i);
					System.exit(-1);
				}
			}
		} else if (number <= -0)
		{
			for (int i = 0; i < 15; i++)
			{
				if (number % 2 == 0)
				{
					binary = "0" + binary;
					number >>= 1;
				} else if (number % 2 == -1)
				{
					binary = "1" + binary;
					number >>= 1;
				} else
				{
					System.out.printf("\nerror in for statement when i = %d in negative loop", i);
					System.exit(-1);
				}
			}
			binary = "1" + binary;
		}
		System.out.printf("Binary: %s", binary);
		input.close();
	}
}
