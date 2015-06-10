import java.util.ArrayList;
import java.util.Random;


public class tenNumbers {

	public static void main(String[] args) {
		Random random = new Random();
        int N = 10;
        int[] sequence = new int[N];
 
        for (int i = 0; i < N; i++){
        	sequence[i] = Math.abs(random.nextInt(100));
        }
        
        for (int i = 0; i < N; i++){
        	System.out.print(sequence[i]);
        	System.out.print(" ");
        }
        
        System.out.println();
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        
        
        for(int i =0;i<sequence.length;i++){
			
			if (sequence[i]%2!=0){
				odd.add(sequence[i]);
				
				
			}
			if (sequence[i]%2==0){
				even.add(sequence[i]);
			}


		}	
        
        
        System.out.println("Odd:");
        Integer [] oddStr = new Integer[odd.size()];
        oddStr = odd.toArray(oddStr);
        
        int maxValueOdd = maxValue(oddStr);
       
        
        printSequence(sortR(oddStr, maxValueOdd));
        
        System.out.println();
        System.out.println("Even:");
        
        
        Integer[] evenStr = new Integer[even.size()];
        evenStr = even.toArray(evenStr);
        
        
        int maxValueEven = maxValue(evenStr);
        sort(evenStr, maxValueEven);
        
        printSequence(sort(evenStr, maxValueEven));
        
        

	}
	
	static Integer[] sort(Integer[] sequence, Integer maxValue) 
    {
        int[] Bucket = new int[maxValue + 1];
        Integer[] sorted_sequence = new Integer[sequence.length];
 
        for (int i = 0; i < sequence.length; i++)
            Bucket[sequence[i]]++;
 
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_sequence[outPos++] = i;
 
        return sorted_sequence;
    }
	
	static Integer[] sortR(Integer[] sequence, Integer maxValue) 
    {
		boolean M = false;   
	     int temp;   

	     while ( M==false )
	     {
	            M= true;    
	            for( int j=0;  j < sequence.length -1;  j++ ){
	            
	                   if ( sequence[ j ] < sequence[j+1] ){
	                   
	                           temp = sequence[ j ];
	                           sequence[ j ] = sequence[ j+1 ];
	                           sequence[ j+1 ] = temp;
	                           M = false;                
	                   } 
	            }
	     }
 
        return sequence;
    }
	
	static Integer maxValue(Integer[] sequence) 
    {
        Integer maxValue = 0;
        for (int i = 0; i < sequence.length; i++)
            if (sequence[i] > maxValue)
                maxValue = sequence[i];
        return maxValue;
    }
	
	static void printSequence(Integer[] sorted_sequence) 
    {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }

}
