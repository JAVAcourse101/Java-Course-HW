import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {
		System.out.println("Please enter two words.");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the first word");
		String first = sc.nextLine();
		first = first.trim();
		first = first.toLowerCase();

		System.out.println("Please enter the second word");
		String second = sc.nextLine();
		second = second.trim();
		first = first.toLowerCase();

		boolean noMatch = true;
		for (int i = 0; i < first.length(); i++) {

			if (first.charAt(i) == second.charAt(0)) {
				System.out.println(second);
				noMatch = false;
				continue;
			}
			System.out.println(first.charAt(i));
		}
		if (noMatch == true) {
			System.out.println("Sorry there is now match");
		}
		sc.close();
	}

}
