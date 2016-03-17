package chapter_3;

public class Exercise_3_32__PointPosition {

	/*
(Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
y1), you can use the following condition to decide whether a point p2(x2, y2) is
on the left of the line, on the right, or on the same line (see Figure 3.11):


line = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)

if(line > 0) p2 is on the left side of the line
if(line == 0) p2 is on the same line
if(line < 0) p2 is on the right side of the line


Write a program that prompts the user to enter the three points for p0, p1, and p2
and displays whether p2 is on the left of the line from p0 to p1, on the right, or on
the same line. Here are some sample runs:

Enter three points for p0, p1, and p2: 4.4 2 6.5 9.5 -5 4
(-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)

Enter three points for p0, p1, and p2: 1 1 5 5 2 2
(2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)

Enter three points for p0, p1, and p2: 3.4 2 6.5 9.5 5 2.5
(5.0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
	 */

	public static void main(String[] args){

		// input
		double line;
		double[][] points = new double[3][2];		// points[0, 1, 2][x, y]
		String output;

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter three points for p0, p1, and p2: ");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				points[i][j] = input.nextDouble();
			}
		}
		input.close();
		
		// processing

		/// line = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
		line = (points[1][0] - points[0][0])*(points[2][1] - points[0][1]) - 
				(points[2][0] - points[0][0]) * (points[1][1] - points[0][1]);
		
		////(-5.0, 4.0) is on the left side of the line from (4.4, 2.0) to (6.5, 9.5)
		if(line > 0) output = String.format(
				"(%.1f, %.1f) is on the left side of the line from (%.1f, %.1f) to (%.1f, %.1f)", 
				points[2][0], points[2][1], points[0][0], points[0][1], points[1][0], points[1][1]);
		
		////(2.0, 2.0) is on the line from (1.0, 1.0) to (5.0, 5.0)
		else if(line == 0) output = String.format(
				"(%.1f, %.1f) is on the line from (%.1f, %.1f) to (%.1f, %.1f)", 
				points[2][0], points[2][1], points[0][0], points[0][1], points[1][0], points[1][1]);
		
		////(5.0, 2.5) is on the right side of the line from (3.4, 2.0) to (6.5, 9.5)
		else if(line < 0) output = String.format(
				"(%.1f, %.1f) is on the right side of the line from (%.1f, %.1f) to (%.1f, %.1f)", 
				points[2][0], points[2][1], points[0][0], points[0][1], points[1][0], points[1][1]);
		else output = "\n Opps. Something wrong happened. ";
		
		
		// output
		System.out.print(output);

	}

}

// Completed by William ODieLag Pennington on 3/17/2016;