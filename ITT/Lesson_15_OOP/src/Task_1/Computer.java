package Task_1;

public class Computer {

	short year = 0;
	double price = 0;
	boolean isNoteBook = false;
	int hardDiskMemory = 0;
	private int freeMemory = this.hardDiskMemory;
	String operationSystem = "";

	public int getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(int freeMemory) {
		if (freeMemory <= this.hardDiskMemory) {
			this.freeMemory = freeMemory;
		} else {
			System.out.println("Free memory exceeds hardDiskMemory");
		}
	}

	void changeOperationSystem(String newSystem) {
		if (newSystem.equals("") || newSystem.equals(null)
				|| newSystem.length() == 0) {
			System.out.println("Please enter a valid name for OS");
			return;
		} else {
			this.operationSystem = newSystem;

		}
	}

	void useMemory(int memoryInUse) {
		if (memoryInUse > this.freeMemory) {
			System.out.println("Not enough memory");
			return;
		}
		if (memoryInUse <= 0) {
			System.out.println("Please enter a valid value for memory in use");
			return;
		}

		this.freeMemory -= memoryInUse;

	}

}
