package chapter_2;

public class Exercise_2_2__Cylinder {
	
	/*
(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * p
volume = area * length
Here is a sample run:
	 */
	
	static double area, radius, length, volume;

	public static void main(String[] args) {
		// input
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("\nPlease enter the radius of the cylinder: \t");
		radius = input.nextDouble();
		System.out.printf("\nPlease enter the length of the cylinder: \t");
		length = input.nextDouble();
		input.close();
		
		//processing
		area = radius * radius * Math.PI;
		volume = area * length;
		
		//output
		System.out.printf("\nThe area is %f\nThe volume is %f", area, volume);
	}

}

//Finished
//~William ODieLag Pennington