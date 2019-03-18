package com.java.day5;

import java.io.File;
import java.io.IOException;

public class FileDem {
	public static void main(String[] args) throws IOException {
			File file= new File("C:\\Users\\payal\\Downloads\\Java Arrays.docx");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			File file1= new File("C:\\Users\\payal\\Downloads");
			if(!file1.exists()) {
				file1.mkdir();
			}
			
				
	}
}
//java.io
//InputStream-OutputStream(byte: binary)	Reader-Writer(2 bytes/char): text
//FileiNputStream					FileReader
//FileOutputStream					FileWriter