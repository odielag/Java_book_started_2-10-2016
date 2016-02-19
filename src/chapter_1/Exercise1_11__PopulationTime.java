package chapter_1;

public class Exercise1_11__PopulationTime {

	/*
	 * (Population projection) The U.S. Census Bureau projects population based on the
following assumptions:
- One birth every 7 seconds
- One death every 13 seconds
- One new immigrant every 45 seconds
		Write a program to display the population for each of the next five years. Assume the
current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
integers perform division, the result is an integer. The fractional part is truncated. For
example, 5 / 4 is 1 (not 1.25 ) and 10 / 4 is 2 (not 2.5 ). To get an accurate result with
the fractional part, one of the values involved in the division must be a number with a
decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5 .
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double a = 5.0;
		int b = 4;
		System.out.println(Math.PI / b);
		*/
		
		long initialPopulation = 312032486;
		long increasePerYear = 
				convertSecondsPerTimeToTimesPerYear(7) +
				convertSecondsPerTimeToTimesPerYear(13) +
				convertSecondsPerTimeToTimesPerYear(45);	
		for(int i = 0; i <= 5; i++){
			System.out.println("The population in year " + i + " equals: " + 
					(initialPopulation + i * increasePerYear));
		}
	}
	
	public static long convertSecondsPerTimeToTimesPerYear(long seconds){

		long timesPerYear;
		
		timesPerYear = seconds * 60 * 24 * 365;
		
		return timesPerYear;
	}

}

//finished!!//
