package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Financial application: loan amortization schedule)</h1> The monthly payment for a
 * given loan pays the principal and the interest. The monthly interest is
 * computed by multiplying the monthly interest rate and the balance (the
 * remaining princi- pal). The principal paid for the month is therefore the
 * monthly payment minus the monthly interest. Write a program that lets the
 * user enter the loan amount, number of years, and interest rate and displays
 * the amortization schedule for the loan. Here is a sample run:
 * 
 * Loan Amount: 10000
 * Number of Years: 1
 * Annual Interest Rate: 7
 * 
 * Monthly Payment: 865.26
 * Total Payment: 10383.21
 * 
 * Payment#		Interest		Principal		Balance
 * 1			58.33			806.93			9193.07
 * 2			53.62			811.64			8381.43
 * ...
 * 11			10.0			855.26			860.27
 * 12			5.01			860.25			0.01
 * 
 * 
 * 
 * Note
The balance after the last payment may not be zero. If so, the last payment should be
the normal monthly payment plus the final balance.
Hint: Write a loop to display the table. Since the monthly payment is the
same for each month, it should be computed before the loop. The balance
is initially the loan amount. For each iteration in the loop, compute the
interest and principal, and update the balance. The loop may look like this:
 * 
 * for (i = 1; i <= numberOfYears * 12; i++) {
interest = monthlyInterestRate * balance;
principal = monthlyPayment - interest;
balance = balance - principal;
System.out.println(i + "\t\t" + interest
+ "\t\t" + principal + "\t\t" + balance);
}
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-4
 */

public class Exercise_5_22__LoanAmortizationSchedule
{
	public static void main(String[] args)
	{
		// input
		double loanAmount;			// user inputed loan amount
		int numberOfYears;			// user inputed loan length
		int numberOfMonths;			// numberOfYears derived term in months.
		double annualInterestRate;	// user inputed APR as a whole number
		double monthlyInterestRate;	// monthly APR calculated from other info.
		double monthlyPayment;		// monthly principle + monthly interest
		double monthlyInterest;		// second column, monthly interest in dollars
		double monthlyPrincipal;	// third column, monthly principal in dollars
		double balance;				// the current outstanding balance.
		Scanner input = new Scanner(System.in);		// for user input		
		
		/*	example user input
		 * Loan Amount: 10000
		 * Number of Years: 1
		 * Annual Interest Rate: 7
		 */
		System.out.print("Loan Amount: ");
		loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		annualInterestRate = input.nextDouble() / 100.000000;
		System.out.println();
		
		// processing and output
		balance = loanAmount;
		monthlyInterestRate = (annualInterestRate / 12.000000);
		numberOfMonths = numberOfYears * 12;
		monthlyPayment = (monthlyInterestRate * loanAmount) / 
				(1 - Math.pow(1 + monthlyInterestRate, -numberOfMonths));
		//System.out.printf("Monthly Payment: %.2f", monthlyPayment);
		
		/*
		 * Monthly Payment: 865.26
		 * Total Payment: 10383.21
		 */
		System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);
		System.out.printf("Total Payment: %.2f\n\n", monthlyPayment * 12 * numberOfYears);
		
		System.out.printf("%-16s%-16s%-16s%-16s\n",
				"Payment#", "Interest", "Principal", "Balance");
		// pasted from problem note...
		for (int i = 1; i <= numberOfYears * 12; i++)
		{
			monthlyInterest = monthlyInterestRate * balance;
			monthlyPrincipal = monthlyPayment - monthlyInterest;
			balance -= monthlyPrincipal;
			System.out.printf("%-16d%-16.2f%-16.2f%-16.2f\n",
					i, monthlyInterest, (monthlyPayment - monthlyInterest),	balance);
		}
		
		// last thing
		input.close();
	}
}
