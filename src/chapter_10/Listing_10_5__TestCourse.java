package chapter_10;

import chapter_10.Listing_10_6__Course;

public class Listing_10_5__TestCourse
{
	public static void main(String[] args)
	{
		Listing_10_6__Course course1 = new Listing_10_6__Course("Data Structures");
		Listing_10_6__Course course2 = new Listing_10_6__Course("Database Systems");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of students in course1: "
				+ course1.getLengthOfStudentsArray());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getLengthOfStudentsArray(); i++)
			System.out.print(students[i] + ", ");
		
		System.out.println();
		System.out.print("Number of students in course2: "
				+ course2.getLengthOfStudentsArray());
		
		// testing
		System.out.println();
		int[] randomArray = {13, 45, 23, 45, 67};
		int[] tempRandomArray = new int[randomArray.length];
		System.arraycopy(randomArray, 0, tempRandomArray, 0, randomArray.length);
		System.out.println(randomArray[4]);
		
		
		
		
	}
}
