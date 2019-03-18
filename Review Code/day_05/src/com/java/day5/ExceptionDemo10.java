package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo10 {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileReader reader= new FileReader("abc.txt");
			System.out.println(3);
		}finally {
			System.out.println(1);
		}
		System.out.println(2);
	}
}

//finally: Run some code irrespective of there is an exception or no
//closing ur resources/ clean up tasks. It does not handle ur exception
//Try block should have at-least one catch/finally block.