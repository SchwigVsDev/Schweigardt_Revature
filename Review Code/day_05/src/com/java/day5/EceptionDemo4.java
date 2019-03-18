package com.java.day5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EceptionDemo4 {
	public static void main(String[] args)  {
		try {
			FileReader reader= new FileReader("abc.txt");
			System.out.println(1);
		}catch(FileNotFoundException e) {
			System.out.println("File Not found");
		}
	}
}
