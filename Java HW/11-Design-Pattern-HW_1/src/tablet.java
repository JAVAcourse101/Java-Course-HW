public class tablet extends device{
	
	public tablet(){
		super.setBrand("Undefined");
		super.setModel("Undefined");
	}
	public tablet(String brand, String model){
		super.setBrand(brand);
		super.setModel(model);
	}
	
	public void sayAll() {
		System.out.println("I am a tablet device.My brand is "+super.getBrand()+" and I`m a model "+super.getModel()+" .");
	}

}