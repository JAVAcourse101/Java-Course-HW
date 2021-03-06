import java.util.Random;

public class quick {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    static void printSequence(int[] sorted_sequence) 
    {
        for (int i = 0; i < sorted_sequence.length; i++)
            System.out.print(sorted_sequence[i] + " ");
    }
     
    public static void main(String a[]){
    	quick sorter = new quick();
    	System.out.println("Sorting of randomly generated numbers using QUICK SORT");
    	
    	Random random = new Random();
    	int N = 10000000;
    	int[] sequence = new int[N];
    	
    	for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));


//    	System.out.println("\nOriginal Sequence: ");
//    	printSequence(sequence);
    	
    	System.out.println();
    	
    	System.out.println("Sorting Started: ");
		
		long startTime = System.currentTimeMillis();
    	
        sorter.sort(sequence);
        
        long endTime = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		
		float seconds = (float) totalTime / 1000;
		System.out.println();
		System.out.println("Execution Time: " + seconds);
        
//        System.out.println("\nSorted Sequence: ");
//        printSequence(sequence);
    }
}