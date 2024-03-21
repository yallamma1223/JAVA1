package com.polymerphism;


class Final_Variable12{
	
final void add()
{
	  System.out.println("add method");
}}
class Ani extends Final_Variable12{
	  
void add() {
	  System.out.println("this is add child variable");
}

public class Final_Variable1 {
	
	public static void main(String[] args) {
		Ani a= new Ani();
		a.add();
	}

}}
