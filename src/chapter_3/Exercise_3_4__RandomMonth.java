package chapter_3;

public class Exercise_3_4__RandomMonth {
	
	/*
(Random month) Write a program that randomly generates an integer between 1
and 12 and displays the English month name January, February, ..., December for
the number 1, 2, ..., 12, accordingly.
	 */

	public static void main(String[] args) {
				
		// input
		String[] monthName = {null, "January", "February", "March", "April", "May", "June",
					"July", "August", "September", "October", "November", "December"};
		int monthNum = (int)(Math.random() * 12 + 1);
		
		// processing + output
		System.out.println(monthName[monthNum]);
		
	}

}
