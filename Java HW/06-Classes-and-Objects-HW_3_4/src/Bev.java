


public class Bev extends Stock{
	int liters;
	String brand;
	public static int bevCount = 0;
	
	
	public Bev(){
		super();
		this.liters=0;
		this.brand="Undefined";
		bevCount ++;
	}
	
	
	
	public Bev(int price, boolean instock,int liters, String brand){
		super(price,instock);
		this.liters=liters;
		this.brand=brand;
		bevCount ++;
	}
	
	public static int getbevCount() {
		return bevCount;
	}
	
	
}
