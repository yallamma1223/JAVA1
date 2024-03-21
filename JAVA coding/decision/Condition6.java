package com.Conditions;

import java.util.Scanner;

public class Condition6 {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the day");
		 int  day =sca.nextInt();
		if(day==1) {
			System.out.println("its monday");
		}
		else if(day==2) {
			System.out.println("its Tuesday");
		}
		else if(day==3) {
			System.out.println("its Wednesday");
		}
		else if(day==4) {
			System.out.println("its Thurday");
		}
		else if(day==5) {
			System.out.println("its Friday");
		}
		else if(day==6) {
			System.out.println("its Saturday");
		}
		else if(day==7) {
			System.out.println("its Sunday");
		}
	}	}