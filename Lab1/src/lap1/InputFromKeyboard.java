package lap1;
import java.util.Scanner;

	public class InputFromKeyboard {
	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);

	        System.out.println("What's your name?");
	        String strName = keyboard.nextLine();

	        System.out.println("How old are you?");
	        int iAge = keyboard.nextInt();

	        System.out.println("How tall are you (m)?");
	        double dHeight = keyboard.nextDouble();

	        // Print the information
	        System.out.println("Mrs/Ms. " + strName + ", " + iAge + " years old.");
	        System.out.println("Your height is " + dHeight + " meters.");

	        // Close the scanner
	        keyboard.close();
	    }
	}


