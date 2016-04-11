package chapter_4;

import java.util.Scanner;

public class Exercise_4_18__StudentMajorAndStatus {
	
	/*
(Student major and status) Write a program that prompts the user to enter two
characters and displays the major and status represented in the characters. The first
character indicates the major and the second is number character 1, 2, 3, 4, which
indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
Here is a sample run:

Enter two characters: M1
Mathematics Freshman

Enter two characters: C3
Computer Science Junior

Enter two characters: T3
Invalid input
	 */

	public static void main(String[] args) {
		
		// input
		String[] major = {"Mathematics", "Computer Science", "Information Technology", "Error"};
		String[] year = {"Freshman", "Sophomore", "Junior", "Senior"};
		Scanner input = new Scanner(System.in);
		String characters;
		int yearI;
		int majorI = 4;
		
		System.out.print("Enter two characters: ");
		characters = input.nextLine();
		input.close();
		
		// processing
		yearI = characters.charAt(1) - 49;
			//System.out.print(year[yearI]);
		switch (characters.toUpperCase().charAt(0)) {
		case 'M': majorI = 0; break;
		case 'C': majorI = 1; break;
		case 'I': majorI = 2; break;
		default: System.out.print("Invalid input"); System.exit(0); break;
		}
		
		// output
		System.out.printf("%s %s", major[majorI], year[yearI]);
		
	}
	
}

// Completed by William ODieLag Pennington on 4/11/2016;