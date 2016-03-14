package chapter_3;

public class Exercise_3_7__MonetaryUnits {

	/*
(Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
	 */

	private static int highestOutput;
	private static int dollarBill_100, dollarBill_50, dollarBill_20, dollarBill_10, 
	dollarBill_5, dollarBill_1, quarters, dimes, nickels, pennies = 0;
	private static double originalAmount;
	private static double givenAmount;
	private static String output = "";
	private static String[] outputs = new String[10];
	private static String[] simpleNames = {"hundred", "fifty", "twenty",
			"ten", "five", "dollar", "quarter", "dime", "nickel", "penny"};

	public static void main(String[] args) {

		// input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("\nPlease enter the money amount ex. 50.12 ..: ");
		givenAmount = input.nextDouble();
		input.close();

		// process
		change(givenAmount); // Change function that calculates amounts per type

		// I felt I had to do this after the 'change' function.
		int[] amounts = {dollarBill_100, dollarBill_50, dollarBill_20, dollarBill_10,
				dollarBill_5, dollarBill_1, quarters, dimes, nickels, pennies};

		// making the output for every type except for pennies
		for(int i = 0; i < 9; i++){
			if (amounts[i] == 0)
				outputs[i] = "";
			else if (amounts[i] == 1){
				outputs[i] = amounts[i] + " " + simpleNames[i] + " ";
				highestOutput = i;
			}
			else {
				outputs[i] = amounts[i] + " " + simpleNames[i] + "s ";
				highestOutput = i;
			}
		}

		// making the output for pennies
		for(int i = 9; i < 10; i++){ // this one is just for pennies/penny spelling
			if (amounts[i] == 0)
				outputs[i] = "";
			else if (amounts[i] == 1){
				outputs[i] = amounts[i] + " " + "penny" + " ";
				highestOutput = i;
			}
			else {
				outputs[i] = amounts[i] + " " + "pennies" + " ";
				highestOutput = i;
			}
		}

		// output and it includes an and before the last output
		output += originalAmount + " equals to ";
		for (int i = 0; i < highestOutput; i++){
			output += outputs[i];
		}
		output += "and ";
		output += outputs[highestOutput];
		System.out.println(output);
	}

	
	// change function
	public static void change(double givenAmount){
		originalAmount = givenAmount;
		while (givenAmount >= 100){
			++dollarBill_100;
			givenAmount -= 100;
		}
		while (givenAmount >= 50){
			++dollarBill_50;
			givenAmount -= 50;
		}
		while (givenAmount >= 20){
			++dollarBill_20;
			givenAmount -= 20;
		}
		while (givenAmount >= 10){
			++dollarBill_10;
			givenAmount -= 10;
		}
		while (givenAmount >= 5){
			++dollarBill_5;
			givenAmount -= 5;
		}
		while (givenAmount >= 1){
			++dollarBill_1;
			givenAmount -= 1;
		}
		while (givenAmount >= .25){
			++quarters;
			givenAmount -= .25;
		}
		while (givenAmount >= .10){
			++dimes;
			givenAmount -= .10;
		}
		while (givenAmount >= .05){
			++nickels;
			givenAmount -= .05;
		}
		while (givenAmount >= .01){
			++pennies;
			givenAmount -= .01;
		}
	}
}

