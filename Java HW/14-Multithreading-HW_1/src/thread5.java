
public class thread5 extends Thread{

	public void run() {
		System.out.println("The thread is running");
		
		System.out.println("I am a thread and my name is "+this.getName());

			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("The thread " +this.getName() +" has completed");
		
	}
}
