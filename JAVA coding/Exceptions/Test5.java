package com.Exception.Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Let's see an example to handle checked exception.

//FileNotFoundException
public class Test5 {

	public static void main(String[] args) {

		
		try {
		FileReader fl= new FileReader("test.txt");
		}
		catch(FileNotFoundException file) {
			System.out.println(file);
		}
		System.out.println("next line of the error");
	}

}
