package chapter_2;

public class Exercise_2_3__ConvertFeetToMeters {
	
	/*
(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
	 */

	static double feet, meters;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("Enter a value for feet: \t\n");
		feet = input.nextDouble();
		input.close();
		
		//processing
		meters = feet / (1 / 0.305);
		
		//output
		System.out.printf("%f feet is %f meters\n", feet, meters);
		
	}

}

//Finished.
//William ODieLag Pennington