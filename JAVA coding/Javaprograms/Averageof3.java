package Javaprograms;

import java.util.Scanner;

public class Averageof3 {

	public static void main(String[] args) {
		System.out.println("enter the 1st number: ");
	    Scanner sca = new Scanner(System.in);
	    int num1 = sca.nextInt();
	    System.out.println("enter the 2nd number: ");
	    int num2 = sca.nextInt();
	    System.out.println("enter the 3rd number: ");
	    int num3 = sca.nextInt();
	    System.out.println(num1+num2+num3/(3));
	}

}
