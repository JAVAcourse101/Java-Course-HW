import java.util.Scanner;


public class BetweenAAndB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Please enter two numbers and we will print all numbers between them that can be divided by three." );
		System.out.println("Please enter A :" );
		int A = input.nextInt();
		System.out.println("Please enter B :" );
		int B = input.nextInt();

		int L = B-A;
		
		int[] n = new int[L];
		
		for (int i = 0, j = 1; i < L-1; i++, j++) {
			n[i] = A + j;
			System.out.print(n[i] + "|" );
			    
		}
		
		
		System.out.print("\n" );
		//System.out.print(n.length );
		
		for (int k = 0; k < L-1; k++) {
		    
		    if (n[k]%3 == 0){
				System.out.print(n[k] + "|" );
			}
		}
		input.close();

		}
	}
