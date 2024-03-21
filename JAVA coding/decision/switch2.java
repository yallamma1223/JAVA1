package com.Conditions;

import java.util.Scanner;

public class switch2 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		 
		System.out.println("Enter the gender m/f : ");
		 char gender = sca.next().charAt(0);
	switch(gender) {
	case 'm':
	case 'M':
		System.out.println("male");
		break;
	case 'f':
	case 'F':
		System.out.println("female");
		break;
default:
	System.out.println("invaild gender");
	}
	}

}
