package com.Conditions;

import java.util.Scanner;

public class Condition10 {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		 int  num =sca.nextInt();
		 System.out.println("Enter the 2nd  Number");
		 int  num1=sca.nextInt();
		 System.out.println("Enter the math operator");

		 int operator = 0;
		 
switch(operator) {
case '+' : 
int result = num+num1;
System.out.println(result);
break;
case '-' :
	int result1 = num-num1;
	System.out.println(result1);

	break;
case '/':
	int result2= num/num1;
	System.out.println(result2);

	break;
case '*':
	int result3= num/num1;
	System.out.println(result3);
break;
default:
	System.out.println("invalid expression");
}}}