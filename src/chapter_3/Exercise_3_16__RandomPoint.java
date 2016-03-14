package chapter_3;

public class Exercise_3_16__RandomPoint {
	
	/*
(Random point) Write a program that displays a random coordinate in a rectangle.
The rectangle is centered at (0, 0) with width 100 and height 200.
	 */
	
	public static void main(String[] args){
		
		// input
		String positiveHorizontal, positiveVertical;
		int horizontal, vertical;
		
		// processing
		if((int)(Math.random() * 2) == 1)
			positiveHorizontal = "";
		else
			positiveHorizontal = "-";
		
		if((int)(Math.random() * 2) == 1)
			positiveVertical = "";
		else
			positiveVertical = "-";
		
		horizontal = (int)(Math.random() * 100);
		vertical = (int)(Math.random() * 200);
				
		// output
		System.out.printf("(%s%d,%s%d)", positiveHorizontal, horizontal, positiveVertical, vertical);
		
	}

}

// Finished by William ODieLag Pennington on 3/14/2016;