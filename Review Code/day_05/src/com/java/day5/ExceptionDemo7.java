package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo7 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException e) {
			System.out.println(4);
		}
		System.out.println(1);
	}

	private static void m1() throws FileNotFoundException {
		m2();
		System.out.println(2);
		
	}

	private static void m2() throws FileNotFoundException {
		FileReader reader= new FileReader("abc.txt");
		System.out.println(3);
		
	}
}
//Checked -> throws| try-catch 