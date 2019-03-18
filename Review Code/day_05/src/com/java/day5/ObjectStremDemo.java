package com.java.day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class ObjectStremDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Parent parent= new Parent(1,"Parul");
/*	FileWriter writer= new FileWriter("abc.txt");
	writer.write(parent.toString());
	writer.flush();
	writer.close();*/
	ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("abc.txt"));
	os.writeObject(parent);
	
	ObjectInputStream is= new ObjectInputStream(new FileInputStream("abc.txt"));
	Parent p1=(Parent) is.readObject();
	System.out.println(p1.id);
	System.out.println(p1.name);
}
}
@AllArgsConstructor
class Parent implements Serializable{
	transient int id;
	String name;
	//readObject, writeObject
	//
}