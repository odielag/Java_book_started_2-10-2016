package chapter_3;

public class Exercise_3_31__CurrencyExchange {
	
	/*
(Financials: currency exchange) Write a program that prompts the user to enter
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dol-
lars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
Here are the sample runs:

Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 0
Enter the dollar amount: 100
$100.0 is 681.0 yuan

Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 1
Enter the RMB amount: 10000
10000.0 yuan is $1468.43

Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 5
Incorrect input
	 */

	public static void main(String[] args){
		
		// input
		double exchangeRate;
		double dollars;
		double yuan;
		double temp;
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		exchangeRate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		temp = input.nextDouble();
			
		// processing // output
		if(temp == 0){
			System.out.print("Enter the dollar amount: ");
			dollars = input.nextDouble();
			yuan = dollars * exchangeRate;
			System.out.printf("$%.2f is %.2f yuan", dollars, yuan);
		}
		else if(temp == 1){
			System.out.print("Enter the RMB amount: ");
			yuan = input.nextDouble();
			dollars = yuan / exchangeRate;
			System.out.printf("%.2f yuan is $%.2f", yuan, dollars);
		}
		else System.out.printf("\nIncorrect input");
		
		input.close();
	}
	
}

// Completed by William ODieLag Pennington on 3/17/2016;