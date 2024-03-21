package com_programing_examples;

public class PrintevenString {

	public static void main(String[] args) {
String name= "this is the java language";

String[] words= name.split(" ");
for (String word: words) 

if(word.length()%2==0) {
	System.out.println(word);
}
	}

}
