
public class thread1 extends Thread{
	String name;
	int sleepTime;
	
	public thread1(String s, int sleepTime) {
		this.name = s;
		this.sleepTime=sleepTime;
	}

	public void run() {
		this.setName(name);
		System.out.println("The thread is running");
		
		System.out.println("I am a thread and my name is "+this.getName());

			try {
				Thread.sleep(this.sleepTime);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("The thread " +this.getName() +" has completed");
		
	}
}
