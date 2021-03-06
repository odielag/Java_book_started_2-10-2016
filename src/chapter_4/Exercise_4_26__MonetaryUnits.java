package chapter_4;

import java.util.Scanner;

public class Exercise_4_26__MonetaryUnits {
	
	/*
(Financial application: monetary units) Rewrite Listing  2.10, ComputeChange.
java, to fix the possible loss of accuracy when converting a float value to an int
value. Read the input as a string such as "11.56" . Your program should extract
the dollar amount before the decimal point and the cents after the decimal amount
using the indexOf and substring methods.
	 */

	private static String originalAmount;
	private static String givenAmount; //The original amount of money in *.?? format... changes
	private static int dollarBill_100;
	private static int dollarBill_50;
	private static int dollarBill_20;
	private static int dollarBill_10;
	private static int dollarBill_5;
	private static int dollarBill_1;
	//testing// System.out.println(Byte.MAX_VALUE);
	private static int quarters;
	private static int dimes;
	private static int nickels;
	private static int pennies;

	public static void main(String[] args) {

		//user input
		Scanner input = new Scanner(System.in);
		System.out.printf("\nPlease enter the money amount ex. 50.12 ..: ");
		givenAmount = input.nextLine();
		input.close();

		//process
		change(givenAmount);
		
		// debug
		System.out.println(givenAmount);
		System.out.println((Double.parseDouble(givenAmount.substring(0, givenAmount.length() - 1 - 2))));
		System.out.println((Double.parseDouble(givenAmount.substring(givenAmount.length() - 2, givenAmount.length()))));
		
		
		

		//output
		print();
	}

	public static void change(String givenAmount){
		originalAmount = givenAmount;
		fromStringToDollarsAndCents(givenAmount);

	}
	
	public static void fromStringToDollarsAndCents(String givenAmount) {
	dollarBill_100(Integer.parseInt(givenAmount.substring(0, givenAmount.length() - 3)));
	quarters(Integer.parseInt(givenAmount.substring(givenAmount.length() -2, givenAmount.length())));
	}

	public static void dollarBill_100(int givenAmount){
		while (givenAmount >= 100){
			++dollarBill_100;
			givenAmount -= 100;
		}
		dollarBill_50(givenAmount);			
	};
	public static void dollarBill_50(int givenAmount){
		while (givenAmount >= 50){
			++dollarBill_50;
			givenAmount -= 50;
		}
		dollarBill_20(givenAmount);			
	};
	public static void dollarBill_20(int givenAmount){
		while (givenAmount >= 20){
			++dollarBill_20;
			givenAmount -= 20;
		}
		dollarBill_10(givenAmount);			
	};
	public static void dollarBill_10(int givenAmount){
		while (givenAmount >= 10){
			++dollarBill_10;
			givenAmount -= 10;
		}
		dollarBill_5(givenAmount);			
	};
	public static void dollarBill_5(int givenAmount){
		while (givenAmount >= 5){
			++dollarBill_5;
			givenAmount -= 5;
		}
		dollarBill_1(givenAmount);			
	};
	public static void dollarBill_1(int givenAmount){
		while (givenAmount >= 1){
			++dollarBill_1;
			givenAmount -= 1;
		};			
	};
	public static void quarters(int givenAmount){
		while (givenAmount >= 25){
			++quarters;
			givenAmount -= 25;
		}
		dimes(givenAmount);			
	};
	public static void dimes(int givenAmount){
		while (givenAmount >= 10){
			++dimes;
			givenAmount -= 10;
		}
		nickels(givenAmount);			
	};
	public static void nickels(int givenAmount){
		while (givenAmount >= 05){
			++nickels;
			givenAmount -= 05;
		}
		pennies(givenAmount);			
	};
	public static void pennies(int givenAmount){
		while (givenAmount >= 01){
			++pennies;
			givenAmount -= 01;
		}
	}		

	public static void print(){
		System.out.printf("\nThe original amount: %s converts to" +
				"\n100s: %d\n50s: %d\n20s: %d\n10s: %d\n5s: %d\n1s: %d" + 
				"\nQuarters: %d\nDimes: %d\nNickels: %d\nPennies: %d", 
				originalAmount, dollarBill_100, dollarBill_50, dollarBill_20, dollarBill_10,
				dollarBill_5, dollarBill_1, quarters, dimes, nickels, pennies);
	}
	
}
