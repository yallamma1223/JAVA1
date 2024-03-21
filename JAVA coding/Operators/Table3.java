package Operators;
import java.util.Scanner;
public class Table3 {

	public static void main(String[] args) {
Scanner sca= new Scanner(System.in);
System.out.println("Enter the table that you expect");
	 int table=sca.nextInt();
	 for(int i=1;i<=10;i++)
	System.out.println(table + " X " + i + " = " +table*i);
	}

}
