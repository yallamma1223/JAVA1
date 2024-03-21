package com.Exception.Handling;
public class Test6 {

	public static void main(String[] args) {

		try {
			int[] arr = {2,3,4,2};
			arr[3]=34/0;
			System.out.println(arr[3]);
		}
		catch(ArithmeticException Ae) {
			System.out.println(Ae);

		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);

		}
		catch(Exception e) {
			System.out.println(e);

		}
		System.out.println("statement after the error");

	}

}
