package chapter_2;

public class Exercise_2_16__ {
	
	/*
(Geometry: area of a hexagon) Write a program that prompts the user to enter the
side of a hexagon and displays its area. The formula for computing the area of a
hexagon is

Area = ((3 * Math.pow(3, 0.5)) / 2 ) * Math.pow(s, 2); 

where s is the length of a side. Here is a sample run:

Enter the side: 5.5
The area of the hexagon is 78.5895
	 */
	
	private static double s; // side length of a hexagon
	private static double area; // area of a hexagon

	public static void main(String[] args) {
		
		// input
		System.out.printf("Enter the side: ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		s = input.nextDouble();
		input.close();
		
		// processing
		area = ((3 * Math.pow(3, 0.5)) / 2 ) * Math.pow(s, 2); 
		
		// output		
		System.out.printf("The area of the hexagon is %.4f", area);

	}

}

// Finished by William ODieLag Pennington