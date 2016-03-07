
public class Exercise_3_7__MonetaryUnits {

	/*
(Financial application: monetary units) Modify Listing 2.10, ComputeChange
.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such
as 2 dollars and 3 pennies.
	 */

	private static int highestOutput, highestNonoutput;
	private static String output = "";
	private static String[] outputs = new String[10];
	private static double originalAmount;
	private static double givenAmount; //The original amount of money in *.?? format... changes
	private static int dollarBill_100 = 0;
	private static int dollarBill_50 = 0;
	private static int dollarBill_20 = 0;
	private static int dollarBill_10 = 0;
	private static int dollarBill_5 = 0;
	private static int dollarBill_1 = 0;
	private static int quarters = 0;
	private static int dimes = 0;
	private static int nickels = 0;
	private static int pennies = 0;
	private static String[] simpleNames = {"hundred", "fifty", "twenty",
			"ten", "five", "dollar", "quarter", "dime", "nickel",
	"penny"};


	public static void main(String[] args) {

		// input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("\nPlease enter the money amount ex. 50.12 ..: ");
		givenAmount = input.nextDouble();
		input.close();

		// process
		change(givenAmount);

		int[] amounts = {dollarBill_100, dollarBill_50, dollarBill_20, dollarBill_10,
				dollarBill_5, dollarBill_1, quarters, dimes, nickels, pennies};

		// doing the main output without pennies
		for(int i = 0; i < 9; i++){
			if (amounts[i] == 0){
				outputs[i] = "";
				highestNonoutput = i;
			}
			else if (amounts[i] == 1){
				outputs[i] = amounts[i] + " " + simpleNames[i] + " ";
				highestOutput = i;
			}
			else {
				outputs[i] = amounts[i] + " " + simpleNames[i] + "s ";
				highestOutput = i;
			}
		}
		
		for(int i = 9; i < 10; i++){
			if (amounts[i] == 0){
				outputs[i] = "";
				highestNonoutput = i;
			}
			else if (amounts[i] == 1){
				outputs[i] = amounts[i] + " " + "penny" + " ";
				highestOutput = i;
			}
			else {
				outputs[i] = amounts[i] + " " + "pennies" + " ";
				highestOutput = i;
			}
		}
		
		// output
		output += originalAmount + " equals to ";
		for (int i = 0; i < highestOutput; i++){
			output += outputs[i];
		}
		output += "and ";
		output += outputs[highestOutput];

		System.out.println(output);

	}

	public static void change(double givenAmount){
		originalAmount = givenAmount;
		dollarBill_100(givenAmount);

	}

	public static void dollarBill_100(double givenAmount){
		while (givenAmount >= 100){
			++dollarBill_100;
			givenAmount -= 100;
		}
		dollarBill_50(givenAmount);			
	};
	public static void dollarBill_50(double givenAmount){
		while (givenAmount >= 50){
			++dollarBill_50;
			givenAmount -= 50;
		}
		dollarBill_20(givenAmount);			
	};
	public static void dollarBill_20(double givenAmount){
		while (givenAmount >= 20){
			++dollarBill_20;
			givenAmount -= 20;
		}
		dollarBill_10(givenAmount);			
	};
	public static void dollarBill_10(double givenAmount){
		while (givenAmount >= 10){
			++dollarBill_10;
			givenAmount -= 10;
		}
		dollarBill_5(givenAmount);			
	};
	public static void dollarBill_5(double givenAmount){
		while (givenAmount >= 5){
			++dollarBill_5;
			givenAmount -= 5;
		}
		dollarBill_1(givenAmount);			
	};
	public static void dollarBill_1(double givenAmount){
		while (givenAmount >= 1){
			++dollarBill_1;
			givenAmount -= 1;
		}
		quarters(givenAmount);			
	};
	public static void quarters(double givenAmount){
		while (givenAmount >= .25){
			++quarters;
			givenAmount -= .25;
		}
		dimes(givenAmount);			
	};
	public static void dimes(double givenAmount){
		while (givenAmount >= .10){
			++dimes;
			givenAmount -= .10;
		}
		nickels(givenAmount);			
	};
	public static void nickels(double givenAmount){
		while (givenAmount >= .05){
			++nickels;
			givenAmount -= .05;
		}
		pennies(givenAmount);			
	};
	public static void pennies(double givenAmount){
		while (givenAmount >= .01){
			++pennies;
			givenAmount -= .01;
		}

	}		

}

