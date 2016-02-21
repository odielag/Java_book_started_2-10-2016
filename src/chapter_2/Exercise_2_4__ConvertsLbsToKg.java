package chapter_2;

public class Exercise_2_4__ConvertsLbsToKg {

	/*
(Convert pounds into kilograms) Write a program that converts pounds into kilo-
grams. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
sample run:
	 */

	private static double Kg, Lbs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input
		System.out.printf("Enter a number in pounds: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		Lbs = input.nextDouble();
		input.close();

		//processing
		Kg = Lbs / (1 / 0.454);

		//output
		/*
Enter a number in pounds: 55.5
55.5 pounds is 25.197 kilograms
		 */
		System.out.printf("%.1f pounds is %.3f kilograms", Lbs, Kg);

	}

}

//Finished by William ODieLag Pennington
