
public class Veg extends Stock{
	int kgrams;
	String season;
	
	public Veg(){
		super();
		this.kgrams=0;
		this.season="Undefined";
	}
	
	public Veg(int price, boolean instock,int kgrams, String season){
		super(price,instock);
		this.kgrams=kgrams;
		this.season=season;
	}

}
