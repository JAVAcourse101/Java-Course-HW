public class laptop extends device{
	
	public laptop(){
		super.setBrand("Undefined");
		super.setModel("Undefined");
	}
	public laptop(String brand, String model){
		super.setBrand(brand);
		super.setModel(model);
	}
	
	public void sayAll() {
		System.out.println("I am a laptop device.My brand is "+super.getBrand()+" and I`m a model "+super.getModel()+" .");
	}

}