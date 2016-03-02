package chapter_3;

public class CheckPoint_3_19__BooleansShort {
	
	/*
(a) Write a Boolean expression that evaluates to true if a number stored in variable
num is between 1 and 100 . (b) Write a Boolean expression that evaluates to true if
a number stored in variable num is between 1 and 100 or the number is negative.
	 */

	public static void main(String[] args) {
		
		// input
		double number = Math.random() * 200 - 100;
		boolean a, b;
		
		// processing
			// a
			a = 100 > number && number > 1;
		
			// b
			b = (100 > number && number > 1) || number < 0;
		
		// output
		System.out.printf("number: %f\na: %b\nb: %b", number, a, b);
			
			
	}

}

