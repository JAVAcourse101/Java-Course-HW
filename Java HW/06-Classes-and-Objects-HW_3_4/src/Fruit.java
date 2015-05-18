
public class Fruit extends Stock{
	int count;
	String color;
	public static int fruitCount = 0;
	
	public Fruit(){
		super();
		this.count=0;
		this.color="Undefined";
		fruitCount++;
	}
	
	public Fruit(int price, boolean instock,int count, String color){
		super(price,instock);
		this.count=count;
		this.color=color;
		fruitCount++;
	}
	
	public static int getfruitCount() {
		return fruitCount;
	}

}
