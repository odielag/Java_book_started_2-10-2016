package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Financial application: compound value)</h1> Suppose you save $100 each
 * month into a savings account with the annual interest rate 5%. So, the
 * monthly interest rate is 0.05 / 12 = 0.00417 . After the first month, the
 * value in the account becomes 
 * 
 * 100 * (1 + 0.00417) = 100.417 
 * 
 * After the second month, the value in the account becomes 
 * 
 * (100 + 100.417) * (1 + 0.00417) = 201.252 
 * 
 * After the third month, the value in the account becomes 
 * 
 * (100 + 201.252) * (1 + 0.00417) = 302.507 
 * 
 * and so on. Write a program that
 * prompts the user to enter an amount (e.g., 100 ), the annual interest rate
 * (e.g., 5 ), and the number of months (e.g., 6 ) and displays the amount in
 * the savings account after the given month.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-7
 *
 */

public class Exercise_5_30__CompoundValue
{
	public static void main(String[] args)
	{
		System.out.print("Amount per month you will contribute to your savings? ");
		Scanner input = new Scanner(System.in);
		double contributionAmount = input.nextDouble();
		System.out.print("What is the annual interest rate? ");
		double monthlyInterestRate = input.nextDouble() / 100 / 12;
		System.out.print("How many months to calculate? ");
		int months = input.nextInt();
		double aggregate = 0;
		for (int i = 0; i < months; i++)
			aggregate = (contributionAmount + aggregate) * (1 + monthlyInterestRate);
		System.out.printf("After %d months the account total will be %.3f", months, aggregate);
		input.close();
	}
}
