import java.util.Scanner;


public class DontPrint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Enter number and we will print all the numbers from one to that number that can not be divided by 3 and 7");
		long A = input.nextLong();
		
		for(long i=1; i <= A; i++){
			if ((i%3!=0)&&(i%7!=0)){
				System.out.print(i+"|");
			}
			
			input.close();
			
		}
	}

}
