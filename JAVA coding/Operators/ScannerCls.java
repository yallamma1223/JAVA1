package com.Operators;

import java.util.Scanner;

public class ScannerCls {

	public static void main(String[] args) {
Scanner sca = new Scanner(System.in);
System.out.println("What is your name");
  String name= sca.nextLine();
  System.out.printf("hey %s, how are u \n", name);
  String status= sca.nextLine();
  System.out.println("What is youe age");
int age = sca.nextInt();
System.out.printf("thank you for the information");

sca.close();
	}

}
