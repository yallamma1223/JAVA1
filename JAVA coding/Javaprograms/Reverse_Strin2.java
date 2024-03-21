package com_programing_examples;

public class Reverse_Strin2 {
//using tostringArray
	public static void main(String[] args) {
String s= "Green world";

char[] all= s.toCharArray();
for(int i=s.length()-1; i >=0;  i--) {
	System.out.print(all[i]);
	
}
	}

}
