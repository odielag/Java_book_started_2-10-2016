package generalMethods;

public class HeatConversian {
	
	public static void main(String[] args) {
		// Testing
		//System.out.println(CelsiusToFahrenheit(55));
		//System.out.println(FahrenheitToCelsius(55));
	}
	
	public static double FahrenheitToCelsius(double fahrenheit){
		return (fahrenheit - 32) * (5/9);
	}
	
	public static double CelsiusToFahrenheit(double celsius){
		return celsius * 9 / 5 + 32;
	}
	
}

// Finished and working