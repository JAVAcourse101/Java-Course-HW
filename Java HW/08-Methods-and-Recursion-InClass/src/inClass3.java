import java.util.Scanner;


public class inClass3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Plesase enter number between 10 and 30000 and we will sum the numbers frim 1 to this number:");
		int end=input.nextInt();
		
		if (end>=10 && end<=3000){
		
		long sumtotal=sum(end);
		
		System.out.println(sumtotal);
		
		}
		else{
			System.out.println("Out of range");
		}
input.close();
	}
	
	public static long sum(int number) {
		
		if (number >0) {
			return number +sum(number-1);
		    } else {
		      return 0;
		    }
	    

	  }


}
