package Javaprograms;

import java.util.Scanner;

public class table8 {

	public static void main(String[] args) {
		System.out.println("enter the 1st number: ");
	    Scanner sca = new Scanner(System.in);
	    int num1 = sca.nextInt();
	    for ( int i=0; i <10; i ++ ){
	System.out.println(num1+ "X" +(i+1) + "=" + (num1 *(i+1)) );
	}

}
}