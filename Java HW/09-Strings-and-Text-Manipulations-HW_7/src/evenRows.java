
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;


public class evenRows {

	public static void main(String[] args) {
		
		readWrite("..\\files\\programming.txt","../output/odd.txt","../output/even.txt");
		
	}
	
	public static void readWrite(String path,String odd,String even){
		try {
			
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			int count=2;

			while (bufferedReader.ready()) {
					
					String line = bufferedReader.readLine();
					count++;
					
					if (count%2==0){
						FileWriter fileStream = new FileWriter(even, true);
						BufferedWriter writer = new BufferedWriter(fileStream);
						writer.write(line);
						writer.newLine();
						writer.close();
					}
					
					else{
						FileWriter fileStream = new FileWriter(odd, true);
						BufferedWriter writer = new BufferedWriter(fileStream);
						writer.write(line);
						writer.newLine();
						writer.close();
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
