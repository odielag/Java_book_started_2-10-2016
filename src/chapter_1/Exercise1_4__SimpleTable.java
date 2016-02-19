package chapter_1;

public class Exercise1_4__SimpleTable {

	public static void main(String[] args) {
		// This program is for outputting a table
		/* 
		 *  // example
		 *  
		 * a      a^2    a^3
		 * 1      1      1
		 * 2      4      8
		 * 3      9      27
		 * 4      16     64
		 * 
		 */

		int[] a = {1, 2, 3, 4};
		
		System.out.printf("a       a^2     a^3\n");
		for(int i = 0; i < 4; i++){
			System.out.println(a[i] + "\t" + Math.pow((a[i]),2) + "\t" + Math.pow(a[i],3));
		}
	}

}
