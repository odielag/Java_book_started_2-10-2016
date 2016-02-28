package chapter_3;

public class CheckPoint_3_16_d__ {

	//d. Write an expression that returns 0 or 1 randomly.

	public static void main(String[] args) {
		for(int j = 0; j < 10; j++){
			for(int i = 0; i < 110; i++){
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println();
		}
	}

}

// Finished by William ODieLag Pennington on Feb 28, 2016
// that was fun.