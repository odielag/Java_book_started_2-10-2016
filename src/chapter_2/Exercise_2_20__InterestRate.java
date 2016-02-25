package chapter_2;

public class Exercise_2_20__InterestRate {
	
	/*
(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly pay-
ment using the following formula:

interest = balance * (annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month. Here is a sample run:

Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
The interest is 2.91667
	 */
	
	private static double interest, balance, annualInterestRate;

	public static void main(String[] args) {
		
		// input
		//System.out.printf("Enter balance and interest rate: ");
		System.out.printf("Enter balance and interest rate (e.g., 3 for 3%%): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		balance = input.nextDouble();
		annualInterestRate = input.nextDouble();		
		input.close();
		
		// processing
		interest = balance * (annualInterestRate/1200);
		
		// output
		System.out.printf("The interest is %.5f", interest);		
		
	}

}

// Finished by William ODieLag Pennington