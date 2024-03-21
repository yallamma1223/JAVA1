package com.Conditions;

import java.util.Scanner;

public class Condition5 {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the Marks");
		 int num =sca.nextInt();
		 if (num<35) {
				System.out.println("Student failed");
		 }	else if(num==35) {
					System.out.println("Student failed");

				}
		 else if(num>35 && num<70) {
			 System.out.println("third class");
		 }
		 else if(num>70 && num<85) {
			 System.out.println("second class");
		 }
		 else if (num>85 &&num<100){
			 System.out.println("firse class");
		 }
		 else {
			 System.out.println("Invalid number");
		 }
		 }
		 
	}


