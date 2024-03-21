package com.Conditions;

import java.util.Scanner;

public class Condition9 {
//Varify any number is even or odd using switch case condition
	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the Number");
		 int  num =sca.nextInt();
		 switch(num%2) {
		 case 0: 
			 System.out.println("The number is even");
			 break;
		 case 1:
			 System.out.println("The number is Odd");
			 break;
			 default: 
				 System.out.println("Invalid number");
				 break;
		 
		 
		 }
	}

}
