package chapter_4;

public class Exercise_4_7__CornerPointCoordinates {

	/*
(Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts
the user to enter the radius of the bounding circle of a pentagon and displays the
coordinates of the five corner points on the pentagon. Here is a sample run:

Enter the radius of the bounding circle: 100
The coordinates of five points on the pentagon are
(95.1057, 30.9017)
(0.000132679, 100)
(-95.1056, 30.9019)
(-58.7788, -80.9015)
(58.7782, -80.902)
	 */

	public static void main(String[] args) {

		// input
		double r;				// radius of the overlying circle
		double[][] point = new double[2][5];		// double[x, y][0, 1, 2, 3, 4]
		double a; 				// the angle

		System.out.print("Enter the radius of the bounding circle: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		r = input.nextDouble();
		input.close();

		// processing
		for(int i = 0; i < point[0].length; i++) {
			a = (-(double)i) * ((Math.PI * 2) / 5) + ((Math.PI * 2) / 5);
			point[0][i] = r * Math.sin(a);
			point[1][i] = r * Math.cos(a);
		}
		
		// System.out.printf("\n%f\n", Math.toRadians(180));
		
		// output
		System.out.print("The coordinates of five points on the pentagon are\n");
		for(int i = 0; i < point[0].length; i++) {
			System.out.printf("(%f, %f)\n", point[0][i], point[1][i]);
		}

	}

}

// Completed by William ODieLag Pennington and peeps on 4/8/2016;