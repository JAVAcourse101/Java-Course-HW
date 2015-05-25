
public class inClass2 {

	public static void main(String[] args) {
		String arr []=new String [6];
		arr[0]="A";
		arr[1]="B";
		arr[2]="C";
		arr[3]="D";
		arr[4]="E";
		arr[5]="F";
		
		
		printInts(arr);
		
		
		

	}
	
	public static void printInts(String []  a) {
		
		for (int i=a.length-1; i>=0 ; i--) {
	        System.out.print(a[i] +"|");

	    }
	    
	    System.out.println();
	    
	}
}
