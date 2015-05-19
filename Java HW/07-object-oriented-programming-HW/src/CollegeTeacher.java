
public class CollegeTeacher extends Teacher{
	String col;
	
	
	
	public CollegeTeacher(){
		super();
		this.col="no college";
	}
	
	public CollegeTeacher(String fName,String lName,int age,int workY,String subject,String col){
		setFName(fName);
		setLName(lName);
		setWY(workY);
		setAge(age);
		setSubject(subject);
		this.col=col;
		counter++;
	}

}
