package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
//If file not present, o/p: FileNotFoundException 1
public class ExceptionDemo3 {
	public static void main(String[] args) {
		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(1);
	}
	
	public static void readFile() throws FileNotFoundException {
		FileReader reader= new FileReader("abc.txt");
		System.out.println(2);
	}
}
