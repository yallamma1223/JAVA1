package com.java.polymerphism;
//Method overloading
public class MethodOverloading{ 
	
	int Method1(int i , int x) {
		return i+x;
	}
	int  Method1(int i, int x, int y) {
		return i+x+y;
	}
	 
	public static void main(String[] args) {
		MethodOverloading meth=new MethodOverloading();
		System.out.println(meth.Method1(10, 20));
		System.out.println(meth.Method1(10, 20, 30));

	}	
	}


