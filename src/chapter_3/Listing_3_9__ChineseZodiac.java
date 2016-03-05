package chapter_3;

public class Listing_3_9__ChineseZodiac {
	
	/*
Now let us write a program to find out the Chinese Zodiac sign for a given year. The
Chinese Zodiac is based on a twelve-year cycle, with each year represented by an animal—
monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon, snake, horse, or sheep—in this cycle,
as shown in Figure 3.6.

Note that year % 12 determines the Zodiac sign. 1900 is the year of the rat because 1900
% 12 is 4 . Listing 3.9 gives a program that prompts the user to enter a year and displays the
animal for the year.
	 */

	public static void main(String[] args) {

		// input
		String[] zodiac = 
			{"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", 
					"dragon", "snake", "horse", "sheep"};
		String animal;
		int year;
		
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.printf("Please enter a year: ");
		year = input.nextInt();
		input.close();
		
		// processing
		animal = zodiac[year % 12];
		
		// output
		System.out.printf("%d is the year of the %s", year, animal);

	}

}
