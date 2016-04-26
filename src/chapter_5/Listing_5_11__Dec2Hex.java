package chapter_5;

import java.util.Scanner;

public class Listing_5_11__Dec2Hex
{

	/*
Listing 5.11 gives a program that prompts the user to enter a decimal number and converts
it into a hex number as a string.

Enter a decimal number: 1234
The hex number is 4D2
	 */

	public static void main(String[] args)
	{
		// input
		int decimal;
		Scanner input = new Scanner(System.in);
		String hex = "";
		String character = "";

		System.out.print("Enter a decimal number: ");
		decimal = input.nextInt();
		input.close();

		// processing
		while (decimal != 0)
		{
			switch (decimal % 16)
			{
			case 0: character = "0"; break;
			case 1: character = "1"; break;
			case 2: character = "2"; break;
			case 3: character = "3"; break;
			case 4: character = "4"; break;
			case 5: character = "5"; break;
			case 6: character = "6"; break;
			case 7: character = "7"; break;
			case 8: character = "8"; break;
			case 9: character = "9"; break;
			case 10: character = "A"; break;
			case 11: character = "B"; break;
			case 12: character = "C"; break;
			case 13: character = "D"; break;
			case 14: character = "E"; break;
			case 15: character = "F"; break;
			default: System.out.print("\n Error on character switch.\n");System.exit(-1);
			}
			
			hex = character + hex;
			decimal /= 16;
		}

		// output
		System.out.printf("The hex number is %s", hex);


		//System.out.println(1234 % 16);			// 2

	}

}
