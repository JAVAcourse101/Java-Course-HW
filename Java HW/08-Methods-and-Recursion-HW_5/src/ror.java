
public class ror {

	public static void main(String[] args) {
		

	
		printSymmetric();
	
	}
	
	
	public static void printSymmetric(){
		
		for(int start=15;start<1000;start++){
		
		String temp = Integer.toString(start);
		int[] newStart = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    newStart[i] = temp.charAt(i) - '0';
		}
		
		
		int len= newStart.length - 1;
		int flag=0;
		
		
		
		if (len==1){
			if (newStart[0]==newStart[1]){
				for (int j = 0; j <= len; j++) {
					System.out.print(newStart[j]);
					
				}
				System.out.println();
			}
			else{
				continue;
			}
		}
		
		for(int i=0;i<len/2;i++){
			
			if (newStart[i]==newStart[len-i]){
				flag++;
			}
			
			else {
				continue;
			}
			if (flag==len/2){
				for (int j = 0; j <= len; j++) {
					System.out.print(newStart[j]);
					
					if(j==len){
						System.out.println();
					}
					
				}
			}	 
		
		}
	}
		
		
		
		

	}
}
	


