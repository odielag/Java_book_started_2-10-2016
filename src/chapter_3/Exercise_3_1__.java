package chapter_3;

public class Exercise_3_1__ {
	
	/*
(Algebra: solve quadratic equations) The two roots of a quadratic equation
ax 2 + bx + c = 0 can be obtained using the following formula:

r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

discriminant = (Math.pow(b, 2) - 4 * a * c)

 is called the discriminant of the quadratic equation. If it is positive, the
equation has two real roots. If it is zero, the equation has one root. If it is negative,
the equation has no real roots.

Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0 , display one root. Otherwise, display “The equation
has no real roots”.

Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
sample runs.

Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803

Enter a, b, c: 1 2.0 1
The equation has one root -1

Enter a, b, c: 1 2 3
The equation has no real roots
	 */

	public static void main(String[] args) {
		
		// input
		double a, b, c, r1, r2, discriminant;
		String output = "";
		
		System.out.println("Enter a, b, c: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		input.close();
				
		// processing
		discriminant = (Math.pow(b, 2) - 4 * a * c);
		
		if (discriminant > 0){
			r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			output = ("The equation has two roots " + Double.toString(r1)
				+ " and " + Double.toString(r2));
		}
		else if (discriminant == 0){
			r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
			if (r1 == 0 || r1 != 0)
				output = ("The equation has one root " + Double.toString(r1));
			else
				output = ("The equation has one root " + Double.toString(r2));
		}
		else 
			output = ("The equation has no real roots");
				
		
		// output
		System.out.println(output);
	}

}

// Finished by William ODieLag Pennington on 3/5/2016;