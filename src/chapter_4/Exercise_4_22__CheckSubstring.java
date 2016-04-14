package chapter_4;

import java.util.Scanner;

public class Exercise_4_22__CheckSubstring {
	
	/*
(Check substring) Write a program that prompts the user to enter two strings and
reports whether the second string is a substring of the first string.

Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD

Enter string s1: ABCD
Enter string s2: BDC
BDC is not a substring of ABCD
	 */
	
	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		String s1, s2, output;
		boolean isASubstring;
		
		System.out.print("Enter string s1: ");
		s1 = input.nextLine();
		System.out.print("Enter string s2: ");
		s2 = input.nextLine();		
		input.close();
		
		// processing
		if (s1.contains(s2)) isASubstring = true;
		else isASubstring = false;
		
		if (isASubstring) output = String.format("%s is a substring of %s", s2, s1);
		else output = String.format("%s is not a substring of %s", s2, s1);
		
		// output
		System.out.print(output);
				
	}

}
