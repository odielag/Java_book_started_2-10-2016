package chapter_2;

public class InChapter_2_17__ChangingMoney {

	/*
Suppose you want to develop a program that changes a given amount of money into smaller
monetary units. The program lets the user enter an amount as a double value representing a
total in dollars and cents, and outputs a report listing the monetary equivalent in the maximum
number of dollars, quarters, dimes, nickels, and pennies, in this order, to result in the mini-
mum number of coins.
	 */

	double originalAmount;
	private static double givenAmount; //The original amount of money in *.?? format... changes
	private static long dollarBill_100;
	private static long dollarBill_50;
	private static long dollarBill_20;
	private static long dollarBill_10;
	private static long dollarBill_5;
	private static long dollarBill_1;
	//testing// System.out.println(Byte.MAX_VALUE);
	private static byte quarters;
	private static byte dimes;
	private static byte nickels;
	private static byte pennies;

	public static void main(String[] args) {

		//user input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("\nPlease enter the money amount ex. 50.12 ..:");
		givenAmount = input.nextDouble();
		input.close();

		//process
		change(givenAmount);

		//program output
		System.out.printf("\n100s: %d\n50s: %d\n20s: %d\n10s: %d\n5s: %d\n1s: %d" + 
				"\nQuarters: %d\nDimes: %d\nNickels: %d\nPennies: %d", 
				dollarBill_100, dollarBill_50, dollarBill_20, dollarBill_10,
				dollarBill_5, dollarBill_1, quarters, dimes, nickels, pennies);
	}

	public void change(double givenAmount){
		this.originalAmount = givenAmount;
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
		dollarBill_50(givenAmount);			
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
	};
}

//work in progress 

