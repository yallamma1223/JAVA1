package Operators;
import java.util.Scanner;
public class Area {

	public static void main(String[] args) {
Scanner sca = new Scanner(System.in);
System.out.println("Enter the number");
 //Double pi = 3.14;
 Double radius = sca.nextDouble();
 //Area 
 System.out.println(Math.PI*radius*radius);
 //perimeter
 System.out.println(2*Math.PI*radius);

	}

}
