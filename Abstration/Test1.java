package com.Abstration;

abstract class Test1 {              //abstract class 

	abstract void method1();
	
	
}
	class Test2 extends Test1{
		void method1() {
			System.out.println("this the implemention");
		}
	
	public static void main(String[] args) {
       Test2 ts=new Test2();
		ts.method1();
	}
		
}
