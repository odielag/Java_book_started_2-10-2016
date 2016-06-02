package testing;

/**
 * <h1>Calculator</h1> In this method I'm trying to make a simple command line
 * calculator.
 * 
 * @author William ODieLag Pennington
 * @version 1.0
 * @since 2016-6-2
 *
 */

public class Calculator
{
	public static void main(String[] args)
	{
		if (args.length == 0)
		{
			System.out.printf("\nSorry, no values got inputed.\n\n");
			System.exit(0);
		}
		double value = Double.parseDouble(args[0]);
		System.out.printf("%f ", Double.parseDouble(args[0]));
		for (int i = 1; i < args.length; i += 2)
		{
			switch (args[i])
			{
			case "+":
				value += Double.parseDouble(args[i + 1]);
				System.out.printf("+ %f ", Double.parseDouble(args[i + 1]));
				break;
			case "-":
				value -= Double.parseDouble(args[i + 1]);
				System.out.printf("- %f ", Double.parseDouble(args[i + 1]));
				break;
			case ".":
				value *= Double.parseDouble(args[i + 1]);
				System.out.printf("* %f ", Double.parseDouble(args[i + 1]));
				break;
			case "/":
				value /= Double.parseDouble(args[i + 1]);
				System.out.printf("/ %f ", Double.parseDouble(args[i + 1]));
				break;
			case "%":
				value %= Double.parseDouble(args[i + 1]);
				System.out.printf("% %f ", Double.parseDouble(args[i + 1]));
				break;
			case "=":
				System.out.printf("= %f \n\n", value);
				return;
			default:
				System.out.printf("\nWoah, something wankey happened. Default was used.");
				System.exit(-1);
			}
		}

		/*
		 * System.out.println(); int i = 0; double value =
		 * Double.parseDouble(args[i]); System.out.printf("%f ",
		 * Double.parseDouble(args[i])); i = 1; do { switch (args[i]) { case
		 * "+": value += Double.parseDouble(args[i + 1]); System.out.printf(
		 * "+ %f ", Double.parseDouble(args[i + 1])); break; case "-": value -=
		 * Double.parseDouble(args[i + 1]); System.out.printf("- %f ",
		 * Double.parseDouble(args[i + 1])); break; case "*": value *=
		 * Double.parseDouble(args[i + 1]); System.out.printf("* %f ",
		 * Double.parseDouble(args[i + 1])); break; case "/": value /=
		 * Double.parseDouble(args[i + 1]); System.out.printf("/ %f ",
		 * Double.parseDouble(args[i + 1])); break; case "=": System.out.printf(
		 * "= %f \n\n", value); return; } i += 2; } while (i < args.length);
		 */
	}
}
