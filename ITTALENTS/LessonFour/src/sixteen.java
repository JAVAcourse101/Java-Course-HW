import java.util.Arrays;
import java.util.Scanner;

public class sixteen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an array of TEN real numbers.");

		double[] arr = new double[10];
		System.out
				.println("Now let us start entering 10 real numbers in the array.");

		for (int j = 0; j < 10; j++) {
			arr[j] = sc.nextDouble();

		}

		// double[] arr = new double[] { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5,
		// 8.6, 9.1, -4 };

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < 10; i++) {
			if (arr[i] < -0.231) {
				arr[i] = (i + 1) * (i + 1) + 41.25;
				arr[i] = Math.round(arr[i] * 10000000.0) / 10000000.0;

			}

			else {
				arr[i] *= (i + 1);
				arr[i] = Math.round(arr[i] * 10000000.0) / 10000000.0;
			}

		}
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
