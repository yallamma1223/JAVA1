package com.Objects.Classses;

public class Method2 {
int length;
int width;
	
	
	
	void Values(int a,int b) {
		length=a;
		width=b;
		
	}
	
	void DisplayValues() {
		System.out.println(length*width);
	}
	
	
	
	public static void main(String[] args) {

	//Method2 area=new Method2();
	//area.Values(100,2);
	//area.DisplayValues();
		new Method2().Values(100,200);
		new Method2().DisplayValues();

		
	}

}
