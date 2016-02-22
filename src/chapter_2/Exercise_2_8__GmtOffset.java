package chapter_2;

public class Exercise_2_8__GmtOffset {
	
	/*
(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone. Here
is a sample run:

Enter the time zone offset to GMT: −5
The current time is 4:50:34
	 */
	
	private static long totalMilliseconds, totalSeconds, currentSecond, totalMinutes,
	currentMinute, totalHours, currentHour, gmtOffset;


	public static void main(String[] args) {
		
		//input
		System.out.printf("Enter the time zone offset to GMT: \t");		
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
		
		//output
		System.out.printf("The current time is %02d:%02d:%02d",
				currentHour, currentMinute, currentSecond);
		
	}
	
	public static String getGmtPlus(long gmtOffset){
		totalMilliseconds = System.currentTimeMillis();
		totalSeconds = totalMilliseconds / 1000;
		currentSecond = totalSeconds % 60;
		totalMinutes = totalSeconds / 60;
		currentMinute = totalMinutes % 60;
		totalHours = totalMinutes / 60;
		currentHour = totalHours % 24;
		currentHour += gmtOffset;
		return String.format("The current time is %02d:%02d:02d", currentHour, currentMinute, currentSecond);
	}

}
