public class Task_4 {

	public static void main(String[] args) {

		int a = 3;

		int b = 4;

		int c = 4;

		int d = 3;

		int e = 5;

		int tempA = (a ^ b) * (a ^ c) * (a ^ d) * (a ^ e);
		int tempB = (a ^ b) * (b ^ c) * (b ^ d) * (b ^ e);
		int tempC = (c ^ b) * (a ^ c) * (c ^ d) * (c ^ e);
		int tempD = (d ^ b) * (d ^ c) * (a ^ d) * (d ^ e);
		int tempE = (e ^ b) * (e ^ c) * (e ^ d) * (e ^ a);
		
		tempA=tempA+2+~tempA;
		tempB=tempB+2+~tempB;
		tempC=tempC+2+~tempC;
		tempD=tempD+2+~tempD;
		tempE=tempE+2+~tempE;

		System.out.println(tempE);

	
		int uni = a * tempA + b * tempB+ c * tempC+ d * tempD+ e * tempE;

		 System.out.println(uni);
	}
}
