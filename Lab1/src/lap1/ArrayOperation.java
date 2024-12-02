package lap1;
import java.util.Arrays;
public class ArrayOperation {

	     public static void main(String[] args) {
	    	        
	    	        // Declare and initialize an integer array.
	    	       int[] my_array1 = {
	    	            111,222,444,112,445,1234,2245,5566
	    	        };
	    	       // Print the original numeric array.
	    	        System.out.println("day ban dau : " + Arrays.toString(my_array1));
	    	        
	    	        // Sort the numeric array in ascending order.
	    	        Arrays.sort(my_array1);
	    	        
	    	        // Print the sorted numeric array.
	    	        System.out.println("day tu be den lon : " + Arrays.toString(my_array1));
	    }
	
}
