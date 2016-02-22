package chapter_2;

public class Exercise_2_9__Acceleration {
	
	/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change, as shown in the following formula:

a = (v1 - v0) / t;

Write a program that prompts the user to enter the starting velocity v 0 in meters/
second, the ending velocity v 1 in meters/second, and the time span t in seconds,
and displays the average acceleration. Here is a sample run:

Enter v0, v1, and t: 5.5 50.9 4.5
The average acceleration is 10.0889
	 */

	private static double v0, v1, t, a;
	
	public static void main(String[] args) {
		
		//input
		System.out.printf("Enter v0, v1, and 5: \t");
		java.util.Scanner input = new java.util.Scanner(System.in);
		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		input.close();
		
		//processing
		a = (v1 - v0) / t;
		
		
		//output
		System.out.printf("The average acceleration is %.4f", a);
		
	}

}

//Finished by William ODieLag Pennington
