import java.util.Scanner;
public class Circle {
public static void main(String[] args) {

Scanner input = new Scanner(System.in, "UTF-8");
System.out.println("This simple code will calculate the area and the parameter of a circle from it`s radius.");
System.out.println("Please enter the radius:"); 
float radius = input.nextFloat();
float pi = 3.1416f;
float area = radius * radius * pi ;
float parameter = 2 * radius * pi ;

System.out.println("The area of the circle is: " + area); 
System.out.println("The parameter os the circle is: " + parameter); 
	 input.close();
}
}
