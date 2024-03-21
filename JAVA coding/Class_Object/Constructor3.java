package com.Objects.Classses;

public class Constructor3 {
int id;
String na;
String p;
	Constructor3(int num, String name){
		id=num;
	na=name;

	}
	
	Constructor3(int num, String name, String pa){
		this.	id=num;
		this. na=name;
		this. p=pa;
	}
	 public Constructor3(int i) {
		// TODO Auto-generated constructor stub
	}

	void display() {
			System.out.println(id+na+p);
		

	 }
	

	
	
	public static void main(String[] args) {
		Constructor3 co=new Constructor3(102, "rahul");
		Constructor3 co1 =new Constructor3(104,"Piyanka", "pass");
	co.display();
	co1.display();
	}
	
	

}
