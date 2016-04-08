package chapter_4;

import java.util.Scanner;

public class Exercise_4_12__HexToBinary {
	
	/*
(Hex to binary) Write a program that prompts the user to enter a hex digit and
displays its corresponding binary number. Here is a sample run:

Enter a hex digit: B
The binary value is 1011

Enter a hex digit: G
G is an invalid input
	 */
	
	public static void main(String[] args) {
		
		// input
		String digit;		// The raw input of the user
		int number;			// The numeric value of the user's input
		Boolean[] binary = new Boolean[4];	// Used to arrange the boolean values
		
		
		System.out.print("Enter a hex digit: ");
		Scanner input = new Scanner(System.in);
		digit = input.next();
		input.close();
		
		// processing
		number = digit.compareTo("0");			// measures the input distance from zero
		
		
		// Here I'm making sure that the numbers are the right values
		if (number >= 17 && 22 >= number)
			number -= 7;
		else if (number >= 0 && 9 >= number)
			System.out.print("");
		else
			System.out.print("The number is out'a whack.");
		
		// I could use System.out... with Integer.toBinaryString()... to finish here.
		
		// here the for loop makes the int value go into the boolean array in order.
		for (int i = 0; i < binary.length; i++) {
			if (number >= Math.pow(2, (binary.length - i - 1))) {
				binary[i] = true;
				number -= Math.pow(2, (binary.length - i - 1));
			}
			else
				binary[i] = false;
		}
	
		// output
		
		// This takes the boolean array and prints 1s or 0s to make the binary output.
		System.out.print("The binary value is ");
		for (int i = 0; i < binary.length; i++) {
			int output;
			if (binary[i].equals(true))
				output = 1;
			else
				output = 0;
			System.out.print(output);
		}
		
		
	}

}

// Notes: If I had used Integer.toBinaryString() things would have been easier.
// Completed (for now) on 4/8/2016 by William ODieLag Pennington;