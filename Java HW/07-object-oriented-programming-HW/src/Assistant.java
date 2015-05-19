public class Assistant extends Lecturer implements Exam{
	
	Boolean headOrNo;
	
	public Assistant(){
		super();
		this.headOrNo=false;
	}
	
	
	public Assistant(String fName,String lName,int age,int workY,String uniName,boolean headOrNo){
		setFName(fName);
		setLName(lName);
		setWY(workY);
		setAge(age);
		setUniName(uniName);
		this.headOrNo=headOrNo;
		counter++;
	}

	
	public void nameHeadOrNo(){
		System.out.println("My name is "+ getFname()+" "+getLname()+"and I am a head assitant( "+headOrNo+")");
	}
	
	public void article(){
		System.out.println("I am wrting an article.");
		
	}
	
	public void homeWork() {
		
		System.out.println(" The assistant is checking HW...");
		
		
		
	}


	@Override
	public void exam() {
		System.out.println(" The professor is cheching the exam ...");
		// TODO Auto-generated method stub
		
	}
}
