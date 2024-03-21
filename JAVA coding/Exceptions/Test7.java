package com.Exception.Handling;

public class Test7 {

	public static void main(String[] args) {

		try {
			String s= null;
			System.out.println(s.length());
		}
		catch(ArithmeticException ae) {
			System.out.println(ae);
			
		}
		
		catch (Exception e) {
			System.out.println("parent exception");
		}
	}

}
