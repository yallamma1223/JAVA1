package com.Objects.Classses;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
Scanner sca= new Scanner(System.in);
System.out.println("Enter the number");

  int num =sca.nextInt();
  AddEven(num);
	}
	
	public static int AddEven(int num) {
	if(num%2==0) {
		System.out.println("the given is even");
	}
	else {
		System.out.println("the given is odd");

	}
	return(num);
	
	}}
