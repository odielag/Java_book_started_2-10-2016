package chapter_1;

public class exercise1_8 {

	/*
	 * (Area and perimeter of a circle) Write a program that displays the area and perim-
eter of a circle that has a radius of 5.5 using the following formula:
perimeter = 2 * radius * pi
area = radius * radius * pi
	 */

	public static void main(String[] args) {

		double radius = 5.5;
		double perimeter = 2 * radius * Math.PI;
		double area = radius * radius * Math.PI;
		System.out.printf("A circle with a radius of 5.5 has"
				+ " a perimeter of %f and an area of"
				+ " %f", perimeter, area);
		
	}

}

//finished//