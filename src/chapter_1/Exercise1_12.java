package chapter_1;

public class Exercise1_12 {

	/*
	 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
	 */

	public static void main(String[] args) {
		System.out.printf("The runner is running at %.4f Kilometers per hour.",	
							(convertmphtokph
								(convertMilesPerTime(24, 0, 0, 1, 40, 0, 0))
							)
						 );

	}

	public static double convertMilesPerTime(
			double miles, double years, double days, double hours, double minutes, double seconds, double ms){
		return (miles / 
				(years * 365 * 24.00 +
						days * 24 +
						hours +
						minutes / 60.00 +
						seconds / 3600 +
						ms / 3600000));
	}

	public static double convertmphtokph (double mph){
		double kph;
		kph = mph * 1.60;
		return kph;
	}


}

//current result:
//The runner is running at 23.0400 Kilometers per hour.
