package chapter_4;

public class Exercise_4_16__RandomCharacter {
	
	/*
(Random character) Write a program that displays a random uppercase letter
using the Math.random() method.
	 */

	public static void main(String[] args) {
		
		System.out.print(Character.toUpperCase((char)(int)(26 * Math.random() + 65)));
		
	}
	
}

// Completed by William ODieLag Pennington on 4/10/2016;