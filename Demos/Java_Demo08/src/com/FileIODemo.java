package com;

import java.util.*;
import java.io.*;
import lombok.*;

public class FileIODemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileWriter writer = new FileWriter("test.txt");
		writer.write("Hello, Meatbags!");
		writer.write("\n ");
		writer.write("CL4P-TP");
		A a = new A();
		writer.write(a.toString());
		writer.flush();
		writer.close();
		// Use BufferedReader & PrintWriter for primitives.
		// Use ObjectStream for Object classes
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.txt"));
		os.writeObject(a);
		os.close();

		ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.txt"));
		A a2 = (A) is.readObject();
		is.close();
		System.out.println(a2);
	}

}

@ToString
class A implements Serializable {
	int num;
	String str;
}
