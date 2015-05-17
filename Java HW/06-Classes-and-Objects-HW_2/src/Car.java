
public class Car {
	int price;
	
	public Car(){
		this.price=0;
	}
	
	public Car(int price){
		this.price=price;
	}

	public  int get(){
		
		return (price);
	}
	
	public void say(){
		 System.out.println("Hi I`m a car. My cost is "+price);
	 }
}
