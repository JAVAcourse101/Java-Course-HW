import java.util.Scanner;
public class one {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Plesase enter three whole numbers");
		int one=input.nextInt();
		int two=input.nextInt();
		int three=input.nextInt();
		
		
		int res=max(max(one,two),three);
		System.out.println(res);
		input.close();
	}
  
	
	
	public static int max(int a,int b){
	if (a>b){
		return a;
	}
	else{
		return b;
	}
}
}
