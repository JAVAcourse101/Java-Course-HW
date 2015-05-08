public class OneHFor {

	public static void main(String[] args) {
		for(int i=1; i <= 100; i++){

			if ((i % 7 == 0) || (i % 11 == 0)){
				System.out.println(i);
			}
			
		}
	}

}