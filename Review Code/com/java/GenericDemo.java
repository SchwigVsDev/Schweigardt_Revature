package com.java;

public class GenericDemo {
public static void main(String[] args) {
	A obj= new A();
	Integer i=obj.<Integer>print(3);
	Integer i1=obj.print(3);
//	String i2= obj.print(45);
	String str=obj.print("apple");
}
}
//extends & super : wildcard characters: restrict the scope
class A{

<T> T print(T obj){
	return obj;
}

void add(Object o){
System.out.println("adding "+o);
}
}
