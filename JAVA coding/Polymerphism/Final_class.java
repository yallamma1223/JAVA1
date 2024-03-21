package com.polymerphism;
//If you make any class as final, you cannot extend it.


public final class Final_class1 {

	class Dog extends Final_class1{
		void run() {
			System.out.println("Running slow");
		}
	}
	
	class Final_class {
	public static void main(String[] args) {
Dog dg= new Dog();
dg.run();

	}

}}
