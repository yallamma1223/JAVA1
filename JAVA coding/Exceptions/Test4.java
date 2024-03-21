package com.Exception.Handling;

public class Test4 {

	public static void main(String[] args) {
try {
	int[] arr= {2,3,6,6};
	System.out.println(arr[10]);
}
catch(ArrayIndexOutOfBoundsException ae) {
	
	
	System.out.println(ae);
}
System.out.println("Line after the error");
	}

}
