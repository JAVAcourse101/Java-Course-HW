import java.util.ArrayList;


public class goodNumbers {

	public static void main(String[] args) {
		int [] a = new int [] {2,7};
		int [] b = new int [] {3,2};
		
		int N=20;
		
		ArrayList <Integer> num = new ArrayList<Integer>();
		
		for (int i=1;i<=N;i++){
			num.add(i);
			System.out.print(i+"|");
			
		}
		System.out.println();
		
		check(a,b,num);

	}
	
	
	public static ArrayList<Integer> check(int [] a, int [] b, ArrayList<Integer> all){
		ArrayList<Integer> store = new ArrayList<Integer>();	
		int siz= a.length;
		
		for(int j=0;j<siz;j++){
			
			for (int i=0;i<all.size();i++){
				if (all.get(i)%a[j]==0&&all.get(i)%b[j]!=0){
					store.add(all.get(i));	
				}
			}
		}
		
		for(int i=0;i<store.size();i++){
			System.out.println(store.get(i));
		}
		
		return store;
			
		}

	

}
