import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class twentyWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		boolean flag=false;
		System.out.println("Plesase enter 20 words and we will tell you the count of each one");
		System.out.println("(use comma as deliminator)");
		for(;flag==false;){
			
			String everyWord=input.nextLine();
			//to , Else ,dog,cat,lion,can,frog,Glass,to,You,me,tree,leaf,dog,lion,to, else,eye,ass,me  
		 	
			separate(everyWord);
			
			String[] separated=separate(everyWord);
			
			int len=separated.length;
			
			if (len>20){
				System.out.println();
				System.out.println("You have entered "+len+" words which is more than 20 words, please try again.");
				System.out.println();
				continue;
			}
			
			if (len<20){
				System.out.println();
				System.out.println("You have entered only "+len+" words, please try again.");
				System.out.println();
				continue;
				
			}
			
			if (len==20){
				flag=true;
				count(separated);
			}
			
		}
		input.close();

	}

	
	
	
	
	private static String[] separate(String every) {
		String[] sepWords = every.split("\\,");
		
		int len=sepWords.length;
		
		for(int i =0;i<len;i++){
			sepWords[i]=sepWords[i].trim();
			sepWords[i]=sepWords[i].toLowerCase();
		}
		return sepWords;
	}
	
	private static void count(String[] every) {
		
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
				
		for (String word : every) {
			Integer count = wordsCount.get(word);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		
		System.out.println();
		
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			System.out.printf("%s -> %d times\n", word, count);
		}
		System.out.println();
		
	}
	
	
}
