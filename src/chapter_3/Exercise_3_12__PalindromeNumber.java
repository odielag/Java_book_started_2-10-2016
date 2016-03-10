package chapter_3;

public class Exercise_3_12__PalindromeNumber {
	
	/*
(Palindrome number) Write a program that prompts the user to enter a three-digit
integer and determines whether it is a palindrome number. A number is palin-
drome if it reads the same from right to left and from left to right. Here is a sample
run of this program:

Enter a three-digit integer: 121
121 is a palindrome

Enter a three-digit integer: 123
123 is not a palindrome
	 */

	public static void main(String[] args){
		
		// input
		int threeDigitInteger;
		String not = "";
		
		System.out.print("Enter a three-digit integer: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		threeDigitInteger = input.nextInt();
		input.close();
		
		// processing
		if (threeDigitInteger / 100 != threeDigitInteger % 10)
			not = "not ";		
		
		// output
		System.out.printf("%d is %sa palindrome", threeDigitInteger, not);
		
		}
	
}