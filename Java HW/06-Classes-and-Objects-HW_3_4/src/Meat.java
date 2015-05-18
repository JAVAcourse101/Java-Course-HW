
public class Meat extends Stock{
	int grams;
	String animal;
	public static int meatCount = 0;
	
	public Meat(){
		super();
		this.grams=0;
		this.animal="Undefined";
		meatCount++;
	}
	
	public Meat(int price, boolean instock,int grams, String animal){
		super(price,instock);
		this.grams=grams;
		this.animal=animal;
		meatCount++;
	}
	
	public static int getmeatCount() {
		return meatCount;
	}

}
