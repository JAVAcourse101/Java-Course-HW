import java.util.Scanner;
public class PlusorMinus {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("We will enter two real numbers: A and B, we will tell you if the result of their division is negative or positive");
		System.out.println("Enter A");
		double A = input.nextDouble();
		System.out.println("Enter B");
		double B = input.nextDouble();
		
		if (A==0)
		{
			System.out.println("Zero divided by any number is ZERO");
		}
		if (B==0)
		{
			System.out.println("Sorry but this operation can not be done");
		}
		if ((B>0 && A>0)||(A<0 && B<0))
		{
			System.out.println("+");
		}
		if ((B<0 && A>0)||(A<0 && B>0))
		{
			System.out.println("-");
		}
			
		input.close();
	}

}