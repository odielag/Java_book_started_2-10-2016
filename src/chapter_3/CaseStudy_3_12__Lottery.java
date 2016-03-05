package chapter_3;

public class CaseStudy_3_12__Lottery {

	/*
Suppose you want to develop a program to play lottery. The program randomly generates a
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines
whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
Note that the digits of a two-digit number may be 0 . If a number is less than 10 , we assume
the number is preceded by a 0 to form a two-digit number. For example, number 8 is treated
as 08 and number 0 is treated as 00 in the program. Listing 3.8 gives the complete program.
	 */

	public static void main(String[] args) {

		// input
		int randomNumber;
		String stringRandomNumber;
		int lotteryPick;
		String stringLotteryPick;
		String output = "";
		char randomNumber0;
		char randomNumber1;
		char lotteryPick0;
		char lotteryPick1;
		
			// generate a two-digit random number
		randomNumber = (int)(Math.random() * 100);
		stringRandomNumber = Integer.toString(randomNumber);
		if (randomNumber / 10 == 0){
			stringRandomNumber = String.format("0%s", Integer.toString(randomNumber));
		}

			//ex.Enter your lottery pick (two digits): 15
		System.out.printf("Enter your lottery pick (two digits): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		lotteryPick = input.nextInt();
		input.close();
		
		// processing
		stringLotteryPick = Integer.toString(lotteryPick);
		if (lotteryPick / 10 == 0){
			stringLotteryPick = String.format("0%s", Integer.toString(lotteryPick));
		}
		
		randomNumber0 = (char)(stringRandomNumber.charAt(0));
		randomNumber1 = (char)(stringRandomNumber.charAt(1));
		lotteryPick0 = (char)(stringLotteryPick.charAt(0));
		lotteryPick1 = (char)(stringLotteryPick.charAt(1));

		if (randomNumber0 == lotteryPick0 && randomNumber1 == lotteryPick1){
			output = "Exact match: you win $10,000";
		}
		else if (randomNumber0 == lotteryPick1 && randomNumber1 == lotteryPick0){
			output = "Match all digits: you win $3,000";
		}
		else if (randomNumber0 == lotteryPick0 || randomNumber0 == lotteryPick1
				|| randomNumber1 == lotteryPick0 || randomNumber1 == lotteryPick1){
			output = "Match one digit: you win $1,000";
		}
				
		// output
		System.out.printf("The lottery number is: %s\n", stringRandomNumber);
		System.out.printf("%s", output);

		/*
			The lottery number is 15
			Exact match: you win $10,000
		 */

	}

}

// Finished by William ODieLag Pennington on 3/3/2016