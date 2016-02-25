package chapter_2;

public class Exercise_2_21__InterestRate {
	
	/*
(Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and dis-
plays the future investment value using the following formula:

futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);

For example, if you enter amount 1000 , annual interest rate 3.25% , and number
of years 1 , the future investment value is 1032.98 .

Here is a sample run:

Enter investment amount: 1000.56
Enter annual interest rate in percentage: 4.25
Enter number of years: 1
Accumulated value is $1043.92
	 */
	
	private static double	futureInvestmentValue;
	private static double	investmentAmount;
	private static double	annualInterestRate;
	private static double	monthlyInterestRate;
	private static int		numberOfYears;

	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter investment amount: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		investmentAmount = input.nextDouble();
		System.out.printf("Enter annual interest rate in percentage: ");
		annualInterestRate = input.nextDouble() / 100;
		System.out.printf("Enter number of years: ");
		numberOfYears = input.nextInt();
		input.close();
		
		// processing
		monthlyInterestRate = annualInterestRate / 12;
		
		futureInvestmentValue = 
				investmentAmount * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
		
		// output
		
		System.out.printf("Accumulated value is %.2f", futureInvestmentValue);
		
	}

}

// Finished by Willaim ODieLag Pennington
