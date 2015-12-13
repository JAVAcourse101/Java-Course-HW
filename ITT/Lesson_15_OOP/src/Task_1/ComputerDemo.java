package Task_1;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer dell= new Computer();
		Computer lenovo= new Computer();

		dell.hardDiskMemory=1024*200;
		dell.setFreeMemory(dell.hardDiskMemory);
		dell.isNoteBook=true;
		dell.operationSystem="Windows";
		dell.price=1600.50;
		dell.year=2009;
		
		lenovo.hardDiskMemory=1024*1000;
		lenovo.setFreeMemory(lenovo.hardDiskMemory);
		lenovo.isNoteBook=false;
		lenovo.operationSystem="Linux";
		lenovo.price=800.50;
		lenovo.year=2015;

		dell.useMemory(100);

		lenovo.changeOperationSystem("Obunto");
		
		System.out.println("Dell`s parameters are:");
		System.out.println("HDD "+dell.hardDiskMemory+"MB");
		System.out.println("Free space "+dell.getFreeMemory()+"MB");
		System.out.println("Is notebook: "+dell.isNoteBook);
		System.out.println("OS "+dell.operationSystem);
		System.out.println("Price "+dell.price);
		System.out.println("Year of manufacture "+dell.year+"\n");
		
		System.out.println("Lenovo`s parameters are:");
		System.out.println("HDD "+lenovo.hardDiskMemory+"MB");
		System.out.println("Free space "+lenovo.getFreeMemory()+"MB");
		System.out.println("Is notebook: "+lenovo.isNoteBook);
		System.out.println("OS "+lenovo.operationSystem);
		System.out.println("Price "+lenovo.price);
		System.out.println("Year of manufacture "+lenovo.year);
		
		
	}

}
