import java.util.Scanner;


public class reverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Plesase enter sting and we will reverce it");
		String in=input.nextLine();
		
		rev(in);
		
		input.close();
	}

	
	public static void rev(String in){
		int len=in.length()-1;
		
        String[] splitten = in.split("");
		
        for(int i=0;i<=len;i++){
        	System.out.print(splitten[len-i]);
			
			
		}	
		
	}
}
