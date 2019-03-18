package com.java.day5;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	//Map is an interface in java
	//java.util
	//It does not extend Collection interface
	//Key-Value pair
	//Key should be unique. Can have one null key. Key cannot be duplicate
	//Can have multiple null values
	
	Map<Integer, String> map= new TreeMap<>();
	map.put(1, "Apple");
	map.put(2, "orange");
	map.get(2);//orange
	map.put(2 , "guava");
	map.get(2);//guava
	System.out.println(map.size()); //2
	
	Collection<String> values=map.values();
	for(String s: values) {
		System.out.println(s);
	}
	
	
	Set<Integer> set=map.keySet();
	for(Integer i: set) {
		System.out.println(i);
	}
	
	Set<Entry<Integer, String>> entries=map.entrySet();
	for(Entry entry: entries) {
		System.out.println(entry.getKey() + ":"+ entry.getValue());
	}
	
	//Employee: Address { Map}
}
}
