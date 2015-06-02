import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class uniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Plesase enter a text and we will prien onlt the unique words for that text");
		//Does anyone knows what is love? Love is not  1 a feeling, it is a vortex. Vortex that swallows you and after time it spits you up. 
		String text=input.nextLine();
		
		separate(text);
		
		String[] separated=separate(text);
		
		ptintUnique(separated);
		
		input.close();
		
		
	}

	
	
	private static String[] separate(String every) {
		String noPunctoation = every.replaceAll("[^a-zA-Z ]", "");
		String[] sepWords = noPunctoation.split("\\ ");
	
		
		int newLen=sepWords.length;
		
		for(int i =0;i<newLen;i++){
			sepWords[i]=sepWords[i].trim();
			sepWords[i]=sepWords[i].toLowerCase();
		}
		return sepWords;
		
		
	}
	
	private static void ptintUnique(String[] every) {
		
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
			if (count==1){
				System.out.printf("%s|", word);
			}
		}
		System.out.println();
		
	}
}
