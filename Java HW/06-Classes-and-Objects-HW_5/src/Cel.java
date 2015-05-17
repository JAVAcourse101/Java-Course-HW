
public class Cel {
 double F;
 double C;
 
 public Cel(){
		this.F=0;
		this.C=0;
	}
 
 public Cel(double C){
	 this.C=C;	
	 this.F=C*1.8 + 32;
	}
 
 public void result(){
	 System.out.println(F);
	 
 }
 
}
