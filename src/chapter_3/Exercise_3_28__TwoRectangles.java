package chapter_3;

public class Exercise_3_28__TwoRectangles {

	/*
(Geometry: two rectangles) Write a program that prompts the user to enter the
center x-, y-coordinates, width, and height of two rectangles and determines
whether the second rectangle is inside the first or overlaps with the first, as shown
in Figure 3.9. Test your program to cover all cases.


Here are the sample runs:

Enter r1's center x-, y-coordinates, width, and height: 2.5 4 2.5 43
Enter r2's center x-, y-coordinates, width, and height: 1.5 5 0.5 3
r2 is inside r1

Enter r1's center x-, y-coordinates, width, and height: 1 2 3 5.5
Enter r2's center x-, y-coordinates, width, and height: 3 4 4.5 5
r2 overlaps r1

Enter r1's center x-, y-coordinates, width, and height: 1 2 3 3
Enter r2's center x-, y-coordinates, width, and height: 40 45 3 2
r2 does not overlap r1
	 */

	public static void main(String[] args){

		// input
		double r1x, r1y, r1width, r1height;
		double r2x, r2y, r2width, r2height;
		String output;
		double[][] r1 = new double[2][2];		// r1[0][0] = //r1[x][leftmost or downmost]
		double[][] r2 = new double[2][2];		// r2[y][rightmost or upmost]

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		r1x = input.nextDouble();
		r1y = input.nextDouble();
		r1width = input.nextDouble();
		r1height = input.nextDouble();
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		r2x = input.nextDouble();
		r2y = input.nextDouble();
		r2width = input.nextDouble();
		r2height = input.nextDouble();
		input.close();

		// processing
		r1[0][0] = r1x - r1width;
		r1[1][0] = r1y - r1height;
		r1[0][1] = r1x + r1width;
		r1[1][1] = r1y + r1height;

		r2[0][0] = r2x - r2width;
		r2[1][0] = r2y - r2height;
		r2[0][1] = r2x + r2width;
		r2[1][1] = r2y + r2height;


		if		// inside
		((((r1[0][0] < r2[0][0] && r2[0][0] < r1[0][1]) &&		// low x check
				(r1[1][0] < r2[1][0] && r2[1][0] < r1[1][1]))		// low y check	
				&&		
				((r1[0][0] < r2[0][0] && r2[0][0] < r1[0][1]) &&		// low x check
						(r1[1][0] < r2[1][1] && r2[1][1] < r1[1][1])))		// high y check						
				&&
				(((r1[0][0] < r2[0][1] && r2[0][1] < r1[0][1]) &&		// high x check
						(r1[1][0] < r2[1][0] && r2[1][0] < r1[1][1]))		// low y check
						&&		
						((r1[0][0] < r2[0][1] && r2[0][1] < r1[0][1]) &&		// high x check		
								(r1[1][0] < r2[1][1] && r2[1][1] < r1[1][1]))))		// high y check		
			output = "r2 is inside r1";


		else if		// overlap
		((((r1[0][0] < r2[0][0] && r2[0][0] < r1[0][1]) &&		// low x check
				(r1[1][0] < r2[1][0] && r2[1][0] < r1[1][1]))		// low y check	
				||		
				((r1[0][0] < r2[0][0] && r2[0][0] < r1[0][1]) &&		// low x check
						(r1[1][0] < r2[1][1] && r2[1][1] < r1[1][1])))		// high y check						
				||
				(((r1[0][0] < r2[0][1] && r2[0][1] < r1[0][1]) &&		// high x check
						(r1[1][0] < r2[1][0] && r2[1][0] < r1[1][1]))		// low y check
						||		
						((r1[0][0] < r2[0][1] && r2[0][1] < r1[0][1]) &&		// high x check		
								(r1[1][0] < r2[1][1] && r2[1][1] < r1[1][1]))))		// high y check		
			output = "r2 overlaps r1";

		else output = "r2 does not overlap r1";

		// output
		System.out.println(output);

	}

}
