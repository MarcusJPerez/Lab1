import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		double userLength = 0.0;
		double userWidth = 0.0;
		double roomArea = 0.0;
		double roomPerimeter;
		char anotherRoom = 'y';

		while (anotherRoom == 'y' || anotherRoom == 'Y') {

			do {
				System.out.println("Enter a length: ");
				while (!userInput.hasNextDouble()) {
					System.out.println("Please enter the length.");
					userInput.next();
				}
				userLength = userInput.nextDouble();
			} while (userLength <= 0);

			do {
				System.out.println("Enter a width: ");
				while (!userInput.hasNextDouble()) {
					System.out.println("Please enter the width");
					userInput.next();
				}
				userWidth = userInput.nextDouble();
			} while (userWidth <= 0);

			roomArea = userLength * userWidth;

			roomPerimeter = userLength * 2 + userWidth * 2;

			System.out.printf("%.2f", roomArea);
			System.out.println(" is the area of the room");
			System.out.printf("%.2f", roomPerimeter);
			System.out.println(" is the perimeter of the room");

			System.out.println("Would you like to calculate another room? (y/n)");
			while (!userInput.hasNext("[yYnN]")) {
				System.out.println("Y to continue N to stop.");
				userInput.next();
			}
			anotherRoom = userInput.next().charAt(0);

		}
		userInput.close();
	}
}
