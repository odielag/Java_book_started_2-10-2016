package chapter_1;

public class Exercise1_12 {

	/*
	 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40  minutes,
and 35 seconds. Write a program that displays the average speed in kilometers per
hour. (Note that 1 mile is 1.6 kilometers.)
	 */

	public static void main(String[] args) {
		System.out.printf("The runner is running at " +
				(convertmphtokph
						(convertMilesYearsDaysHoursMinutesSecondsMilliseconds_ToMilesPerHour(
								24, 0, 0, 1, 40, 0, 0)
								)
						+ " Kilometers per hour."));

	}

	public static double convertMilesYearsDaysHoursMinutesSecondsMilliseconds_ToMilesPerHour(
			double miles, double years, double days, double hours, double minutes, double seconds, double ms){
		return (miles / 
				(years * 365 * 24 +
						days * 24 +
						hours +
						minutes / 60 +
						seconds / 3600 +
						ms / 3600000));
	}

	public static double convertmphtokph (double mph){
		double kph;
		kph = mph * 1.6;
		return kph;
	}


}

//current result:
//The runner is running at 23.040000000000006 Kilometers per hour.
