public class OneHdoWhile {

	public static void main(String[] args) {
    int i = 1;
		
		do {
			if ((i % 7 == 0) || (i % 11 == 0)){
				System.out.println(i);
			}
			i++;
		} while (i <= 100);

	}

}