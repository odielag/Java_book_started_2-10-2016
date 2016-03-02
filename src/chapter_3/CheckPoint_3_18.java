package chapter_3;

public class CheckPoint_3_18 {

	public static void main(String[] args) {

		boolean a, b, c, d, e, f;
		int x = 1;

		a = (true) && (3 > 4);			// my guess is false
		b = !(x > 0) && (x > 0);		// my guess is false
		c = (x > 0) || (x < 0);			// my guess is true
		d = (x != 0) || (x == 0);		// my guess is true
		e = (x >= 0) || (x < 0);		// my guess is true
		f = (x != 1) == !(x == 1);		// my guess is false // I was wrong

		boolean[] letters = {a, b, c, d, e, f};

		for(int i = 0; i < 6; i++){
			System.out.printf("%b\n", (letters[i]));
		}
	}
}

// Finished by William ODieLag Pennington 3/1/2016;