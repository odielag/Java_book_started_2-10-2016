package chapter_3;

public class CheckPoint_3_35 {
	
	/*
Rewrite the following conditional expressions using if-else statements.
a. score = (x > 10) ? 3 * scale : 4 * scale;
b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
c. System.out.println((number % 3 == 0) ? i : j);
	 */

	/*
	public static void main(String[] args){
		int score, x, scale;
		double tax, income;
		
		// a.
			// input
			System.out.printf("Scale (in integer): ");
			java.util.Scanner input = new java.util.Scanner(System.in);
			scale = input.nextInt();
			System.out.printf("x (in integer): ");
			x = input.nextInt();
						
			// processing
			if (score == (x > 10)){
				score = 3 * scale;
			}
			else {
				score = 4 * scale;
			}
	
			// output
			System.out.printf("With a scale of %d and an x of %d\n
				The score is: %d", scale, x, score);

	}
	 */
	
	
	public static void main(String[] args){
		int score, x, scale, number, i, j;
		double tax, income;
		
		// a.
			// input
			System.out.printf("Scale (in integer): ");
			java.util.Scanner input = new java.util.Scanner(System.in);
			scale = input.nextInt();
			System.out.printf("x (in integer): ");
			x = input.nextInt();
						
			// processing
			if (x > 10){
				score = 3 * scale;
			}
			else {
				score = 4 * scale;
			}
	
			// output
			System.out.printf("With a scale of %d and an x of %d\n" +
				"The score is: %d", scale, x, score);

		//	b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
			// input
			System.out.printf("\n\nPlease enter income: ");
			income = input.nextDouble();
			
			// processing
			if (income > 10000) tax = income * 0.2; else tax = income * 0.17 + 1000;
			
			// output
			System.out.printf("With an income of %.2f the tax will be %.2f", income, tax);
			
		// c. System.out.println((number % 3 == 0) ? i : j);
			// input
			System.out.printf("\n\nPlease insert a number (integer): ");
			number = input.nextInt();
			System.out.println("What is i?\t");
			i = input.nextInt();
			System.out.println("What is j?\t");
			j = input.nextInt();
			input.close();
			
			// processing
			// output
			
			if (number % 3 == 0) System.out.println(i); else System.out.println(j);
	}
	
}

// Finished by William ODieLag Pennington on 3/4/2016;
