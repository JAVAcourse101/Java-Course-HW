
public class device {
	private String model;
	private String brand;
	
	public device(){
		this.model="Undefined";
		this.brand="Undefined";
	}
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void sayAll() {
		System.out.println("I am a device.My brand is "+brand+" and I`m a model "+model+" .");
	}
	

}
