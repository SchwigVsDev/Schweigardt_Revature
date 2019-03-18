package com.java.day5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class BufferedWriterDemo {
	public static void main(String[] args) throws FileNotFoundException {
	//	BufferedReader reader= new BufferedReader(new FileReader("abc.txt"));
		
		PrintWriter writer= new PrintWriter("abc.txt");
		writer.println(100);
		writer.println(true);
		writer.println("hello");
	}
}
