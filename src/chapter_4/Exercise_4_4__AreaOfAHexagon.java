package chapter_4;

public class Exercise_4_4__AreaOfAHexagon {
	
	/*
(Geometry: area of a hexagon) The area of a hexagon can be computed using the
following formula ( s is the length of a side):

Area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));

Write a program that prompts the user to enter the side of a hexagon and displays
its area. Here is a sample run:

Enter the side: 5.5
The area of the hexagon is 78.59
	 */

	public static void main(String[] args){
		
		System.out.print("Enter the side: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		double s = input.nextDouble();
		input.close();
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6));
		System.out.printf("The area of the hexagon is %.2f", area);
		
	}
	
}
