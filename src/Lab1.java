import java.util.Scanner;
public class Lab1 {

	public static void main(String[] args) {
	
		
		Scanner userInput = new Scanner(System.in);
		double userLength = 0.0;
		double userWidth = 0.0;
		double roomArea = 0.0;
		double roomPerimeter;
		char  anotherRoom= 'y';
		
		while (anotherRoom == 'y') {
		
		System.out.println("Enter Length: ");
		userLength = userInput.nextDouble();
		System.out.println("Enter Width: ");
		userWidth = userInput.nextDouble();
		roomArea = userLength * userWidth;
		roomPerimeter = userLength * 2 + userWidth * 2;
		System.out.println(roomArea + " is the area of the room");
		System.out.printf("%.2f",roomPerimeter);
		System.out.println( "is the perimeter of the room");
		System.out.println("Would you like to calculate another room? (y/n)");
		anotherRoom = userInput.next().charAt(0);
		}
				

	}

}
