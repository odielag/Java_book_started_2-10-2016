package chapter_4;

import java.util.Scanner;

public class Exercise_4_24__OrderThreeCities {
	
	/*
(Order three cities) Write a program that prompts the user to enter three cities and
displays them in ascending order. Here is a sample run:

first city: Chicago
second city: Los Angeles
third city: Atlanta
cities in alphabetical order are Atlanta Chicago Los Angeles
	 */
	
	public static void main(String[] args) {
		
		// input
		Scanner input = new Scanner(System.in);
		String[] cities = new String[3];
		String temp;

		System.out.print("first city: ");
		cities[0] = input.nextLine();
		System.out.print("second city: ");
		cities[1] = input.nextLine();
		System.out.print("third city: ");
		cities[2] = input.nextLine();
		input.close();
		
		// processing
		for (int j = 0; j < cities.length - 1; j++){
			for (int i = j + 1; i < cities.length; i++){
				if (cities[j].compareTo(cities[i]) > 0){
					temp = cities[i];
					cities[i] = cities[j];
					cities[j] = temp;
				}
				/*	//DEBUG
				System.out.printf("\nj: %d i: %d cities[j]: %s cities[i]: %s\n", 
						j, i, cities[j], cities[i]);
				for(int k = 0; k < cities.length; k++){
					System.out.println(cities[k] + " ");
				}
				*/
			}
		}
		
		// output
		System.out.print("cities in alphabetical order are ");
		for (int i = 0; i < cities.length; i++) {
			System.out.print(cities[i] + " ");
		}
		
	}

}
