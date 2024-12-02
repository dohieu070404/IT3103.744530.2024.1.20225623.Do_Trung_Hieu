package lap1;
import java.util.Scanner;

	public class StarTriangle {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the height of the triangle (n): ");
	        int n = scanner.nextInt();

	        // Loop through each row
	        for (int i = 1; i <= n; i++) {
	            // Print spaces before stars
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    
	}

}
