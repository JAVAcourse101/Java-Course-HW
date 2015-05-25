
public class fac {

	public static void main(String[] args) {
		int result=fact(10);
		System.out.println(result);

	}
	    public static int fact(int n)
	    {
	        if(n == 1){
	            return 1;
	        }
	        return n * (fact(n-1));
	    }
	}

