package chapter_5;

import java.util.Scanner;

public class Listing_5_9__GreatestCommonDivisor {
	
	/*
Let the two input integers be n1 and n2 . You know that number 1 is a common divisor, but
it may not be the greatest common divisor. So, you can check whether k (for k = 2 , 3 , 4 , and
so on) is a common divisor for n1 and n2 , until k is greater than n1 or n2 . Store the common
divisor in a variable named gcd . Initially, gcd is 1 . Whenever a new common divisor is found,
it becomes the new gcd. When you have checked all the possible common divisors from 2 up
to n1 or n2 , the value in variable gcd is the greatest common divisor. Once you have a logical
solution, type the code to translate the solution into a Java program as follows:

Enter first integer: 125
Enter second integer: 2525
The greatest common divisor for 125 and 2525 is 25
	 */
	
	public static void main(String[] args)
	{
		
		// input
		long n1, n2, increasingNumber, gcd;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		n1 = input.nextLong();
		System.out.print("Enter second integer: ");
		n2 = input.nextLong();
				
		// processing
		gcd = 1;
		increasingNumber = 1;
		while(increasingNumber <= n1 && increasingNumber <= n2)
		{
			if (n1 % increasingNumber == 0 && n2 % increasingNumber == 0)
				gcd = increasingNumber;
			increasingNumber++;
		}
		
		
		// output
		System.out.printf("The greatest common divisor for %d and %d is %d",
				n1, n2, gcd);
		input.close();
	}

}
// It works! Compelted on 4/25/2016 by William ODieLag Pennington;