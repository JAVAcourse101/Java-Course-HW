import java.util.Scanner;


public class Equation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter A, B and C as a part of quadratic equation (Ax^2 + Bx + c");
		
		System.out.println("Enter A");
		double A = input.nextDouble();
		
		System.out.println("Enter B");
		double B = input.nextDouble();
		
		System.out.println("Enter C");
		double C = input.nextDouble();
		
		if (A==0)
		{
			System.out.println("A must be different than Zero");
		}
		if (A!=0)
		{
			double D= Math.pow(B,2) - 4*A*C;
			if (D<0)
			{
				System.out.println("There are no real numbers as a solution to this equation");
			}
			if (D==0)
			{
				double S= (-B)/(2*A);
				System.out.println("There solution is:" + S);
			}
			if (D>0)
			{
				double S1= (-B+ Math.sqrt(D))/(2*A);
				double S2= (-B- Math.sqrt(D))/(2*A);
				System.out.println("There solution is:" + S1 + " and ");
				System.out.println(S2);
			}
			input.close();
		}
	}

}
