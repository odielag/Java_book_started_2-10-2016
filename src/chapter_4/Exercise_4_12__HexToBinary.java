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
		String digit;
		int number;
		Boolean[] binary = new Boolean[4];
		
		
		System.out.print("Enter a hex digit: ");
		Scanner input = new Scanner(System.in);
		digit = input.next();
		input.close();
		
		// processing
		number = digit.compareTo("0");
		
		if (number >= 17 && 22 >= number)
			number -= 7;
		else if (number >= 0 && 9 >= number)
			System.out.print("");
		else
			System.out.print("The number is out'a whack.");
		
		for (int i = 0; i < binary.length; i++) {
			if (number >= Math.pow(2, (binary.length - i - 1))) {
				binary[i] = true;
				number -= Math.pow(2, (binary.length - i - 1));
			}
			else
				binary[i] = false;
		}
	
		// output
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
