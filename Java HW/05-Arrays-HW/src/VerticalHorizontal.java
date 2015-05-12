import java.util.Scanner;


public class VerticalHorizontal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please enter the size of the square two dimencional arrey " );
 		int L = input.nextInt();
 		
 		int [][] m = new int [L][L];
 		
 		
//		for(int r = 0; r < m.length; r++){
//			for(int c = 0; c < m[r].length; c++){
//				System.out.print(m[r][c] + " ");
//		    }
//			System.out.println();
//		}
			
			
		int T=0;
		
		int row=0;
		do {
			int col=0;
			do {
				m[col][row]=1+T;
				T++;
				col++;
			}while (col < L);
		row++;
		}while (row < L);
			
			
			
		for(int r = 0; r < m.length; r++){
			for(int c = 0; c < m[r].length; c++){
				System.out.print(m[r][c] + " ");
		    }
			System.out.println();
		}
		input.close();
	}

}
