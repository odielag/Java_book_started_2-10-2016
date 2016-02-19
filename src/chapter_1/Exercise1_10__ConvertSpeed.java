package chapter_1;

public class Exercise1_10__ConvertSpeed {
	
	/*
	 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
seconds. Write a program that displays the average speed in miles per hour. (Note
that 1 mile is 1.6 kilometers.)
	 */

	public static void main(String[] args) {
//test//		System.out.println(convertmphtokph(20));
//test//		System.out.println(convertkphtomph(20));
		//converting kilometers per minutes to kph
		double kph = convertkpmtokph(14, 45.5);
		double mph = convertkphtomph(kph);
		
		
		System.out.printf("The runner runs about %f mph.\n", mph);
	}
	
	public static double convertmphtokph (double mph){
		double kph;
		kph = mph * 1.6;
		return kph;
	}
	
	public static double convertkphtomph (double kph){
		double mph;
		mph = kph / 1.6;
		return mph;
	}
	
	public static double convertkpmtokph (double km, double minute){
		double kph = km / (minute / 60);
		return kph;
	}

}

//finished//