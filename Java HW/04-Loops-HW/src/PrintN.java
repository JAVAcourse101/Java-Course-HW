import java.util.Scanner;


public class PrintN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter number and we will print all the numbers from one to that number");
		long A = input.nextLong();
		
		for(long i=1; i <= A; i++){

			
				System.out.print(i+"|");
			input.close();
			
		}
	}

}
