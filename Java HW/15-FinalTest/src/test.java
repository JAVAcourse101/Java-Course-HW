
import java.io.BufferedWriter;

import java.io.FileWriter;
import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		
		arreyPlay  play = new arreyPlay();
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.println("Please tell me what do you want to do? \nEnter 1 if you want to make one dimensional to two dimensional arrey. \nEnter 2 if you want to turn two dimensional to one dimensinal arrey.");
		int menu = input.nextInt();
		
		if (menu!=1&&menu!=2){
			System.out.println("Invalid input try again");
			System.exit(0);
		}
		
		System.out.println("Please enter the lenght of the two dimensional arrey, whole number between 2 and 9.");
		int size = input.nextInt();
		
		if (size<2||size>9){
			
			System.out.println("Invalid input try again");
			System.exit(0);
			
		}
		
		if (menu==1){
		int [] one = new int [size*size];
			
			System.out.println("Please enter "+size*size +" whole numbers to fill the one dimensional arrey.");
			
			for (int i=0;i<size*size;i++){
				int mark=i+1;
				System.out.println("Please enter number "+mark+".");
				int number = input.nextInt();
				
				one[i]=number;
				
			}
			
			play.shapeShift(one,size);
			
			int [][] result =play.shapeShift(one,size);
			
			String filePath = "../output/result.txt";
			
			try {
						
						
						FileWriter fileStream = new FileWriter(filePath);
						
						
						BufferedWriter writer = new BufferedWriter(fileStream);
						
						for(int r = 0; r < result.length; r++){
							for(int c = 0; c < result[r].length; c++){
								writer.write(String.valueOf(result[r][c]));
								System.out.println(result[r][c]+" ");
								writer.newLine();
						    }
						}
						

						
						
						writer.close();
						
				}
				catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}
			
		}
		
		if (menu==2){
			int [][] two = new int [size][size];
				
				System.out.println("Please enter "+size*size +" whole numbers to fill the two dimensional arrey.");
				int i=0;
				
				for(int row = 0; row < two.length; row++){
					
					for(int col = 0; col < two[row].length; col++){
						int mark=i+1;
						System.out.println("Please enter number "+mark+".");
						i++;
						int number = input.nextInt();
						two[row][col]=number;						
					}					
				}	
				
				
				
				for(int r = 0; r < two.length; r++){
					for(int c = 0; c < two[r].length; c++){
						System.out.print(two[r][c] + " ");
				    }
					System.out.println();
				}
				

				
				play.shapeShift(two,size);
				
				int [] result =play.shapeShift(two,size);
				
				String filePath = "../output/result.txt";
				
				try {
							
							
							FileWriter fileStream = new FileWriter(filePath);
							
							
							BufferedWriter writer = new BufferedWriter(fileStream);
							
							for (int m= 0;m<size*size;m++){
								writer.write(String.valueOf(result[m]));
								writer.newLine();
								
								
							}
							
							
							writer.close();
							
					}
					catch (Exception e) {
						System.out.println("Error while writing a file.");
						System.out.println(e.getMessage());
						System.exit(0);
					}
			}
			
				
			
		
		input.close();
		
	}

}
