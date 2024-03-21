package com.Encapsulation;

public class Test1 {

private	String name = "Rahul";
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public static void main(String[] args) {
		Test1 tst= new Test1();
		System.out.println(tst.getName());
	}

	

}
