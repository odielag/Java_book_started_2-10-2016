package chapter_4;

import java.util.Scanner;

public class Exercise_4_2__AreaOfAPentagon {
	
	/*
4.1
(Geometry: area of a pentagon) Write a program that prompts the user to enter
the length from the center of a pentagon to a vertex and computes the area of the
pentagon, as shown in the following figure.


The formula for computing the area of a pentagon is 

area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5))

where s is the length of a side. The side can be computed using the formula 

s = 2 * r *Math.sin(Math.PI / 5)

where r is the length from the center of a pentagon to a vertex. Round up two digits
after the decimal point. Here is a sample run:

Enter the length from the center to a vertex: 5.5
The area of the pentagon is 71.92
	 */

	public static void main(String[] args){
		
		// input
		double area;
		double s;
		double r;
		
		System.out.print("Enter the length from the center to a vertex: ");
		Scanner input = new Scanner(System.in);
		r = input.nextDouble();
		input.close();
		
		// processing
		s = 2 * r * Math.sin(Math.PI / 5);
		area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));
		
		// output
		System.out.printf("The area of the pentagon is %.2f", area);
		
	}
	
}

// Completed on 4/2/2016 by William ODieLag Pennington;