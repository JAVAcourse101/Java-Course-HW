


public class Professor extends Lecturer implements Exam{

	String title;
	
	public Professor(){
		super();
		this.title="no title";
	}
	
	public Professor(String fName,String lName,int age,int workY,String uniName,String title){
		setFName(fName);
		setLName(lName);
		setWY(workY);
		setAge(age);
		setUniName(uniName);
		this.title=title;
		counter++;
	}
	
	
	
	public void titleWorkY(){
		
		System.out.println("My title is "+ title+" and i have "+getWY()+" years work experience");
		
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public void homeWork() {
		
		System.out.println(" The professor is checking HW...");
		
		
		
	}



	@Override
	public void exam() {
		System.out.println(" The professor is conducting exam ...");
		// TODO Auto-generated method stub
		
	}
}