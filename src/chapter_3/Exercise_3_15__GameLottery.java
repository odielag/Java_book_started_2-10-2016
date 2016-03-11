package chapter_3;

public class Exercise_3_15__GameLottery {

	/*
(Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three-
digit number. The program prompts the user to enter a three-digit number and
determines whether the user wins according to the following rules:

1. If the user input matches the lottery number in the exact order, the award is
$10,000.

2. If all digits in the user input match all digits in the lottery number, the award is
$3,000.

3. If one digit in the user input matches a digit in the lottery number, the award is
$1,000.
	 */

	public static void main(String[] args) {

		// input
		int temp;
		int randomNumber;
		String stringRandomNumber;
		int lotteryPick;
		String stringLotteryPick;
		String output = "";
		int[] randomNumberArray = new int[3];
		int[] lotteryPickArray = new int[3];

		// generate a three-digit random number
		randomNumber = (int)(Math.random() * 1000);
		stringRandomNumber = Integer.toString(randomNumber);
		if (randomNumber / 10 == 0){
			stringRandomNumber = String.format("00%s", Integer.toString(randomNumber));
		}
		else if (randomNumber / 100 == 0){
			stringRandomNumber = String.format("0%s", Integer.toString(randomNumber));
		}

		//ex.Enter your lottery pick (two digits): 15
		System.out.printf("Enter your lottery pick (three digits): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		lotteryPick = input.nextInt();
		input.close();

		// processing
		stringLotteryPick = Integer.toString(lotteryPick);
		if (lotteryPick / 10 == 0){
			stringLotteryPick = String.format("00%s", Integer.toString(lotteryPick));
		}
		else if (lotteryPick / 100 == 0){
			stringLotteryPick = String.format("0%s", Integer.toString(lotteryPick));
		}

		for(int i = 0; i < randomNumberArray.length; i++){
			randomNumberArray[i] = Character.getNumericValue(stringRandomNumber.charAt(i));
		}
		for(int i = 0; i < lotteryPickArray.length; i++){
			lotteryPickArray[i] = Character.getNumericValue(stringLotteryPick.charAt(i));
		}

		// Array sort 1
		for (int j = 0; j < randomNumberArray.length - 1; j++){
			for (int i = j + 1; i < randomNumberArray.length; i++){
				if (randomNumberArray[j] > randomNumberArray[i]){
					temp = randomNumberArray[i];
					randomNumberArray[i] = randomNumberArray[j];
					randomNumberArray[j] = temp;
				}
			}
		}

		// Array sort 2
		for (int j = 0; j < lotteryPickArray.length - 1; j++){
			for (int i = j + 1; i < lotteryPickArray.length; i++){
				if (lotteryPickArray[j] > lotteryPickArray[i]){
					temp = lotteryPickArray[i];
					lotteryPickArray[i] = lotteryPickArray[j];
					lotteryPickArray[j] = temp;
				}
			}
		}

		if (output == "") output = "There is no match: you win nothing";
		
		for(int i = 0; i < randomNumberArray.length; i++){
			for(int j = 0; j < lotteryPickArray.length; j++){
				if (randomNumberArray[i] == lotteryPickArray[j])
					output = "Match one digit: you win $1,000";
			}
		}
		
		if (randomNumberArray[0] == lotteryPickArray[0] && 
				randomNumberArray[1] == lotteryPickArray[1] && 
				randomNumberArray[2] == lotteryPickArray[2]){
			output = "Match all digits: you win $3,000";
		}
		if (randomNumber == lotteryPick){
			output = "Exact match: you win $10,000";
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

// Finished by William ODieLag Pennington on 3/10/2016;