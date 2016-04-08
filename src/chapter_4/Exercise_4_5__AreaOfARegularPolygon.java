package chapter_4;

public class Exercise_4_5__AreaOfARegularPolygon {
	
	/*
(Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
which all sides are of the same length and all angles have the same degree (i.e., the
polygon is both equilateral and equiangular). The formula for computing the area
of a regular polygon is

area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n);

Here, s is the length of a side. Write a program that prompts the user to enter the
number of sides and their length of a regular polygon and displays its area. Here is
a sample run:

Enter the number of sides: 5
Enter the side: 6.5
The area of the polygon is 74.69017017488385
	 */

	public static void main(String[] args) {
		
		// input
		double n;		// number of sides to the polygon 
		double s;		// length of a side
		double area;	// area of the polygon
		
		System.out.print("Enter the number of sides: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		n = input.nextDouble();
		System.out.print("Enter the side: ");
		s = input.nextDouble();
		input.close();
		
		// processing
		area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
		
		// output
		System.out.printf("The area of the polygon is %f", area);		
		
	}
	
}
