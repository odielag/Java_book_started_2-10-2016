package chapter_4;

public class Exercise_4_6__RandomPointsOnACircle {

	/*
(Random points on a circle) Write a program that generates three random points
on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
angle a in radians between 0 and 2p, as shown in Figure 4.7b and the point deter-
mined by this angle is (r*cos(a), r*sin(a)).)

x = r * Math.cos(a);
y = r * Math.sin(a);

FIGURE 4.7 (a) A triangle is formed from three random points on the circle. (b) A random
point on the circle can be generated using a random angle a.
	 */

	public static void main(String[] args) {

		// input
		double a;										// angle from 0 to 2
		double[][] point = new double[2][3];			// double [x, y][0,1,2]
		// double[] angle = new double[3];				// The final 3 angles as the answer
		String output;

		// processing
		for(int i = 0; i < point[0].length; i++) {
			a = Math.random() * 2;
			point[0][i] = 40 * Math.cos(a);
			point[1][i] = 40 * Math.sin(a);
		}
		output = Listing_4_1__ComputeAngles.ComputeAngles
				(point[0][0], point[1][0], point[0][1], point[1][1], point[0][2], point[1][2]);

		// output
		System.out.print(output);
	}

}

// Completed by William ODieLag Pennington on 4/8/2016;