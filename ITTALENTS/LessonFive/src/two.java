public class two {

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 48, 72, 13, 14, 15, 10 },
				{ 21, 22, 53, 24, 75, 89 }, { 31, 57, 33, 34, 35, 12 },
				{ 41, 95, 43, 44, 45, 11 }, { 59, 52, 53, 54, 55, 19 },
				{ 61, 69, 63, 64, -9, -30 } };

		for (int m = 0; m < arr.length; m++) {
			for (int j = 0; j < arr[m].length; j++) {
				System.out.print(arr[m][j] + " ");

			}
			System.out.println();

		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {
					System.out.print(arr[i][j] + " ");

				}

			}

		}
		
		System.out.println();

		for (int q = 0; q < arr.length; q++) {
			for (int m = 0; m < arr[q].length; m++) {

				if (q + m == arr[q].length - 1) {
					System.out.print(arr[q][m] + " ");

				}
			}
			

		}
	}

}