package com.Decision.MakingStst;

import java.util.Scanner;

public class decision4 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("enter the marks");
		   int Num=sca.nextInt();
		   if (Num>85) {
			   System.out.println("yahoo 1st class");
		   }
		   else if(Num<85&& Num>75) {
			   System.out.println("yahoo 2st class");

		   }
		   else if (Num<70&& Num>35) {
			   System.out.println("yahoo 3rd class");

		   }
		   else if (Num==35) {
			   System.out.println("yahoo just  pass");

		   }
		   else {
			   System.out.println("student id fail");
		   }
	}

}
