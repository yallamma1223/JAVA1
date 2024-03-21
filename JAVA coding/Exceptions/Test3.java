package com.Exception.Handling;
//In this example, we handle the generated exception (Arithmetic Exception) with a different type of exception class (ArrayIndexOutOfBoundsException).


public class Test3 {

	public static void main(String[] args) {
 
 try {
	 int i=500/0;

 }
 catch(ArrayIndexOutOfBoundsException ae) {
	 System.out.println(ae);
	System.out.println("rest of the code"); 
 }
	}

}
