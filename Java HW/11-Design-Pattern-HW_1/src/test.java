import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		deviceFactory devFac = new deviceFactory();
		
		Scanner input = new Scanner(System.in,"UTF-8");
		
		
		for (;;){
			System.out.println("Please enter device or exit.(phone,tablet,laptop,exit)"); 
			String type=input.nextLine();
			
			if(type.equals("exit")){
				break;
			}
			
			System.out.println("Please enter brand"); 
			String brand=input.nextLine();
			
			System.out.println("Please enter model"); 
			String model=input.nextLine();	
			
			
			device dev1 = devFac.getDevice(type,model,brand);
			dev1.sayAll();
			
			
		}
		input.close();
//		How can i add multiple objects with the dialog Lazka?
		

	}

}