package chapter_3;

import java.util.Scanner;

public class CheckPoint_3_6__ {
	
	/*
Write an if statement that increases pay by 3% if score is greater than 90 , other-
wise increases pay by 1%.
	 */

	private static double score, pay;
	
	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		System.out.printf("Please provide the amount of initial pay: ");
		pay = input.nextDouble();
		System.out.printf("\nNow please provide the score: ");
		score = input.nextDouble();
		input.close();
		
		// processing
		if (score > 90)
			pay *= 1.03;
		else 
			pay *= 1.01;
			
		// output
		System.out.printf("\nThe final pay is: %.2f", pay);

	}

}

// Finished by William ODieLag Pennington on Feb 27, 2016