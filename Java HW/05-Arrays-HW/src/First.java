


	
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
       
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Please enter the lenght of the arrey and we will fill it with the numbers " );
		System.out.println("from 1 to N and tell you the sum of all even elements of the arrey: " );
		int L = input.nextInt();
		
		int[] n = new int[L];

		for (int i = 0; i < L; i++) {
		    n[i] = i + 1;
		    System.out.print( n[i]+ "|" );
		    
		}
		
		long S = 0;
		
		for (int i = 0; i < L; i++) {
			if (n[i]%2==0){
				S=S+n[i];
			}
		}
		System.out.println(  );
		System.out.println("The sum of all even numbers is "+S + "." );
		input.close();
	}

}
