package chapter_2;

public class Exercise_2_13__ {
	
	/*
(Financial application: compound value) Suppose you save $100 each month
into a savings account with the annual interest rate 5%. Thus, the monthly inter-
est rate is 0.05/12 = 0.00417. After the first month, the value in the account
becomes

100 * (1 + 0.00417) = 100.417

After the second month, the value in the account becomes

(100 + 100.417) * (1 + 0.00417) = 201.252

After the third month, the value in the account becomes

(100 + 201.252) * (1 + 0.00417) = 302.507

and so on.

Write a program that prompts the user to enter a monthly saving amount and
displays the account value after the sixth month. (In Exercise 5.30, you will use a
loop to simplify the code and display the account value for any month.)

Enter the monthly saving amount: 100
After the sixth month, the account value is $608.81
	 */
	
	private static double previousBalance;
	private static double monthlySaving;
	private static double finalValue; // The final account value after 6 months
	private static double monthlyInterestRate = 0.05 / 12;

	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter the monthly saving amount: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		monthlySaving = input.nextDouble();
		input.close();
		
		// processing
		for(int i = 0; i < 6; i++){
			previousBalance = (monthlySaving + previousBalance) * (1 + monthlyInterestRate);
		}
		finalValue = previousBalance;
		
		// output
		System.out.printf("After the sixth month, the account value is %.2f", finalValue);

	}

}

// Finished by William ODieLag Pennington
