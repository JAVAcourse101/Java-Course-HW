import java.util.Arrays;
import java.util.Scanner;

public class twelve {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Please enter an array of SEVEN whole numbers.");
		
		 int[] arr = new int[7];
		 System.out
		 .println("Now let us start entering 7 whole numbers in the array.");
		
		 for (int j = 0; j < 7; j++) {
		 arr[j] = sc.nextInt();
		
		 }

//		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		
		int temp = 0;
		temp=arr[1];
		arr[1]=arr[0];
		arr[0]=temp;
		
		
		arr[2] = arr[2] + arr[3];
		arr[3] = arr[2]-arr[3];
		arr[2] = arr[2]-arr[3];
		
		arr[4] = arr[4] * arr[5];
		arr[5] = arr[4]/arr[5];
		arr[4] = arr[4]/arr[5];
	System.out.println(Arrays.toString(arr));
	sc.close();
	}
}
