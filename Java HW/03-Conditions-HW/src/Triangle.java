import java.util.Scanner;


public class Triangle 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter the lenght of the sides of an triange and we will tell you if such a triangle is possible to exist or not");
		System.out.println("Enter A");
		double A = input.nextDouble();
		System.out.println("Enter B");
		double B = input.nextDouble();
		System.out.println("Enter C");
		double C= input.nextDouble();
		
		if ((A+B>C)&&(A+C>B)&&(B+C>A))
		{
			System.out.println("It can be done");
		}
		else
		{
			System.out.println("It can NOT be done");
		}
		input.close();
	}

}
