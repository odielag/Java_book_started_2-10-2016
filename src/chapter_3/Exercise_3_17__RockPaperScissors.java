package chapter_3;

public class Exercise_3_17__RockPaperScissors {
	
	/*
(Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-
paper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0 , 1 , or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0 , 1 , or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws. Here are sample runs:

scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won

scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
	 */

	public static void main(String[] args){
		
		// input
		int guess;
		int random;
		String[] names = {"scissor", "rock", "paper"};
		String output = "error, String output not defined.";
		
		System.out.println("scissor (0), rock (1), paper (2): ");
		java.util.Scanner input = new java.util.Scanner(System.in);
		guess = input.nextInt();
		input.close();
		
		// processing
		random = (int)(Math.random() * 3);
		
		if (guess == random){
			output = String.format("The computer is %s. You are %s too. It is a draw",
					names[random], names[guess]);
		}
		else if (guess == random - 2 || guess == random + 1){
			output = String.format("The computer is %s. You are %s. You won",
					names[random], names[guess]);
		}
		else if (guess == random - 1 || guess == random + 2){
			output = String.format("The computer is %s. You are %s. You lost",
					names[random], names[guess]);
		}
		
		// output
		System.out.println(output);
	}
	
}

// Finished by William ODieLag Pennington on 3/14/2016;