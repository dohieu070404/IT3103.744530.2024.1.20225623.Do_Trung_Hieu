package lap1;
import java.util.Scanner;
public class AddMatrices {
	    public static void main(String args[]) {
	        int m, n, c, d;
	        
	        // Create a new Scanner object to read user input.
	        Scanner in = new Scanner(System.in);
	
	        System.out.println("Nhap so hang");
	        m = in.nextInt();
	        
	 
	        System.out.println("Nhap so cot");
	        n = in.nextInt();

	        // Create two-dimensional arrays to store matrix data.
	        int array1[][] = new int[m][n];
	        int array2[][] = new int[m][n];
	        int sum[][] = new int[m][n];

	        // Prompt the user to input elements of the first matrix.
	        System.out.println("nhap cac so hang trong ma tran 1");
	        for (c = 0; c < m; c++) {
	            for (d = 0; d < n; d++) {
	                array1[c][d] = in.nextInt();
	            }
	        }

	        // Prompt the user to input elements of the second matrix.
	        System.out.println("nhap cac so hang trong ma tran 2");
	        for (c = 0; c < m; c++) {
	            for (d = 0; d < n; d++) {
	                array2[c][d] = in.nextInt();
	            }
	        }
	        
	        System.out.println("Ma tran thu nhat");
	        for (c = 0; c < m; c++) {
	            for (d = 0; d < n; d++) {
	                System.out.print(array1[c][d] + "\t");
	            }
	            System.out.println();
	        }
	            System.out.println("ma tran thu hai");
	            for (c = 0; c < m; c++) {
	                for (d = 0; d < n; d++) {
	                    System.out.print(array2[c][d] + "\t");
	                }
	           
	            System.out.println();
	            }
	    }
	   }
	    

