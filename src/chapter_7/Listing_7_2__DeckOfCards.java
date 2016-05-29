package chapter_7;

/**
 * The problem is to create a program that will randomly select four cards from
 * a deck of cards. Say you want to write a program that will pick four cards at
 * random from a deck of 52 cards. All the cards can be represented using an
 * array named deck , filled with initial values 0 to 51 , as follows:
 * 
 * int[] deck = new int[52];
 * 
 * // Initialize cards
 * 
 * for (int i = 0; i < deck.length; i++)
 * 
 * deck[i] = i;
 * 
 * Card numbers 0 to 12 , 13 to 25 , 26 to 38 , and 39 to 51 represent 13
 * Spades, 13 Hearts, 13 Diamonds, and 13 Clubs, respectively, as shown in
 * Figure 7.2. cardNumber / 13 deter- mines the suit of the card and cardNumber
 * % 13 determines the rank of the card, as shown in Figure 7.3. After shuffling
 * the array deck , pick the first four cards from deck . The program displays
 * the cards from these four card numbers.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-29
 *
 */

public class Listing_7_2__DeckOfCards
{
	/** main method to call deckOfCardsShuffle method */
	public static void main(String[] args)
	{
		deckOfCardsShuffle();
	}
	/** method to create, shuffle and list first 4 cards */
	// /13 0 = Spades, 1 = Hearts, 2 = Diamonds, 3 = Clubs
	// 0 = ace, 1 = 2 ... 9 = 10, 10 = jack, 11 = queen, 12 = king
	public static void deckOfCardsShuffle()
	{
		int[] deck = new int[52];
		
		// Initialize cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;
		
		// shuffling cards, for loop with (int)(Math.random() * 52)
		for (int i = 0; i < deck.length; i++)
		{
			int randomIndex = deck[(int)(Math.random() * 52)];
			int temp = deck[i];
			deck[i] = deck[randomIndex];
			deck[randomIndex] = temp;
		}
		
		// String array to output name of suit.
		String[] suitName = {"Spades", "Hearts", "Diamonds", "Clubs"};
		
		// String array to output name of card in suit.
		String[] cardName = {"Ace", "Two", "Three", "Four", "Five", "Six"
				, "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		
		// read out the first 4 cards.
		// for loop to loop 4 times for the first four cards
		System.out.println("The first four random cards are:");
		for(int i = 0; i < 4; i++)
		{
			int suit = (int)(deck[i] / 13);
			int card = (int)(deck[i] % 13);
			System.out.printf("The %s of %s\n", cardName[card], suitName[suit]);
		}
	}
}
