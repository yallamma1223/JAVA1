package com.Conditions;

import java.util.Scanner;

public class switch5 {

	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	System.out.println("enter the 1st  number");

	int n1= sca.nextInt();
	System.out.println("enter the 2st  number");


	int n2= sca.nextInt();
	System.out.println("enter the operator");
	char c= sca.next().charAt(0);

	
	switch(c) {
	case '+':
		int ref=n1+n2;
		System.out.println("result:" +ref);
		break;
	case '-':
		int ref1=n1-n2;
		System.out.println("result:" +ref1);
		break;
	case '*':
		int ref2=n1*n2;
		System.out.println("result:" +ref2);
		break;
	case '/':
		int ref3=n1/n2;
		System.out.println("result:" +ref3);
		break;
	case '%':
		int ref4=n1%n2;
		System.out.println("result:" +ref4);
		break;
		default:
			System.out.println("invaild");
	}
	}}