package com.java.day5;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo12 {
	public static void main(String[] args) {
		try {
			FileReader reader= new FileReader("abc.txt");
			System.out.println(4);
			int a= 5/0;
			System.out.println(5);
		}catch(ArithmeticException e) {
			System.out.println(1);
		}catch(IOException e) {
			System.out.println(2);
		}finally {
			System.out.println(3);
		}
		System.out.println(6);
	}
}
// try catch throws finally throw