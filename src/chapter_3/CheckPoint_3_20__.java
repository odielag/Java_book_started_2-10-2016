package chapter_3;

public class CheckPoint_3_20__ {
	
	public static void main(String[] args) {
		
		//(a) Write a Boolean expression for |x - 5| < 4.5

		boolean a, b;
		double x = Math.random() * 20 - 10;
		System.out.printf("x = %f", x);
		a = Math.abs(x - 5) < 4.5;
		System.out.printf("\na: %b", a);

		//(b) Write a Boolean expression for |x - 5| > 4.5
		b = Math.abs(x-5) > 4.5;
		System.out.printf("\nb: %b", b);
		
	}

}

// Finished