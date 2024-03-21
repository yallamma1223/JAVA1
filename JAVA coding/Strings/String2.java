package com_String;

public class String2 {

	public static void main(String[] args) {
		//creating string by Java string literal?
		//converting char array to string   ?
		//creating Java string by new keyword    ?
		String s1="Hello";
		char[] chr= {'H', 'e','l','l','o'};
		
		String s2=new String(chr);
		String s3= new String("Hello");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
