import java.util.ArrayList;
import java.util.Random;


public class sequance {

	public static void main(String[] args) {
		 int [] in= new int [10];
		 Random random = new Random();
		 
		 for(int i =0;i<10;i++){
			 in[i]=random.nextInt(100);
			 System.out.print(in[i]+"|");
		 }
		 System.out.println();
		 list(in);
	}
	
	
	public static ArrayList<Integer> list(int [] in){
	ArrayList<Integer> store = new ArrayList<Integer>();	
	
	for(int i=0;i<in.length-1;i++){
		
		if(in[i]>in[i+1]){
			store.add(in[i]);
		}
//		if(in[i]<in[i+1]){
//			store.add(in[i+1]);
//		}
	}
	for(int i=0;i<store.size();i++){
		System.out.println(store.get(i));
	}
	
	return store;
		
	}

}
