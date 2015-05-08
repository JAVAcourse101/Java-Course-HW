import java.util.Scanner;
public class Leftover {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Please enter a whole number:");
		int a = input.nextInt();
		
		if (a>=1 && a<=5)
		{
			if (a%2==0)
			{
				System.out.println("Your number is between 1 and 5 and it is even:");
			}
			else 
			{
				System.out.println("Your number is between 1 and 5 and it is odd:");	
			}
		}
		if (a>=6 && a<=15)
		{
			if (a%3==0)
			{
				System.out.println("Your number is between 6 and 15 and it can be devided by 3:");
			}
			else 
			{
				System.out.println("Your number is between 6 and 15 and it can NOT be devided by 3:");
			}
		}
		else
		{
			if (a>0)
			{
				System.out.println("Your number is positive");
			}
			if (a<0)
			{
				System.out.println("Your number is negative");
			}
			if (a==0)
			{
				System.out.println("Your number is ZERO");
			}
			input.close();
		}
	}

}
