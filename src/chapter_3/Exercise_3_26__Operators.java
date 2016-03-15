package chapter_3;

public class Exercise_3_26__Operators {
	
	/*
(Use the && , || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:

Enter an integer: 10
divisible by 5 and 6? false
divisible by 5 or 6? true
divisible by 5 or 6, but not both? true
	 */

	public static void main(String[] args){
		
		// input
		int integer;
		
		System.out.print("Enter an integer: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		integer = input.nextInt();
		input.close();
		
		// processing
		// output
		System.out.printf("divisible by 5 and 6? %b\n", (integer % 5 == 0 && integer % 6 == 0));
		System.out.printf("divisible by 5 or 6? %b\n", (integer % 5 == 0 || integer % 6 == 0));
		System.out.printf("divisible by 5 or 6, but not both? %b\n", (integer % 5 == 0 ^ integer % 6 == 0));
				
	}
	
}

// Completed by William ODieLag Pennington on 3/15/2016;