import java.util.Scanner;


public class Factorial {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("We will find N!/K!");
		System.out.print("Enter N ");
		long N = input.nextLong();
		System.out.print("Enter K ");
		long K = input.nextLong();
		
		long N1 = 1;
		long K1 = 1;
		
		for (int i = 1; i <= N; i++) {
			   N1 = N1 * i;
			}
		//System.out.println(N1);
		
		for (int j = 1; j <= K; j++) {
			   K1 = K1 * j;
			}
		//System.out.println(K1);
		
		if ((N<K)||K<1){
			System.out.println("Error: 1<K<N must be true");
			System.exit(1);
		}
		else{
			System.out.println(N1/K1);
			
		}
		input.close();
	}


}
