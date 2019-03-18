package com.java.day5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter writer= new FileWriter("abc.txt",true);
		writer.write("Hello World");
		writer.write("\n");
		writer.write(100);
		writer.flush();
		writer.close();
	}
}
