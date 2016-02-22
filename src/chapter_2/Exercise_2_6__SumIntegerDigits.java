package chapter_2;

public class Exercise_2_6__SumIntegerDigits {
	
	/*
(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932 , the
sum of all its digits is 14 .
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93 .
Here is a sample run:

Enter a number between 0 and 1000: 999
The sum of the digits is 27
	 */
	
	private static short number;
	private static short sum = 0;

	public static void main(String[] args) {
		
		//input
		System.out.printf("Enter a number between 0 and 1000: \t");
		java.util.Scanner input = new java.util.Scanner(System.in);
		number = input.nextShort();
		
		//processing
		while (0 != number){
			sum += number % 10;
			number /= 10;
		}
		
		//output
		System.out.printf("The sum of the digits is %d", sum);


	}

}

//Finished by William ODieLag Pennington