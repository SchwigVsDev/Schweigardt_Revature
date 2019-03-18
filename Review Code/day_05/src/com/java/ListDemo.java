package com.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
public static void main(String[] args) {
	/*int[] arr= new int[4];
	arr[0]= 45.3f;*/ //compile time check 
	
	//Generics: compile time check 
	List<Float> list= new ArrayList<Float>(); //add any datatype [array of size10]
	list.add(45.3f);//index 0 list.remove(0); //list.size();
	list.add(32.5f);//index 1
	list.add(76.4f);//index 2
	list.add(76.4f);//index 3
	list.get(4);//ArrayIndexOutOfBoundsException
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(1));
	list.remove(Float.valueOf(45.3f));
	//remove is an overloaded : int index, Object o
	System.out.println(list.size());
	//List is index based:
	int no= list.size();
	for(int i=0; i<no; i++) {
		list.set(i, list.get(i)+1);
		list.remove(i);
	}
	//List iterator is a fail-fast iterator
	for(float i: list) {
		System.out.println(i);
		list.remove(0);//If we iterate over the list using a for-each loop or iterator;
		//and we also modify the list, it immediately throws a ConcurrentModificationException
	}
	
	Iterator<Float> it=list.iterator();
	int index=0;
	while(it.hasNext()) {
	Float f=	it.next();
	//list.set(index++, f+1);
	it.remove();//this will remove the current element whichever ur iterator is pointing to
	
	
	ListIterator<Float> li=list.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
		if(list.size()==1) {
			li.add(43f);
		}
	}
	
	while(li.hasPrevious()) {
	System.out.println(li.previous());	
	}
	
	}
	
	
	
	
	
	
	
	
	/*for(float e: list) {
		
	}*/
	
	System.out.println(list);
	
	
	
	List<Integer> list1= new ArrayList<Integer>();
	list1.add(1);
	list1.remove(Integer.valueOf(1));
	
	
}
}
