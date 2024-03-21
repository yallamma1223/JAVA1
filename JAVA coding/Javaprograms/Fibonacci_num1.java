package com_programing_examples;

public class Fibonacci_num1 {

	public static void main(String[] args) {
		int n1=0; int n2=1; int n3;
		System.out.print(n1 + " " + n2);
		for (int i=0; i<5; i++) {
			n3=n1+n2; //0+1=1
			n2=n3;//1+1=2
			n1=n2;
			
			System.out.println( "" +n3);
		}
	}

}
