package chapter_2;

public class Chapter2_22__TimeGMT {

	public static void main(String[] args) {
		
		//System.out.println( 4 / (3*(r + 34)) - 9*(a + bc) + (3+d*(2+a))/(a + b*d));
		//System.out.println(5.5 * (Math.pow((r + 2.5), (2.5+t));

		//2.12
		long totalMilliseconds = System.currentTimeMillis(); //1 from pg52
		long totalSeconds = totalMilliseconds / 1000; //2
		long currentSecond = totalSeconds % 60; //3
		long totalMinutes = totalSeconds / 60; //4
		long currentMinute = totalMinutes % 60; //5
		long totalHours = totalMinutes / 60; //6
		long currentHour = totalHours % 24; //7
		
		// Display results
		System.out.println("Current time is " + currentHour + ":" + 
		currentMinute + ":" + currentSecond + " GMT");
		
	}

}
