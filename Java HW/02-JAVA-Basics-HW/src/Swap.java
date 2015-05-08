	public class Swap {
	
		
		public static void main(String[] args) {
	 
	System.out.println( "Lest`s swap the values of two int varuables" );
int X=1;
int Y=3;
System.out.println( "Our first varuable is :" + X);
System.out.println( "Our first varuable is :" + Y);

X = X + Y;
Y = X - Y;
X = X - Y;

System.out.println( "After swaping our first varuable is :" + X);
System.out.println( "After swaping our second varuable is :" + Y);
}
}