import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		//Initialized the values for calculations
		int menuSelection = 0;
		
		double conversionUnit = 0;
		
		//do while loop- prompts the user for menu selection
		do {
			System.out.println("Please select an option:\r\n\n"
					+ "1. Cups to Teaspoons\r\n\n"
					+ "2. Miles to Kilometers\r\n\n"
					+ "3. US Gallons to Imperial Gallons\r\n\n"
					+ "4. Quit");
			
			Scanner userInput = new Scanner(System.in);
			//accepts user input, then ask for values to be calculated as long as its not 4
			switch (menuSelection = userInput.nextInt()) {
			
			case 1: 
				System.out.println("Cups to Teaspoons");
				System.out.println("How many cups?");
				conversionUnit = userInput.nextDouble();
				conversionUnit *= 48;
				System.out.println("Teaspoons = "+ conversionUnit + "\n" );
				break;
			
			case 2: 
				System.out.println("Miles to Kilometers");
				System.out.println("How many Miles?");
				conversionUnit = userInput.nextDouble();
				conversionUnit *= 1.60934;
				System.out.println("Kilometers = " + conversionUnit + "\n");
				break;
			
			case 3: 
				System.out.println("US Gallons to Imperial Gallons");
				System.out.println("How many gallons?");
				conversionUnit = userInput.nextDouble();
				conversionUnit /= 1.201;
				System.out.println("Imperial Gallons = " + conversionUnit + "\n");
				break;
				
			case 4: 
				System.out.println("\nSuccessfully Quit");
				break;
			
			default: break;
			
			}
		}while (menuSelection != 4);
		
	}
}
