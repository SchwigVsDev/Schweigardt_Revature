package com.java;

import java.util.HashSet;
import java.util.Set;

//Does not allow duplicates: no insertion order maintained
public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> set= new HashSet<>();
		set.add("abcd");
		set.add("cdef");
		set.add("abcd");
		set.add("eghf");
		System.out.println(set);
		System.out.println(set.size());
	}
}
