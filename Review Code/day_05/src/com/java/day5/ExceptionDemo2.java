package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionDemo2 {
	public static void main(String[] args) throws FileNotFoundException {
		
		//Checked Exception
		FileReader reader= new FileReader("abc.txt");
		System.out.println(1);
	}
}
