
public class wait extends Thread{
	

	synchronized void fiftyT() {
		
		for (int i = 0; i <= 50000; i++) {
			if (i==25000){
				System.out.println(i);
				System.out.println("Now the other thread");
				try {
					wait();
				} catch (Exception e) {

				}
			}
			
			else{
				System.out.println(i);
			}
		
			
			
		}
	}
	
	synchronized void printT() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Running...");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
		}
		
		notify();
	}
		
	public static void main(String[] args) {
		final wait c = new wait();
		
		new Thread() {
			public void run() {
				c.fiftyT();
			}
		}.start();

		new Thread() {
			public void run() {
				c.printT();
			}
		}.start();

	}
}
