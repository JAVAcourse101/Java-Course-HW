import java.util.Scanner;


public class MaxAndMin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter how many whole number do you want to compare");
		long T = input.nextLong();
		long Max = Long.MIN_VALUE;
		long Min = Long.MAX_VALUE;
		
		for(long i=1; i <= T; i++){
			System.out.print("Number " + i + " is ");
			long A = input.nextLong();
			
			Max = Math.max(Max, A);
			System.out.println("");
			System.out.println("Max is " + Max);
			
			Min = Math.min(Min, A);
			System.out.println("Min is " + Min);
			System.out.println("");
			
		}
		input.close();
	}

}
