import java.util.Random;


public class Three {

	public static void main(String[] args) {
		for (int i=1;i<=20;i++){
			
			Random ran = new Random();
			int ranA = ran.nextInt(100);
			int ranB = ran.nextInt(100);
			int ranC = ran.nextInt(100);
			long show=multiply(ranA,ranB,ranC);
			System.out.println(show);
		}
	}
public static long multiply(int a, int b, int c){
	return a*b*c;
}
}
