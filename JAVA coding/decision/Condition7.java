package com.Conditions;

import java.util.Scanner;

public class Condition7 {

	public static void main(String[] args) {
		Scanner sca= new Scanner(System.in);
		System.out.println("Enter the day");
		 String  day =sca.nextLine();
		 if(day=="Monday") {
				System.out.println("its monday");
			}
			else if(day=="Tuesday") {
				System.out.println("its Tuesday");
			}
			else if(day=="Wednesday") {
				System.out.println("its Wednesday");
			}
			else if(day=="Thursday") {
				System.out.println("its Thurday");
			}
			else if(day=="Friday") {
				System.out.println("its Friday");
			}
			else if(day=="Saturday") {
				System.out.println("its weekends");
			}
			else if(day=="Sunday") {
				System.out.println("its weekends");
			}
		
	}

}
