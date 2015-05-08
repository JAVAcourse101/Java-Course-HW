import java.util.Scanner;
public class oddOrNot {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Please enter a whole number and the code will check if it is odd or even: ");
        Long num = input.nextLong();

        long two = num%2;
        boolean bo2 = two == 0;
        System.out.println("Boolean result: your whole number is even: "+ bo2);
        if (bo2==true){
        System.out.println("The number you have entered (" + num + ") is even: ");
        }
        else {
        System.out.println("The number you have entered (" + num + ") is odd: ");
        input.close();
        }    
}
}

