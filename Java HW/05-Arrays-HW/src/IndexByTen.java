import java.util.Scanner;


public class IndexByTen {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Please enter the lenght of the arrey and we will fill it with the numbers " );
		System.out.println("of the result of their index  multiplied by ten " );
		int L = input.nextInt();
		
		int[] n = new int[L];

		for (int i = 0; i < L; i++) {
		    n[i] = i*10;
		    System.out.print( n[i]+ "|" );
		    
		}
		input.close();
	}

}
