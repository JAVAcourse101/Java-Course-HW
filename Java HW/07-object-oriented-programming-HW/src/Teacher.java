import java.util.Scanner;


public class Teacher extends Person implements Hello{
	
	String subject;
	
	public Teacher(){
		setFName("no fname");
		setLName("no lname");
		setWY(0);
		setAge(0);
		setSubject("no subject");
		
	}
	
	public Teacher(String fName,String lName,int age,int workY,String subject){
		setFName(fName);
		setLName(lName);
		setWY(workY);
		setAge(age);
		setSubject(subject);
		counter++;
		
	}
	
	public void setSubject(String subject){
		this.subject=subject;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void goodDay() {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Good day I`m "+fName);
		input.close();
	}
	
	
	public void bye() {
		System.out.println("Bye I was " + fName);
	}

	
	public void hello() {
		System.out.println("Hi I`m "+fName);
		
		
	}


}
