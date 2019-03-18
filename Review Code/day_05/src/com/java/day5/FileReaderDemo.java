package com.java.day5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		//read a file and print contents on console
		FileReader reader= new FileReader(new File("C:\\Users\\payal\\Downloads","Java Arrays.docx"));;
		int i=reader.read(); //-1: EOF
		while(i!=-1) {
			System.out.println((char)i);
			i= reader.read();
		}
	}
}
//FileInputStream: create the image file copy