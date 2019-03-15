package com.java;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
class MyMain{
	public static void main(String[] args) {
	/*	Admission<Person> str= new Admission<>();
		str.enroll(new Student());
		str.enroll(new Teachers());
		Admission<Student> str1= new Admission<>();
		str1.enroll(new Student());*/
	//	str1.enroll(new Teachers());
	}
}
public class Admission<T extends  Person & Cloneable & Serializable > {

	
	void enroll(T obj) {
		
	}
}

 class Person{
	String name; int age; String address; long phoneNumber;
}
class Student extends Person{
	int sId;
	List<String> subjects= new ArrayList<>();
}
class Teachers extends Person{
	int tId;
	String subjectTaught;
	float salary;
}