package chapter_1;

public class Exercise1_13 {
	
	/*
	 * (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the fol-
lowing 2 * 2 system of linear equation:

ax + by = e

cx + dy = f		

     ed - bf
x = ---------
     ad - bc

     af - ec
y = ---------
	 ad - bc


Write a program that solves the following equation and displays the value for x and y :
3.4x + 50.2y = 44.5
2.1x + .55y = 5.9
	 */

	public static void main(String[] args) {
		
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = .55;
		double e = 44.5;
		double f = 5.9;
				
		double x = (e*d - b*f) / (a*d - b*c);

		double y = (a*f - e*c) / (a*d - b*c);
		
		System.out.printf("Results:\nx = %f\ny = %f", x, y);
		
	}

}

//Results//
/*
Results:
x = 2.623901
y = 0.708740
*/