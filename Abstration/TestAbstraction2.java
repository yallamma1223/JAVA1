package com.Abstration;

abstract class Bike{
	Bike(){
		System.out.println("bike is created");
	}
	abstract void run();
	void gear() {
		System.out.println("chage the gear");
	}
}
class Honda extends Bike{  
	void run() {
		System.out.println("run safly");
	}
}  	


public class TestAbstraction2 {

	public static void main(String[] args) {
Honda h= new Honda();
h.run();
h.gear();
	}

}
