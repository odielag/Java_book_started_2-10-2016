package chapter_4;

import java.util.Scanner;

public class Exercise_4_23__Payroll {
	
	/*
(Financial application: payroll) Write a program that reads the following infor-
mation and prints a payroll statement:

   Employee’s name (e.g., Smith)
   Number of hours worked in a week (e.g., 10)
   Hourly pay rate (e.g., 9.75)
   Federal tax withholding rate (e.g., 20%)
   State tax withholding rate (e.g., 9%)

A sample run is shown below:

Enter employee's name: Smith
Enter number of hours worked in a week: 10
Enter hourly pay rate: 9.75
Enter federal tax withholding rate: 0.20
Enter state tax withholding rate: 0.09
Employee Name: Smith
Hours Worked: 10.0
Pay Rate: $9.75
Gross Pay: $97.5
Deductions:
   Federal Withholding (20.0%): $19.5
   State Withholding (9.0%): $8.77
   Total Deduction: $28.27
Net Pay: $69.22
	 */

	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		String name;
		double hours, hourly, federalWithholdingRate, stateWithholdingRate;
		
		
		System.out.print("Enter employee's name: ");
		name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		hourly = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		federalWithholdingRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		stateWithholdingRate = input.nextDouble();
		input.close();
		
		// processing
		// output
		
		//Employee Name: Smith
		System.out.println("Employee Name: " + name);
		//Hours Worked: 10.0
		System.out.println("Hours Worked: " + hours);
		//Pay Rate: $9.75
		System.out.println("Pay Rate: $" + hourly);
		//Gross Pay: $97.5
		System.out.println("Gross Pay: $" + hours * hourly);
		//Deductions:
		System.out.println("Deductions:");
		//   Federal Withholding (20.0%): $19.5
		System.out.printf("   Federal Withholding (%.1f%%): $%.2f\n",
				federalWithholdingRate * 100, federalWithholdingRate * hours * hourly);
		//   State Withholding (9.0%): $8.77
		System.out.printf("   State Withholding (%.1f%%): $%.2f\n", 
				stateWithholdingRate * 100, stateWithholdingRate * hours * hourly);
		//   Total Deduction: $28.27
		System.out.printf("   Total Deduction: $%.2f\n", 
				(stateWithholdingRate + federalWithholdingRate) * hours * hourly);
		//Net Pay: $69.22
		System.out.printf("Net Pay: $%.2f\n", 
				(1 - (stateWithholdingRate + federalWithholdingRate)) * hours * hourly);
		
	}
	
}

// Completed on 4/14/2016 by William ODieLag Pennington;