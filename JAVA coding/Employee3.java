package com.oops;
//Multiple inheritence
//Compalisation error

class A{
	void dog() {
		System.out.println("im A dog");
	}
}
class B{
void dog() {
		System.out.println("im B dog");
	}
}






public class Employee3 {

	public static void main(String[] args) {
B c= new B();
c.dog();
	}

}
