package chapter_3;

public class Exercise_3_14__GameHeadsOrTails {

	/*
(Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1 ,
which represents head or tail. The program prompts the user to enter a guess and
reports whether the guess is correct or incorrect.
	 */

	public static void main(String[] args){

		// input
		boolean heads = false;
		String guess = "";
		boolean again = true;
		String yes = "";
		int roll;
		String good;
		java.util.Scanner input = new java.util.Scanner(System.in);

		while (again){
			System.out.print("heads or tails? ");
			guess = input.next().toLowerCase();

			// processing
			roll = (int)(Math.random() * 2);

			if (guess == "heads" || guess == "head") heads = true;
			else heads = false;

			if(roll == 1 && heads == true || roll == 0 && heads == false) 
				good = "Good";
			else
				good = "Bad";

			// output
			System.out.printf("Heads: %b\nGuess: %s\n%s guess!", heads, guess, good);			

			System.out.printf("\n\nWould you like to guess again? (yes or no) ");
			yes = input.next();
			if (yes.equals("yes")) again = true;
			else again = false;
				System.out.printf("\n");				
		}
		
		input.close();
	}
}
