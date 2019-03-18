package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo11 {
	public static void main(String[] args) throws IOException {
		FileReader reader=null;
		try {
			 reader= new FileReader("abc.txt");
			System.out.println(3);
		}finally {
			if(reader!=null)
			reader.close();
			System.out.println(5/0);
		}
		System.out.println(2);
	}
}

//finally: Run some code irrespective of there is an exception or no
//closing ur resources/ clean up tasks. It does not handle ur exception
//Try block should have at-least one catch/finally block.