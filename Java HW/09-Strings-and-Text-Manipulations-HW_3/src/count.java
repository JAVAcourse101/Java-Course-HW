import java.util.Scanner;


public class count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Plesase enter a sentance");
		String sen=input.nextLine();
		
		System.out.println("Plesase enter a word");
		String word=input.nextLine();
		

		
		countwords(sen,word);
		input.close();

	}

	
	private static void countwords(String sen, String word) {
		String ones= sen.replaceAll("\\b" + word + "\\b", "!@");
		
		
		int index = ones.indexOf("!@");
		int count = 0;
		
		while (index != -1) {
		    count++;
		    ones = ones.substring(index + 1);
		    index = ones.indexOf("!@");
		}
		System.out.println("No of *"+word+"* in the sentance is : " + count);
	}
	}

