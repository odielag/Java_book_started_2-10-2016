package chapter_3;

public class Exercise_3_24__PickACard {
	
	/*
(Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank ( Ace , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ,
Jack , Queen , King ) and suit ( Clubs , Diamonds , Hearts , Spades ) of the card.
Here is a sample run of the program:

The card you picked is Jack of Hearts
	 */

	public static void main(String[] args){
		
		// input
		String[] rankArray = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
				"Nine", "Ten", "Jack", "Queen", "King"};
		String[] suitArray = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String rank;
		String suit;
		String output;
		
		// processing
		rank = rankArray[(int)(Math.random() * 12)];
		suit = suitArray[(int)(Math.random() * 4)];
		output = String.format("The card you picked is %s of %s", rank, suit);
		
		// output
		System.out.println(output);
	}
}

// Completed by William ODieLag Pennington on 3/14/2016;