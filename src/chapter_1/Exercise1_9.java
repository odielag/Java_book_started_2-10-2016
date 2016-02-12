package chapter_1;

public class Exercise1_9 {
	
	/*
	 * (Area and perimeter of a rectangle) Write a program that displays the area and
perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
formula:
area = width * height
	 */

	public static void main(String[] args) {
		
		double width = 4.5;
		double height = 7.9;
		double perimeter = width * 2 + height * 2;
		double area = width * height;
		System.out.printf("Rectangle perimeter: %f\n"
				+ "Rectangle area: %f\n", perimeter, area);

	}

}

//finished//