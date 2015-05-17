
public class Bev extends Stock{
	int liters;
	String brand;
	
	public Bev(){
		super();
		this.liters=0;
		this.brand="Undefined";
	}
	
	
	
	public Bev(int price, boolean instock,int liters, String brand){
		super(price,instock);
		this.liters=liters;
		this.brand=brand;
	}
	
//	public void saybev(){
//		System.out.println("Price= "+price+";\nInstock= " + instock + ":" +"\n" + liters + brand);
//	} 
}
