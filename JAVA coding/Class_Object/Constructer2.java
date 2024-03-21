package com.Objects.Classses;
//Java Program to demonstrate the use of the parameterized constructor.  

public class Constructer2 {
	int id;
	String name;
	
	Constructer2(int ids, String names){
		this.id=ids;
		this.name=names;

	}
	 void display(){
		System.out.println(id+name);
	}
	
	public static void main(String[] args) {
		Constructer2 co=new Constructer2(101, "Rahul");
		Constructer2 co1= new Constructer2(102, "Priyanka");
	co.display();
	}

}
