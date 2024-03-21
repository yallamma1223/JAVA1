package com.Objects.Classses;
//We can also create multiple objects and store information in it through reference variable.


public class Obj3 {
int id;
	String name;
	public static void main(String[] args) {
Obj3 s1=new Obj3();
Obj3 s2=new Obj3();
s1.id=101;
s2.id=102;
s1.name="ushh";
s2.name="pushhh";
System.out.println(s1.id + " " + s2.name);
	}

}
