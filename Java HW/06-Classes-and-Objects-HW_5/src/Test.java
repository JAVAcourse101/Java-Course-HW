import java.util.Scanner;


public class Test {
	
	
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in,"UTF-8");
	
	System.out.println("Please enter temperature in C and we will show it to you in F.");
	double A = input.nextDouble();
    Cel calculate=new Cel(A);
    
    calculate.result();
    
    input.close();


	}

}
