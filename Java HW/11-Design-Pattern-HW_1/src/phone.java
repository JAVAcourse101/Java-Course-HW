
public class phone extends device{
	
	public phone(){
		super.setBrand("Undefined");
		super.setModel("Undefined");
	}
	public phone(String brand, String model){
		super.setBrand(brand);
		super.setModel(model);
	}
	
	public void sayAll() {
		System.out.println("I am a phone device.My brand is "+super.getBrand()+" and I`m a model "+super.getModel()+" .");
	}

}
