package chapter_2;

public class Exercise_2_5__Gratuity {
	
	/*
(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. Here is a sample run:

Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5
	 */

	static double subtotal, gratuity, gratuityRate, total;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("Enter the subtotal: ");
		subtotal = input.nextDouble();
		System.out.printf("Enter the gratuity rate: ");
		gratuityRate = input.nextDouble();
		input.close();
		
		//processing
		gratuity = subtotal * (gratuityRate / 100);
		total = subtotal + gratuity;
		
		//output
		System.out.printf("The gratuity is $%.2f and the total is $%.2f", gratuity, total);
		
	}

}

//Finished by William ODieLag Pennington
