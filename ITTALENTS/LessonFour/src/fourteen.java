import java.util.Arrays;
import java.util.Scanner;

public class fourteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter an array of real numbers, but for doing that first tell me how long do you want it to be?");
		int l = sc.nextInt();

		if (l <= 0) {
			System.out
					.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		double[] arr = new double[l];
		System.out.println("Now let us start entering the array.");

		for (int q = 0; q < l; q++) {
			arr[q] = sc.nextDouble();

		}

		// double[] arr = new double[] { 1.2, 2.9, 3.1, 4.5, 5.5 };
		int count = 0;
		int ind = 0;
		for (int i = 0; i < arr.length; i++) {
			if ((-2.99 <= arr[i]) && (+2.99 >= arr[i])) {
				count++;
			}

		}

		double[] arrN = new double[count];

		for (int j = 0; j < arr.length; j++) {
			if ((-2.99 <= arr[j]) && (+2.99 >= arr[j])) {
				arrN[ind] = arr[j];
				ind++;
			}

		}
		sc.close();
		System.out.println(Arrays.toString(arrN));
		// System.out.println(count);
	}

}