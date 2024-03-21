package Operators;

public class javaversion {

	public static void main(String[] args) {
//Write a Java program to check whether Java is installed on your computer.
		//java version 
		System.out.println("Java version :" + System.getProperty("java.version"));
		//java runtime version 
		System.out.println("Java runtime :" + System.getProperty("java.runtime.version"));
//java home
		System.out.println("Java home :" + System.getProperty("java.home"));
//java vender
		System.out.println("Java vender :" + System.getProperty("java.vendor"));
//java vender url
		System.out.println("Java vendor url :" + System.getProperty("java.vendor.url"));
//java class path
		System.out.println("Java class path :" + System.getProperty("java.class.path"));

	}

}
