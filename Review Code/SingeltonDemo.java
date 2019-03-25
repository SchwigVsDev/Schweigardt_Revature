package com.java;

public class SingeltonDemo {
//Object created when my class is loaded: Eager initialization
	private static SingeltonDemo obj= new SingeltonDemo();
	
	String connection;
	
	private SingeltonDemo() {
		connection= "My connections";
	}
	
	public static SingeltonDemo getInstance() {
		return obj;
	}
}
