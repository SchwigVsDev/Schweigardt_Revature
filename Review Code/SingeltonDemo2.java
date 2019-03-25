package com.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingeltonDemo2 implements Serializable, Cloneable{
//Object created when someone calls getInstance method.: Lazy initialization
	private static SingeltonDemo2 obj;

	String connection;
	String password;

	private SingeltonDemo2() {
		connection = "My connections";
		password="abc";
	}

	// 100 threads
	public static SingeltonDemo2 getInstance() {
		if (obj == null) {
			synchronized (SingeltonDemo2.class) {
				if (obj == null) {
					obj = new SingeltonDemo2();
				}
			}
		}
		return obj;
	}
	
/*	public Object readResolve()
    		throws ObjectStreamException{
		return obj;
	}
	*/
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.writeUTF(connection);
	}
	
	private void readObject(ObjectInputStream ois) throws IOException{
		connection=	ois.readUTF();
	}
	
	@Override
		protected Object clone() throws CloneNotSupportedException {
			return obj;
		}
}	

class Client {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingeltonDemo2 obj1=SingeltonDemo2.getInstance();
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.txt"));
		oos.writeObject(obj1);// connection: value
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("abc.txt"));
		SingeltonDemo2 obj2=(SingeltonDemo2) ois.readObject();
		System.out.println(obj2.password);
		System.out.println(obj1==obj2);
	}
}