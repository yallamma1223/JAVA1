package com_programing_examples;
//Fibonacci series in Java
//expected output 0 1 1 2 3 5 8 13 21 34 
public class Fibonacci_num {
		public static void main(String args[])  
		{    
		 int n1=0,n2=1,n3;  
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    int i=0;
		 for(i=2;i<10;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);  //1  2 5
		  n1=n2;  //0 1 2
		  n2=n3;  //1 2 3

		 }    
		  
		}}  
