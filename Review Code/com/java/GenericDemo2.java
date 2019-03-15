package com.java;

import java.util.ArrayList;
import java.util.List;
//Non veg : veg+ non veg
public class GenericDemo2 {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	list.add(24);
	//list.add("apple"); //compile time error
	printList(list);
	list.add(35);
	int i= list.get(1);//runtime error : ClassCastException
	System.out.println(i);
}
//Advantages: Compile time check, saves u from type casting, promotes reusability
private static void printList(List list) {
	list.add("apple");
	System.out.println(list);
}
}
