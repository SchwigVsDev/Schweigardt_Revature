package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDmo8 {
	public static void main(String[] args) {
		m1();
		int x= 5/0;
		System.out.println(3);
	}

	private static void m1() {
		try {
			FileReader reader= new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(2);
		}
		System.out.println(1);
		
	}
}
//Unchecked
//Checked