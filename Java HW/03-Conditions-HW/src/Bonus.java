import java.util.Scanner;


public class Bonus 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Enter your score and we will tell you your bonus");
		System.out.println("Enter the score (between 0 and 9)");
		long A = input.nextLong();
		if (A>=0 && A<=9)
		{
			if (A>=1 && A<=3)
			{
				Long B=A*5;
				System.out.println("Your bonus is:" + B);
			}
			if (A>=4 && A<=6)
			{
				Long C=A*10;
				System.out.println("Your bonus is:" + C);
			}
			if (A>=7 && A<=9)
			{
				Long D=A*50;
				System.out.println("Your bonus is:" + D);
			}	
	
		}
		else 
		{
			System.out.println("Out of range");
		}
input.close();
	}

}
