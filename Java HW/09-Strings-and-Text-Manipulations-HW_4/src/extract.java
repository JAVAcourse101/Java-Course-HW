import java.util.Scanner;


public class extract {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in,"UTF-8");	
		String sentances="This is an apple! This is an orange? I love apples and oranges";
		String word="apple";
		
		print(sentances,word);
		input.close();	
		}
		

	

	
	private static void print(String sen, String word) {
		String[] parts = sen.split("\\.|\\?|\\!");
		
		int len=parts.length-1;
		
		for (int i=0;i<=len;i++){
			
			if(parts[i].contains("apple")==true){
				System.out.print(parts[i]+".");
			}
			
		}
		
		
		
		
	}
}
