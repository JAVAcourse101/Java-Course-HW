public class seven {

	public static void main(String[] args) {

		int[][] arr = new int[][] { { 48, 72, 13, 14, 15 },
				{ 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 },
				{ 61, 69, 63, 64, 65 } };
		
		int max=arr[0][0];
		int min=arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
