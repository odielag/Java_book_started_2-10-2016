package chapter_2;

import java.util.Scanner;

public class InChapter2_16__interest {

	/*
	 * Step 1.
Prompt the user to enter the annual interest rate, the number of years, and the
loan amount.
(The interest rate is commonly expressed as a percentage of the principal for a period of
one year. This is known as the annual interest rate.)

Step 2. The input for the annual interest rate is a number in percent format, such as
4.5%. The program needs to convert it into a decimal by dividing it by 100 . To
obtain the monthly interest rate from the annual interest rate, divide it by 12 ,
since a year has 12 months. So, to obtain the monthly interest rate in decimal
format, you need to divide the annual interest rate in percentage by 1200 . For
example, if the annual interest rate is 4.5%, then the monthly interest rate is
4.5/1200 = 0.00375.

Step 3. Compute the monthly payment using the preceding formula.

Step 4. Compute the total payment, which is the monthly payment multiplied by 12 and
multiplied by the number of years.

Step 5. Display the monthly payment and total payment.
	 */

	public static void main(String[] args) {
		double loanAmount;
		double annualInterestRate;
		double monthlyInterestRate;
		long numberOfYears;
		
		
		//Step 1.
		//Prompt the user to enter the annual interest rate, the number of years, and the
		//loan amount.
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("\nPlease enter the annual interest rate percentage: ");
		annualInterestRate = input.nextDouble();
		System.out.printf("\nPlease enter the number of years for the loan: ");
		numberOfYears = input.nextLong();
		System.out.printf("\nPlease enter the loan amount: ");
		loanAmount = input.nextDouble();
		
		input.close();

		/*
Step 2. The input for the annual interest rate is a number in percent format, such as
4.5%. The program needs to convert it into a decimal by dividing it by 100 . To
obtain the monthly interest rate from the annual interest rate, divide it by 12 ,
since a year has 12 months. So, to obtain the monthly interest rate in decimal
format, you need to divide the annual interest rate in percentage by 1200 . For
example, if the annual interest rate is 4.5%, then the monthly interest rate is
4.5/1200 = 0.00375.
		 */
		
		annualInterestRate = annualInterestRate / 100;
		monthlyInterestRate = annualInterestRate / 12;
		
		//Step 3. Compute the monthly payment using the preceding formula.
		
		double monthlyPayment = 
				(loanAmount * monthlyInterestRate) / 
				(1 - (1 / (Math.pow((1 + monthlyInterestRate), (numberOfYears * 12)))));
		
		//Step 4. Compute the total payment, which is the monthly payment multiplied by 12 and
		//multiplied by the number of years.
		
		double totalPayment = monthlyPayment * 12 * numberOfYears;
		
		//Step 5. Display the monthly payment and total payment.
		
		System.out.printf("\nThe monthly payment: %f\nThe total payment: %f", monthlyPayment, totalPayment);
		
		
	}

}

//I don't know if this works in real life or is even made correctly.
//~William 'ODieLag' Pennington