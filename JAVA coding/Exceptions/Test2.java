package com.Exception.Handling;

public class Test2 {

	public static void main(String[] args) {
try {
	String s = null;//may throw an exception
}
catch(NullPointerException a){//handling the exception  {
	System.out.println(a);
System.out.println("Displed rest of the code");
}
}}