import java.util.Scanner;


public class Lecturer extends Person implements Exercise,Hello{
	
	String uniName;
    static final int LECTURES_PER_WEEK= 10;
	
    public Lecturer(){
		setFName("no fname");
		setLName("no lname");
		setWY(0);
		setAge(0);
		setUniName("no uni");
		
	}
	
	public Lecturer(String fName,String lName,int age,int workY,String uniName){
		setFName(fName);
		setLName(lName);
		setWY(workY);
		setAge(age);
		setUniName(uniName);
		counter++;
		
	}
	
	
	public void setUniName(String uniname) {
		this.uniName = uniname;
	}
	
	public String getUniName() {
		return uniName;
	}
	
	public void goodDay() {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Good day");
		input.close();
	}

	
	public void ex(int duration) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("The duration of the exercise is "+duration+" minutes");
		input.close();
		
	}

	
	public void ex(int duration, int girls) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("The duration of the exercise is "+duration+" minutes and there will be "+girls+" girls in the class");
		input.close();
		
		
	}

	
	public void ex(int duration, int girls, int boys) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("The duration of the exercise is "+duration+" minutes and there will be "+girls+" girls and "+boys+" boys in the class");
		input.close();
		
	}

	
	public void hello() {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Hi");
		input.close();
		
	}

}
