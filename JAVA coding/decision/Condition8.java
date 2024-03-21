package com.Conditions;

import java.util.Scanner;

public class Condition8 {
//This Java program prompts the user to input two numbers and then finds and prints the maximum of the two numbers using conditional statements.


	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the 1st number");
		 int   num =sca.nextInt();
		 System.out.println("Enter the 2nd number");
		 int   num1 =sca.nextInt();
		 if (num>num1) {
			 System.out.println("1st number is greater");
		 }
		 else if(num<num1) {
			 System.out.println("1st number is lesser");

		 }
		 else {
			 System.out.println("invalid number");
		 }
		
		
		
	}

}
