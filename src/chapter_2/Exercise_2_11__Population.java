package chapter_2;

public class Exercise_2_11__Population {

	/*
(Population projection) Rewrite Programming Exercise 1.11 to prompt the user
to enter the number of years and displays the population after the number of years.
Use the hint in Programming Exercise 1.11 for this program. The population
should be cast into an integer. Here is a sample run of the program:

Enter the number of years: 5
The population in 5 years is 325932970
	 */

	public static void main(String[] args) {

		//input
		System.out.printf("Enter the number of years: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		long years = input.nextLong();
		input.close();
		
		//processing
		long finalPopulation;
		long initialPopulation = 312032486;
		long increasePerYear = 
				convertSecondsPerTimeToTimesPerYear(7) +
				convertSecondsPerTimeToTimesPerYear(13) +
				convertSecondsPerTimeToTimesPerYear(45);
		finalPopulation = initialPopulation + years * increasePerYear;

		//output
		System.out.printf("The population in %d years is %d", years, finalPopulation);

	}

	public static long convertSecondsPerTimeToTimesPerYear(long seconds){

		long timesPerYear;

		timesPerYear = seconds * 60 * 24 * 365;

		return timesPerYear;
	}

}

//Finished by William ODieLag Pennington