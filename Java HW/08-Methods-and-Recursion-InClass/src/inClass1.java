
public class inClass1 {

	public static void main(String[] args) {
		int arr []=new int [6];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		arr[5]=5;
		
		
		printInts(arr);
		
		
		

	}
	
	public static void printInts(int[]  a) {
		
		for (int i=a.length-1; i>=0 ; i--) {
	        System.out.print(a[i] +"|");

	    }
	    
	    System.out.println();
	    
	}
}
