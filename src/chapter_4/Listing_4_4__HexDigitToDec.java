package chapter_4;

import java.util.Scanner;

public class Listing_4_4__HexDigitToDec {

	/*
The hexadecimal number system has 16 digits: 0–9, A–F. The letters A, B, C, D, E, and F
correspond to the decimal numbers 10, 11, 12, 13, 14, and 15. We now write a program that
prompts the user to enter a hex digit and display its corresponding decimal value, as shown
in Listing 4.4.
	 */

	public static void main(String[] args){

		// input
		long dec = 0;
		String hex;

		System.out.print("Please inter a hexadecimal value: ");
		Scanner input = new Scanner(System.in);
		hex = input.next();
		input.close();
		if (hex.length() > 15) System.out.println("Please decrease your hex value for accuracy.");

		// processing
		for(int i = hex.length() - 1; i >= 0; i--){
			if (hex.charAt(i) == '0') dec += Math.pow(16, i) * 0;
			else if (hex.charAt(i) == '1') dec += Math.pow(16, i) * 1;
			else if (hex.charAt(i) == '2') dec += Math.pow(16, i) * 2;
			else if (hex.charAt(i) == '3') dec += Math.pow(16, i) * 3;
			else if (hex.charAt(i) == '4') dec += Math.pow(16, i) * 4;
			else if (hex.charAt(i) == '5') dec += Math.pow(16, i) * 5;
			else if (hex.charAt(i) == '6') dec += Math.pow(16, i) * 6;
			else if (hex.charAt(i) == '7') dec += Math.pow(16, i) * 7;
			else if (hex.charAt(i) == '8') dec += Math.pow(16, i) * 8;
			else if (hex.charAt(i) == '9') dec += Math.pow(16, i) * 9;
			else if (hex.toUpperCase().charAt(i) == 'A') dec += Math.pow(16, i) * 10;
			else if (hex.toUpperCase().charAt(i) == 'B') dec += Math.pow(16, i) * 11;
			else if (hex.toUpperCase().charAt(i) == 'C') dec += Math.pow(16, i) * 12;
			else if (hex.toUpperCase().charAt(i) == 'D') dec += Math.pow(16, i) * 13;
			else if (hex.toUpperCase().charAt(i) == 'E') dec += Math.pow(16, i) * 14;
			else if (hex.toUpperCase().charAt(i) == 'F') dec += Math.pow(16, i) * 15;
			else System.out.print("\nInvalid character \"" + hex.charAt(i) + "\" at " + i + "");
		}
		
		// output
		if (dec == 9223372036854775807L) System.out.println("results out of range");
		else if (!(dec == 9223372036854775807L)) 
			System.out.printf("\n\"%s\" in decimal is \"%d\"\n", hex, dec);
		
	}
}

// Completed on 3/28/2016 by William ODieLag Pennington;