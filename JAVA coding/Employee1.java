package com.oops;

class Employe{
 
	int salary= 122;
	
}
	
	class Emp extends Employe{
		int bonus= 100;
	}
	
	public class Employee1{
	public static void main(String[] args) {
		Emp e=new Emp();
		System.out.println(e.salary);
		System.out.println(e.bonus);
	}

}
