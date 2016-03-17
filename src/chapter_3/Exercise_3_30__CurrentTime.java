package chapter_3;

public class Exercise_3_30__CurrentTime {
	
	/*
(Current time) Revise Programming Exercise 2.8 to display the hour using a
12-hour clock. Here is a sample run:

Enter the time zone offset to GMT: -5
The current time is 4:50:34 AM
	 */

	
	/* Exercise 2.8
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone. Here
is a sample run:

Enter the time zone offset to GMT: −5
The current time is 4:50:34
	 */
	
	public static void main(String[] args) {
		
		//input
		long totalMilliseconds, totalSeconds, currentSecond, totalMinutes,
		currentMinute, totalHours, currentHour, gmtOffset;
		String postMeridian;
		
		System.out.printf("Enter the time zone offset to GMT: ");		
		java.util.Scanner input = new java.util.Scanner(System.in);
		gmtOffset = input.nextLong();
		input.close();
		
		//processing
		totalMilliseconds = System.currentTimeMillis();
		totalSeconds = totalMilliseconds / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
		currentHour += gmtOffset;
		
		if (currentHour < 0)
			currentHour += 24;
		
		if (currentHour >= 12){
			postMeridian = "PM";
			currentHour -= 12;
		}
		else
			postMeridian = "AM";
		
		//output
		System.out.printf("The current time is %02d:%02d:%02d %s",
				currentHour, currentMinute, currentSecond, postMeridian);
		
	}
		
}

// Completed by William ODieLag Pennington on 3/16/2016;