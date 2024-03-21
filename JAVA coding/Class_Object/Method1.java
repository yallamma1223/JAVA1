package com.Objects.Classses;

public class Method1 {
	int id;
	int salary;
	String name;
	
void insertinformation(int a,int b ,String c) {
id=a;
salary=b;
name=c;
System.out.println(id + " "+ name);

}

	

	public static void main(String[] args) {
   Method1 s1=new Method1();
   s1.insertinformation(101, 34, "rahul");

	}}
