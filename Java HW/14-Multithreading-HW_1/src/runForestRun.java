
public class runForestRun {

	public static void main(String[] args) {
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		thread3 t3=new thread3();
		thread4 t4=new thread4();
		thread5 t5=new thread5();
		
		t1.setName("FIRST");
		t2.setName("SECOND");
		t3.setName("THIRD");
		t4.setName("FOURTH");
		t5.setName("FIFTH");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
	}

}
