package com.Exception.Handling;

public class Test8 {

	public static void main(String[] args) {

			try {
				String s= null;
				System.out.println(s.length());
			}
			catch(ArithmeticException ae) {
				System.out.println(ae);
				
			}
			catch(NullPointerException nl) {
				System.out.println(nl);
				
			}
			
			
			catch (Exception e) {
				System.out.println("parent exception");
			}
		}

	
	}


