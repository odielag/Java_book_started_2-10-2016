package chapter_3;

public class Exercise_3_22__PointInACircle {
	
	/*
(Geometry: point in a circle?) Write a program that prompts the user to enter a
point ( x , y ) and checks whether the point is within the circle centered at ( 0 , 0 )
with radius 10 . For example, ( 4 , 5 ) is inside the circle and ( 9 , 9 ) is outside the
circle, as shown in Figure 3.7a.

(Hint: A point is in the circle if its distance to ( 0 , 0 ) is less than or equal to 10 .
The formula for computing the distance is:

Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))

Test your program to cover all cases.) Two sample runs are shown below.

Enter a point with two coordinates: 4 5
Point (4.0, 5.0) is in the circle

Enter a point with two coordinates: 9 9
Point (9.0, 9.0) is not in the circle
	 */

	public static void main(String[] args){
		
		// input
		double x2;		// user inputed point
		double y2;		// user inputed point
		double x1 = 0;	// center of circle
		double y1 = 0;	// center of circle
		double distance;
		String output;
		
		System.out.println("Enter a point with two coordinates: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		
		// processing
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		if(distance <= 10) output = String.format("Point (%.1f, %.1f) is in the circle",
				x2, y2);
		else if(distance > 10) output = String.format("Point (%.1f, %.1f) is not in the circle",
				x2, y2);
		else output = "_What the... something didn't work.";
		
		// output
		System.out.println(output);
		
	}
	
}

// Completed by William ODieLag Pennington on 3/14/2016;