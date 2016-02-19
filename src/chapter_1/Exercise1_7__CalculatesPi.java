package chapter_1;

public class Exercise1_7__CalculatesPi {

	public static void main(String[] args) {
		// some more math
		// I can't believe I actually created a program to begin calculating pi

		double stuff = 1;
		for(double i = 1;i < 1000000;i++){
			if ((i%2) == 0){
				stuff = stuff + (1 / (i * 2 + 1));
//debug//				System.out.println("odd/negative\ti=" + i);
			}
			if ((i%2) != 0){
				stuff = stuff + (-1 / (i * 2 + 1));
//debug//				System.out.println("even/positive\ti=" + i);
			}
//debug//			System.out.println(4 * stuff);
		}

		double pi = 4 * stuff;

		System.out.println(pi);
	}

}
