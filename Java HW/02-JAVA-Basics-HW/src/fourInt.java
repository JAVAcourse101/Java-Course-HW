import java.util.Scanner;

public class fourInt {
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in, "UTF-8");
	
	System.out.println("Let`s sum four int numbers.");
	System.out.println("Please enter the first one:");
    int first = input.nextInt();
    
    System.out.println("Please enter the second one:");
    int second = input.nextInt();
    
    System.out.println("Please enter the third one:");
    int third = input.nextInt();
    
    System.out.println("Please enter the fourth one:");
    int fourth = input.nextInt();
    
    long sum=first+second+third+fourth;
    System.out.println("The numbers you have entered are : "+first+", "+second+", "+third+", "+fourth+". ");
    System.out.println("And the sum of them equals to: "+sum);
    input.close();
}		
}