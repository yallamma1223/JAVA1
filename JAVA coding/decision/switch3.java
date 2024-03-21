package com.Conditions;

import java.util.Scanner;

public class switch3 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		 
		System.out.println("Enter the Character: ");
		 char vowel = sca.next().charAt(0);
switch(vowel) {
case 'a':
case 'A':
	System.out.println("yeah a is a vowel");
break;
case 'E':
case 'e':
	System.out.println("yeah E is a vowel");
break;
case 'i':
case 'I':
	System.out.println("yeah I is a vowel");
break;
case 'O':
case 'o':
	System.out.println("yeah O is a vowel");
break;
case 'u':
case 'U':
	System.out.println("yeah U is a vowel");
break;
default: 
	System.out.println("its a constant");
}
	}

}
