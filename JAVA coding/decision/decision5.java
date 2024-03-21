package com.Decision.MakingStst;

import java.util.Scanner;

public class decision5 {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		System.out.println("enter the day");
		   String  Num=sca.nextLine();
		   if (Num.equals("monday")|| Num.equals("tuesday")|| Num.equals("wednesday")|| Num.equals("thursday")||Num.equals("friday")
) {
			   System.out.println("opps todays weekdays");
			   }
		   else if (Num.equals("saturday")|| Num.equals("sunday")) {
			   System.out.println("yahoo its weekend");
		   }
		   else {
			   System.err.println("invalid day");
		   }
		   }

}
