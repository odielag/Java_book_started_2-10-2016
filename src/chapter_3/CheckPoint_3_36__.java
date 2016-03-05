package chapter_3;

public class CheckPoint_3_36__ {

	/*
Write conditional expression that returns -1 or 1 randomly.
	 */
	
	public static void main(String[] args) {
		// input + processing
		int random = (int)(Math.random()*2);
		// processing + output
		System.out.println((random == 0) ? -1 : 1);
	}
}

// Finished by William ODieLag Pennington on 3/4/2016;