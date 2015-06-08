import java.util.Stack;


public class sentance {

	public static void main(String[] args) {
		String sen="I am from planet EARTH and I need love";
		Stack<String> myStack = new Stack<String>();

		 String[] words = sen.split(" ");    
		
		
		for(int i=0;i<words.length;i++){
			myStack.push(words[i]);
		}
		
		while(!myStack.isEmpty()){
			
			String current = myStack.pop();
			
			System.out.println(current);
		}

	}

}
