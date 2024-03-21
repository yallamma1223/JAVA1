package com.Conditions;
import java.util.Scanner;

public class switch1 {

	//1. Write a program to read a weekday number and print weekday name using switch statement


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
 
		System.out.println("Enter the Weekday Number : ");
		 int days = input.nextInt();
		switch(days) {
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("tuesday");

	break;
case 3:
	System.out.println("wednesday");

	break;
case 4:
	System.out.println("thursday");

	break;
case 5:
	System.out.println("friday");

	break;
case 6:
	System.out.println("satrurday");

	break;
	default: 
		System.out.println("invalid day number");
}
	}

}
