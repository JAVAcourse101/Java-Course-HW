import java.util.Scanner;


public class Buble {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter the lenght of the arrey and we will fill it with numbers " );
 		
		int L = input.nextInt();
		
		int[] n = new int[L];

		for (int i = 0; i < L; i++) {
			n[i] = -i + 1;
		    System.out.print( n[i]+ "|" );
		   
		}
		
		System.out.println( "" );
		 
	     boolean M = false;   
	     int temp;   

	     while ( M==false )
	     {
	            M= true;    
	            for( int j=0;  j < n.length -1;  j++ ){
	            
	                   if ( n[ j ] > n[j+1] ){
	                   
	                           temp = n[ j ];
	                           n[ j ] = n[ j+1 ];
	                           n[ j+1 ] = temp;
	                           M = false;                
	                   } 
	            }
	     }
	     
	     for (int i = 0; i < L; i++) {
			    System.out.print( n[i]+ "|" );
			   
		 }
	     input.close();
	}
}
