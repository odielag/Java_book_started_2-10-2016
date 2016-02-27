package chapter_3;

public class CheckPoint_3_9__ {

	public static void main(String[] args) {

		// input
		int x, y, z;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("The value of x: ");
		x = input.nextInt();
		System.out.printf("The value of y: ");
		y = input.nextInt();
		input.close();

		// processing
		if ( x > 2)
			if (y > 2) {
				z = x + y;
				System.out.println("z is " + z);
			}
			else
				System.out.println("x is " + x);

		// output

	}

}
