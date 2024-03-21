package com.polymerphism;

public class IIB2 {

	IIB2(){
		System.out.println("This is constructor");
	}
	{System.out.println("this is instace initialise block");}	
	public static void main(String[] args) {
		IIB2 ini= new IIB2();
		IIB2 ini1= new IIB2();
	}

}
