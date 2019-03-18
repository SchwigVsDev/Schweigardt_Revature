package com.java;

import java.util.ArrayList;
import java.util.List;

public class QuestionGeneric {
	public static void main(String[] args) {
		A1 obj= new A1();
		List<Student> list= new ArrayList<>();
		//obj.addAll(list);
	}
}

class A1{

	List<Object> list = new ArrayList<>();

	//Producer extends Consumer super
	
	 void addAll(List<? super Person> list) {//can be used for adding elements
		this.list.addAll(list);
		list.add(new  Person());
	}

}

//Person: subclass 