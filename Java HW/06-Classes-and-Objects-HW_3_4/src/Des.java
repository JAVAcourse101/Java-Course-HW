
public class Des extends Stock{
	int cal;
	String country;
	public static int desCount = 0;
	
	public Des(){
		super();
		this.cal=0;
		this.country="Undefined";
		desCount++;
	}
	
	public Des(int price, boolean instock,int cal, String country){
		super(price,instock);
		this.cal=cal;
		this.country=country;
		desCount++;
	}
	
	public static int getdesCount() {
		return desCount;
	}
}
