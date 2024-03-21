package com.Arrays;
//find the minimum array
public class Four {

	static void method(int arr[]) {
	int	method =arr[0];
		for (int i=1; i<arr.length ; i++) 
			if(method>arr[i])
				method=arr[i];
			System.out.println(method);
		
	}
	
	
	public static void main(String[] args) {

int arr[]= {23,3,2,4,2};

		method(arr);
	}

}
