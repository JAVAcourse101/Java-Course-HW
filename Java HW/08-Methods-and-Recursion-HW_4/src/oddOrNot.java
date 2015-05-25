import java.util.Random;


public class oddOrNot {

	public static void main(String[] args) {
		for (int i=1;i<=10;i++){
			
			Random ran = new Random();
			int ranA = ran.nextInt(100);
			oddOrEven(ranA);
			System.out.println(ranA);
			
		}

	
	
	
	
	}
	
	public static void oddOrEven(int a){
		
		if(a==0){
			System.out.println("This is ZERO and it is a special number you cutie");
		}
		else if (a%2==0){
			System.out.println("This is an EVEN number");
		}
		else {
			System.out.println("This is an ODD number");
		}
	}
}
