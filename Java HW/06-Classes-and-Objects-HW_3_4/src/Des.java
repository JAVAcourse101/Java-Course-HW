
public class Des extends Stock{
	int cal;
	String country;
	
	public Des(){
		super();
		this.cal=0;
		this.country="Undefined";
	}
	
	public Des(int price, boolean instock,int cal, String country){
		super(price,instock);
		this.cal=cal;
		this.country=country;
	}
}
