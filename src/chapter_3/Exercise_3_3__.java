package chapter_3;

public class Exercise_3_3__ {
	
	/*
(Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0 , report
that “The equation has no solution.”

Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0

Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution
	 */

	public static void main(String[] args) {
		
		// input
		double a, b, c, d, e, f;
		String out;
		
		System.out.print("Please enter a, b, c, d, e, f: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		d = input.nextDouble();
		e = input.nextDouble();
		f = input.nextDouble();
		input.close();
		
		// processing
		if(a* d - b * c == 0)
			out = "The equation has no solution.";
		else {
			double x = (e*d - b*f) / (a*d - b*c);
			double y = (a*f - e*c) / (a*d - b*c);
			out = String.format("x is %.1f and y is %.1f", x, y);
		}
		// output
		System.out.println(out);
		
	}

}

// Finished by William ODieLag Pennington on 3/6/2016;