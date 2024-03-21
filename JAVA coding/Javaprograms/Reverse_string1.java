package com_programing_examples;

public class Reverse_string1 {

	public static void main(String[] args) {

		String s ="Rajini kanth";
		StringBuilder sb= new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
		char[] ch= s.toCharArray();

	}
}
