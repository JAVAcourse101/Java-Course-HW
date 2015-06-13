import java.io.BufferedReader;
import java.io.FileReader;



public class checkEnd {

	public static void main(String[] args) {

		endCheck("..\\files\\programming.txt");
	}
	
	@SuppressWarnings("resource")
	public static void endCheck(String path){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					
				String line = bufferedReader.readLine();
				line=line.trim();
				int len=line.length()-1;
				
				if (line.length()==0){
					continue;
				}
				
				String last=Character.toString(line.charAt(len));
					
				System.out.println(last);	
					
				
				boolean flag=false;
				if (line.endsWith(".")==true||line.endsWith("?")==true||line.endsWith("!")==true){
					flag=true;
				}
				
				if (flag==false){
					throw new sentanceNotCompletedExeption("Your sentace does not edn with ! or ? or .");
					
					
				}
				
					
			}
			
			bufferedReader.close();
			}
		
			catch (Exception e) {
				System.out.println("Error while reading a file.");
				System.out.println(e.getMessage());
				System.exit(0);
			}
	}

}
