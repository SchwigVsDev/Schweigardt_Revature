package com.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Linked-List is also a list: 
//=> Preserve insertion order and also would be index based. Allow duplicates
public class LinkedListDemo {
	public static void main(String[] args) {
		
		List<Integer> aList= new ArrayList<>(20);//10
		aList.add(20);
		aList.add(44);
		aList.add(11);
		aList.add(1, 14);
		
		List<Integer> list= new LinkedList<>();
		list.add(20);
		list.add(44);
		list.add(11);
		list.add(1, 14);
	}
}
