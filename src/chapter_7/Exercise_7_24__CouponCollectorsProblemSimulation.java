package chapter_7;

/*
 * <h1>(Simulation: coupon collector’s problem)</h1> Coupon collector is a classic statistics
 * problem with many practical applications. The problem is to pick objects from
 * a set of objects repeatedly and find out how many picks are needed for all the
 * objects to be picked at least once. A variation of the problem is to pick cards from
 * a shuffled deck of 52 cards repeatedly and find out how many picks are needed
 * before you see one of each suit. Assume a picked card is placed back in the deck
 * before picking another. Write a program to simulate the number of picks needed
 * to get four cards from each suit and display the four cards picked (it is possible a
 * card may be picked twice). Here is a sample run of the program:
 * 
 * Queen of Spades
 * 5 of Clubs
 * Queen of Hearts
 * 4 of Diamonds
 * Number of picks: 12
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-9
 */

public class Exercise_7_24__CouponCollectorsProblemSimulation
{
	public static int[][] deck = new int[52][2]; // [][0] = suit , [][1]
													// = rank.
	// ^ if [i][] == 0, that means a card has not been placed there.
	// making string to fetch names with
	public static String[] suitNames =
	{ null, "Spades", "Clubs", "Hearts", "Diamonds" };
	public static String[] rankNames =
	{ null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	public static int tries = 0;

	public static void main(String[] args)
	{
		// main method to call coupon collector method.
		couponCollector();
	}

	// couponCollector method
	public static void couponCollector()
	{
		// fill array with every card needed and shuffle the deck
		shuffleFillDeck();
		//testShowDeck();		// shuffleFillDeck seems to work fine
		countAndDisplayDeck();
	}

	// fill "deck" array with every cards in a random way.
	public static void shuffleFillDeck()
	{
		for (int j = 1; j < 5; ++j) // j = 0 == default original
		{
			for (int i = 1; i < 14; ++i)
			{
				do
				{
					int randomPlacement = (int) (Math.random() * 52);
					if (deck[randomPlacement][0] == 0)
					{
						deck[randomPlacement][0] = j;
						deck[randomPlacement][1] = i;
						break;
					}
				} while (true);
			}
		}
	}

	// method to read a card at [0][] and every time increment 'tries'...
	// then if it's a card that's needed display it and toggle that need...
	// after that, shuffle that card back into the deck.
	//
	public static void countAndDisplayDeck()
	{
		boolean[] suitFound =
		{ true, false, false, false, false };
		// take card from [0][], increment the try, if it's a needed card...
		while (!(suitFound[1] && suitFound[2] && suitFound[3] && suitFound[4]))
		{
			// increment tries
			++tries;
			if (suitFound[deck[0][0]] == false)
			{
				// displayCard(deck[0][0], deck[0][1])
				displayCard(deck[0][0], deck[0][1]);
				// boolean suitFound
				suitFound[deck[0][0]] = true;
			}
			// shuffle card 0 back into deck
			shuffleCardZero();
		}
		// Continue until all 4 types are found then print how many tries
		// "Number of picks: " output.
		System.out.println("Number of picks: " + tries);
	}

	public static void displayCard(int suit, int rank)
	{
		System.out.printf("%s of %s\n", rankNames[rank], suitNames[suit]);
	}
	
	public static void shuffleCardZero()
	{
		// get random number between/including 1 and 52
		int randomIndex = (int)(1 + Math.random() * 51);
		// swap values of [0][0] and [0][1] with [random][0] and [random][1]
		int tempValue0 = deck[0][0];
		int tempValue1 = deck[0][1];
		deck[0][0] = deck[randomIndex][0];
		deck[0][1] = deck[randomIndex][1];
		deck[randomIndex][0] = tempValue0;
		deck[randomIndex][1] = tempValue1;
	}
	
	public static void testShowDeck()
	{
		for(int i = 0; i < 52; ++i)
		{
			System.out.printf("%d: %s of %s\n", i, suitNames[deck[i][0]], rankNames[deck[i][1]]);
		}
	}
}
