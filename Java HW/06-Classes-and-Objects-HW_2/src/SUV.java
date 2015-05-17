
public class SUV extends Car{
	boolean Offroad;
	
	public SUV(){
		super();
		this.Offroad=false;
	}

	public SUV (int price, boolean Offroad){ // Тук няма ли начин без да ги изброявам всичките
		super(price);
		this.Offroad=Offroad;
	}
}
