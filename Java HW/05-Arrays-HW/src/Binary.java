import java.util.Scanner;


public class Binary {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in,"UTF-8");
		
        System.out.println("Please enter the lenght of the arrey and we will fill it with numbers " );
 		int L = input.nextInt();
		
		int[] n = new int[L];

		for (int i = 0; i < L; i++) {
			n[i] = i + i;
		    System.out.print( n[i]+ "|" );
		   
		}
		   
		System.out.println("\nPlease enter a number and we will return it`s index using the binary search method" );
		int X = input.nextInt();
		
		
		int low = 0;
		int hi = L-1;
		int mid	= (hi - low)/2;
		
		while((n[mid] != X) && (low <= hi))
	     {
	         
	         if (n[mid] > X){                                                
	              hi = mid - 1;   
	         }                                                             
	              else {                                                  
	              low = mid + 1; 
	        }
	       mid = (low + hi) / 2;
	     }
	     if (low <= hi){
	           System.out.println("The number was found in array subscript" + mid);
	           
	     }
	     else{
	          System.out.println("Sorry, the number is not in this array.");
	     }
	     input.close();
	}
	     

}
