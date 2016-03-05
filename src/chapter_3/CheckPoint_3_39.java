package chapter_3;

public class CheckPoint_3_39 {
	
	/*
Evaluate the following expressions:
2 * 2 - 3 > 2 && 4 – 2 > 5
2 * 2 - 3 > 2 || 4 – 2 > 5
	 */
	
	/*
	2 * 2 - 3 > 2 && 4 – 2 > 5
	(2 * 2) - 3 > 2 && 4 – 2 > 5
	4 - 3 > 2 && 4 – 2 > 5
	(4 - 3) > 2 && 4 – 2 > 5
	1 > 2 && 4 - 2 > 5
	1 > 2 && (4 - 2) > 5
	1 > 2 && 2 > 5	
	false && 2 > 5
	false	
	
	2 * 2 - 3 > 2 || 4 – 2 > 5
	(2 * 2) - 3 > 2 || 4 – 2 > 5
	4 - 3 > 2 || 4 – 2 > 5	
	(4 - 3) > 2 || 4 – 2 > 5
	1 > 2 || 4 – 2 > 5
	1 > 2 || (4 – 2) > 5
	1 > 2 || 2 > 5
	false || 2 > 5
	false || (2 > 5)
	false || false
	false
	 */
	

	public static void main(String[] args) {
		
		System.out.println(2 * 2 - 3 > 2 && 4 - 2 > 5);
		System.out.println(2 * 2 - 3 > 2 || 4 - 2 > 5);

	}

}

// Finished by William ODieLag Pennington as of 3/4/2016