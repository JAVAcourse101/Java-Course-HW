import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
		System.out.println("Let`s create a library. Please enter name"); 
		String name=input.nextLine();
		
		System.out.println("Please enter address"); 
		String address=input.nextLine();

		library lib = new library (name,address);
		
		System.out.println("Here is the name and address od our library");
		System.out.println(lib.getName());
		System.out.println(lib.getAddress());
		
		boolean exit=false;
		
		for(;exit==false;){
			input.nextLine();
			System.out.println("What do you want to do next? type *A* for adding a book,*R* for removing a book and *E* to exit");
			String ans=input.nextLine();
			
			
			if(ans.equals("E")){
				exit=true;
			}
			if(ans.equals("A")){
				System.out.println("You are about to enter a new book.Please enter name of the book:"); 
				 String tName=input.nextLine();
				 
				 System.out.println("Please enter aouthor of the book:");
				 String tAuthor=input.nextLine();
				 
				 System.out.println("Please enter pages of the book:");
				 int tPages=input.nextInt();
				
				lib.addBook(tName, tAuthor, tPages);
			}
			if(ans.equals("R")){
				System.out.println("Lets see what do we have in the library so far");
				
				lib.seeBook();
				
				System.out.println("Enter number of the book you want to remove");
				int number=input.nextInt();
				lib.removeBook(number);
			
				
			}
		}
		input.close();
	}

}
