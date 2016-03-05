package chapter_3;

public class CheckPoint_3_31__ {
	
	/*
What is x after the following if-else statement is executed? Use a switch state-
ment to rewrite it and draw the flowchart for the new switch statement.

int x = 1, a = 3;
if (a == 1)
x += 5;
else if (a == 2)
x += 10;
else if (a == 3)
x += 16;
else if (a == 4)
x += 34;
	 */
	
	// x = 17
	
	/*
	public static void main(String[] args){
	
	int x = 1, a = 3;
	
		switch (a){
			case 1: x += 5; break;
			case 2: x += 10; break;
			case 3: x += 16; break;
			case 4: x += 34; break;
			default: System.exit(1);
		}
	
			System.out.println("x: " + x);
	
	}

	 */

	public static void main(String[] args){
		
	int x = 1, a = 3;
	
		switch (a){
			case 1: x += 5; break;
			case 2: x += 10; break;
			case 3: x += 16; break;
			case 4: x += 34; break;
			default: System.exit(1);
		}
	
			System.out.println("x: " + x);
	
	}
}
