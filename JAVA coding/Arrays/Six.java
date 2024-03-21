package com.Arrays;

public class Six {

	public static void main(String[] args) {
int[] num1= {5,7,5,3,5};
int[] copy_num= num1.clone();

for (int i=0; i<num1.length; i++)
copy_num[i]=num1[i];

	
//print the original array
System.out.print("original array");
for (int i=0; i<num1.length; i++) {
	System.out.print(num1[i]+ " ");
	
}
System.out.print("copied array");
for (int i=0; i<copy_num.length; i++) {
	System.out.print(copy_num[i]+ " ");
}
	}
}
 