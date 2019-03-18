package com.java.day5;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "apple");
		map.put(2, "guava");
		map.put(1, "orange");
		System.out.println(map.size());
		
		System.out.println(map);
	}
}
