
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;;


public class all {

	public static void main(String[] args) {
		

		try {
			readAllLines("..\\files\\programming.txt");
			
			String all=readAllLines("..\\files\\programming.txt");
			
			write("../output/noPun.txt",all);
		} 
		catch (FileNotFoundException b) {
			// TODO Auto-generated catch block
			b.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	public static String readAllLines(String file) throws FileNotFoundException,IOException{
		
		
			
			Path path = Paths.get(file);
			
			List<String> lines = Files.readAllLines(path);
			
			int len=lines.size();
			for (String line : lines) {
				 System.out.println(line);
			}
			
			String[]strArr=new String[len];
			strArr = lines.toArray(new String[0]);
			
			
			StringBuilder strBuilder = new StringBuilder();
			for (int i = 0; i < strArr.length; i++) {
			   strBuilder.append( strArr[i] );
			}
			String newString = strBuilder.toString();
			
			return newString;
	}
	
	
	public static void write(String file, String text) throws FileNotFoundException,IOException{
		FileWriter fileStream = new FileWriter(file);

		
		BufferedWriter writer = new BufferedWriter(fileStream);

			writer.write(text);
		
		
		writer.close();
		
		
		
}
}
