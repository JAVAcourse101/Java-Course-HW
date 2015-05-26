import java.util.Scanner;


public class upper {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Plesase enter a word");
		String inWord=input.nextLine();
		
		System.out.println("Plesase enter a sentance");
		String inSentance=input.nextLine();
		

		
		System.out.println(replaceUpper(inWord,inSentance));
		input.close();
	}
	
	private static String replaceUpper(String word, String sen) {
	    return sen.replaceAll("\\b" + word + "\\b", word.toUpperCase());
	}
	
}
