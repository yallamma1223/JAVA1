package com.polymerphism;

//Let's see the simple example of instance initializer block that performs initialization.

public class IIB1 {
int speed;

IIB1()
{
	System.out.println("speed is : " +speed);
}
{speed=1000;}
	public static void main(String[] args) {
		IIB1 ini = new IIB1();
		IIB1 ini1 = new IIB1();
		
		
	}

}
