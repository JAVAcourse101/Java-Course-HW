import java.util.Scanner;


public class ThreeNumbers {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("We will compare and tell you which one of three number is the greatest");
		System.out.println("Enter A");
		double A = input.nextDouble();
		System.out.println("Enter B");
		double B = input.nextDouble();
		System.out.println("Enter C");
		double C= input.nextDouble();
		
		if ((A==B)&&(B==C))
		{
			System.out.println("All the entered numbers are equal");	
		}
		else
		{
			double big;
			big = Math.max( A, B );
			big = Math.max( big, C );
			
			System.out.println("The biggest number is:"+ big);
		}
		
		
		input.close();
	}

}
