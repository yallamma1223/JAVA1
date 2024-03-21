package com.java.polymerphism;
//MethodOverloading by changing the data types
public class MethodOverloading1 {

	int  Method1(int x, int y) {
		return x-y;
	}
	
	double  Method1(double x, double y) {
		return x-y;
	}
	
	public static void main(String[] args) {

		MethodOverloading1 m= new MethodOverloading1();
		System.out.println(m.Method1(10, 5));
		System.out.println(m.Method1(10.0, 5.0));
		
	}

}
