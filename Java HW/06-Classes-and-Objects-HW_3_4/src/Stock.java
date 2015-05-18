import java.util.Scanner;


abstract public class Stock {
	static int stockCount=0;
	int price;
	boolean instock;
	int temp1;
    String temp2;
	
    Scanner input = new Scanner(System.in,"UTF-8");
    public Stock(){
		this.price=0;
		this.instock=true;
		this.temp1=0;
		this.temp2="Empty";
		stockCount++;
	}
	
	public Stock(int price, boolean instock){
		this.price=price;
		this.instock=instock;
		stockCount++;
	}
	
	public void saybev(){
		
		System.out.println("Price = "+price+":\nInstock = " +instock+":\n"+"Liters = "+temp1+":\n"+"Brand = "+temp2+":");
	}
	
	public void saydes(){
		System.out.println("Price = "+price+":\nInstock = " +instock+":\n"+"Callories = "+temp1+":\n"+"Country = "+temp2+":");
	}
	
	public void sayfruit(){
		System.out.println("Price = "+price+":\nInstock = " +instock+":\n"+"Count of fruits = "+temp1+":\n"+"Color = "+temp2+":");
	}
	
	public void saymeat(){
		System.out.println("Price = "+price+":\nInstock = " +instock+":\n"+"Grams of meat = "+temp1+":\n"+"Animal = "+temp2+":");
	}
	
	public void sayveg(){
		System.out.println("Price = "+price+":\nInstock = " +instock+":\n"+"Kilograms of vegtable = "+temp1+":\n"+"Season = "+temp2+":");
	}
	
	public static int getstockCount() {
		return stockCount;
	}
	
	public void setTemp1(int temp1) {
		if(temp1 != 0){
			this.temp1 = temp1;
		}
	}
	
	public void setTemp2(String temp2) {
		if(temp2 != null){
			this.temp2 = temp2;
		}
	}
	
	public void setinstock(boolean stock) {
			this.instock = stock;
		
	}
}
