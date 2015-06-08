import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class upperOrNot {
 
   public static void main(String[] args) {
        
 String characters = "hHuUbbTZ";
 isUpper(characters);

   }
   
 public static void isUpper(String characters ){
	 Stack<String> myStack = new Stack<String>();
	 
	 Queue<String> queue = new LinkedList<String>();
	 
	 int length = characters.length();
	 
	 
	 for(int i = 0; i < length; i++) {
	    
	    char character = characters.charAt(i);
	          
	    
	    if(Character.isUpperCase(character)) {
	    	
	    	String temp = Character.toString(character);
			myStack.push(temp);
	    }
	    else if(Character.isLowerCase(character)) {
	    	
	    	String temp1 = Character.toString(character);
	    	queue.offer(temp1);
	    }
	    else {
	  System.out.println("Given character : " + characters.charAt(i)
	    + " is neither Uppercase nor Lowercase letter");
	    }
	       }
	 
	 
	 while(!myStack.isEmpty()){
			
			String current = myStack.pop();
			
			System.out.println(current);
		}
	 
	 System.out.println();
		
		while (!queue.isEmpty()) {
			
			String current = queue.poll();
			
		    System.out.println(current);
		    
		}
	 
	 
	 
	 
 }
}

