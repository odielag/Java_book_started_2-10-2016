package chapter_3;

public class CheckPoint_3_40__ {

	/*
a. Is (x > 0 && x < 10) the same as ((x > 0) && (x < 10)) ?
b. Is (x > 0 || x < 10) the same as ((x > 0) || (x < 10)) ?
c. Is (x > 0 || x < 10 && y < 0) the same as (x > 0 || (x < 10 && y < 0)) ?
	 */

	/*

my guesses:
a. true
b. true
c. false // I was wrong. && has higher precedence than ||

c.
(trueOrFalse || trueOrFalse && trueOrFalse) == (trueOrFalse || (trueOrFalse && trueOrFalse));

	 */

	public static void main(String[] args){
		float x, y;
		boolean a, b, c;
		y = 101;
		for(x = -50; x < 100; x++){
			for(y = 50; y > -100; y--){
				// a.
				System.out.printf(" a: %b",(x > 0 && x < 10) == ((x > 0) && (x < 10)));
				// b.
				System.out.printf(" b: %b",(x > 0 || x < 10) == ((x > 0) || (x < 10)));
				// c.
				System.out.printf(" c: %b\n",(x > 0 || x < 10 && y < 0) == (x > 0 || (x < 10 && y < 0)));
			}
		}
	}

}

// Finished by William ODieLag Pennington on 3/4/2016;
