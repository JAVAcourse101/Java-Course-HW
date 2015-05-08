import java.util.Scanner;


public class Deck {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Enter a card and we will se if it is a valid one");
		String Card = input.nextLine();
		String Cardlo    = Card.toLowerCase();
		
		
		
		if (Cardlo.equals("j")||Cardlo.equals("q")||Cardlo.equals("k")||Cardlo.equals("a"))
		{
			System.out.println("It is VALID");
		}
		else 
		{
			int A = Integer.parseInt(Card);
			if (A>=2 && A<=10)
			{
				System.out.println("It is VALID");
			}
			else
			{
				System.out.println("It is  NOT VALID");
			}
		}
		input.close();
	}

}
