import java.util.Scanner;
public class Check {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in, "UTF-8");

        System.out.println("Please enter a whole number and the code will check if it can be devided by 5 and 7 without a leftover: ");
        Long num = input.nextLong();

        long five = num%5;
        boolean bo5 = five == 0;
        System.out.println("Boolean result: the number you have entered (" + num + ") can be devided by 5 without a leftover: " + bo5);
        System.out.println("The leftover from deviding your whole number (" + num + ") by 5 is: " + five);
        if (bo5 == true){
        	System.out.println("Your whole number (" + num + ") CAN be devidied by 5 without a leftover");
        }
        else {
        	System.out.println("Your whole number (" + num + ") can NOT be devidied by 5 without a leftover");
        }
        long seven = num%7;
        boolean bo7 = seven == 0;
        System.out.println("Boolean result: the number you have entered (" + num + ") can be devided by 7 without a leftover: " + bo7);
        System.out.println("The leftover from deviding your whole number (" + num + ") by 7 is: " + seven);
        if (bo7 == true){
        	System.out.println("Your whole number (" + num + ") CAN be devidied by 7 without a leftover");
        }
        else {
        	System.out.println("Your whole number (" + num + ") can NOT be devidied by 7 without a leftover");
        }
        input.close();
}
}