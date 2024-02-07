package Programs;

public class Pattern3 {
	
	 public static void main(String[] args) {
	        
	        int rows = 5;

	        
	        for (int i = 1; i <= rows; i++) {
	            
	            for (int j = i; j >= 1; j--) {
	                System.out.print(j);
	            }

	            
	            for (int k = 2; k <= i; k++) {
	                System.out.print(k);
	            }

	            System.out.println(); 
	        }
	    }

}
