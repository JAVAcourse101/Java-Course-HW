
public class Sort {

	public static void main(String[] args) {
		
		
		Car [] carA = new Car [10];
		
		carA[0]= new SUV(1000,true);
		carA[1]= new SUV(500,true);
		carA[2]= new SUV(10000,true);
		carA[3]= new SUV(15000,true);
		carA[4]= new SUV(35000,true);
		carA[5]= new Automobile(1500,10);
		carA[6]= new Automobile(700,12);
		carA[7]= new Automobile(800,9);
		carA[8]= new Automobile(3500,20);
		carA[9]= new Automobile(9000,22);
		
		boolean M = false;   
	     
		Car temp;
	     int price1;
	     int price2;

	     while ( M==false )
	     {
	            M= true;    
	            for( int j=0;  j < carA.length -1;  j++ ){
	            	price1=carA[j].price;
	            	price2=carA[j+1].price;
	                   
	            	   if ( price1 > price2 ){
	                   
	                           temp = carA[ j ];
	                           carA[ j ] = carA[ j+1 ];
	                           carA[ j+1 ] = temp;
	                           M = false;                
	                   } 
	            }
	     }
	     for(int i=0; i<=9; i++){
				carA[i].say();
			}
		
		}
	
}
