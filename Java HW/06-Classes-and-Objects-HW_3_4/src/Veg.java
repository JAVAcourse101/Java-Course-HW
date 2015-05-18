
public class Veg extends Stock{
	int kgrams;
	String season;
	public static int vegCount=0;
	
	
	public Veg(){
		super();
		this.kgrams=0;
		this.season="Undefined";
		vegCount++;
		
	}
	
	public Veg(int price, boolean instock,int kgrams, String season){
		super(price,instock);
		this.kgrams=kgrams;
		this.season=season;
		vegCount++;
	}
	
	public static int getvegCount() {
		return vegCount;
	}

}
