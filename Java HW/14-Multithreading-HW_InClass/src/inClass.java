public class inClass extends Thread {

	public void run() {
		for (int i = 0; i < 500000; i++) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		Thread t1 = new inClass();
		Thread t2 = new z();
		Thread t3 = new sleep();
		t1.start();
		t2.start();
		t3.start();
	}

}
