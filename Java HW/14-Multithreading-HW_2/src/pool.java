import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class pool {
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(7);
		for (Integer i = 1; i < 6; i++) {
			String name=i.toString();
			thread1 t1=new thread1(name,i*2000);
			executor.execute(t1);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}