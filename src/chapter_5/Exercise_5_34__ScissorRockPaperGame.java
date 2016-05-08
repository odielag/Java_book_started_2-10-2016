package chapter_5;

import java.util.Scanner;

/**
 * <h1>(Game: scissor, rock, paper)</h1> Programming Exercise 3.17 gives a
 * program that plays the scissor-rock-paper game. Revise the program to let the
 * user continu- ously play until either the user or the computer wins more than
 * two times than its opponent.
 * 
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-5-7
 *
 */

public class Exercise_5_34__ScissorRockPaperGame
{

	/*
	 * (Game: scissor, rock, paper) Write a program that plays the popular
	 * scissor-rock- paper game. (A scissor can cut a paper, a rock can knock a
	 * scissor, and a paper can wrap a rock.) The program randomly generates a
	 * number 0 , 1 , or 2 representing scissor, rock, and paper. The program
	 * prompts the user to enter a number 0 , 1 , or 2 and displays a message
	 * indicating whether the user or the computer wins, loses, or draws. Here
	 * are sample runs:
	 * 
	 * scissor (0), rock (1), paper (2): 1 The computer is scissor. You are
	 * rock. You won
	 * 
	 * scissor (0), rock (1), paper (2): 2 The computer is paper. You are paper
	 * too. It is a draw
	 */

	public static void main(String[] args)
	{

		// input
		int guess;
		int random;
		String[] names =
		{ "scissor", "rock", "paper" };
		String output = "error, String output not defined.";
		int userWins = 0, computerWins = 0;
		Scanner input = new Scanner(System.in);

		// Start loop with the condition that playerWins - computerWins > 2 ||
		// computerWins - playerWins > 2
		while (Math.abs(userWins - computerWins) <= 2)
		{
			System.out.print("scissor (0), rock (1), paper (2): ");
			guess = input.nextInt();
			
			// processing
			random = (int) (Math.random() * 3);

			if (guess == random)
			{
				output = String.format("The computer is %s. You are %s too. It is a draw", names[random], names[guess]);
			} else if (guess == random - 2 || guess == random + 1)
			{
				userWins++;
				output = String.format("The computer is %s. You are %s. You won", names[random], names[guess]);
			} else if (guess == random - 1 || guess == random + 2)
			{
				computerWins++;
				output = String.format("The computer is %s. You are %s. You lost", names[random], names[guess]);
			}
			
			// output
			System.out.println(output);
			System.out.printf("Computer Wins: %d User Wins: %d\n", computerWins, userWins);
		}
		if (computerWins > userWins)
			System.out.println("The computer is the final winner.");
		else
			System.out.println("You are the final winner.");
		input.close();
	}

}
