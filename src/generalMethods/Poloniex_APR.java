package generalMethods;

public class Poloniex_APR {

	public static void main(String[] args){				// 48 hour loan
		double i = 1.0000;
		while(i < 1.01){
			System.out.printf("When i = %.2f%%, APR = %.1f%%\n", (i - 1) * 100, (Math.pow(i, 360) - 1) * 100);
			i += 0.0001;
		}
	}
	
}
