import java.util.Scanner;

public class Task_9 {

	public static void main(String[] args) {
		System.out
				.println("Please enter a string of letters and digits and we will tell you the sum of the numbers");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.trim();
		// Using regular expression
		// ^ means not the symbols afterwards, -? means -, 0-9 means the numbers
		// from zero to nine and + means as many times as needed

		word = word.replaceAll("[^-?0-9]+", " ");
		word = word.trim();
		System.out.println(word);
		String[] numsString = word.split(" ");

		int[] nums = new int[numsString.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numsString[i]);
			System.out.println(nums[i]);
			sum += nums[i];
		}

		System.out.println("The sum is " + sum);
		sc.close();
	}

}
