package com.java;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;

public class HashSetDemo1 {
public static void main(String[] args) {
	Set<Manager> set= new HashSet<>();//16
	set.add(new Manager("Akash", 121));
	set.add(new Manager("Akash", 121));
	set.add(new Manager("Ravi", 123));
	set.add(new Manager("Akash", 221));
	System.out.println(set.size());//3
	
}
}
@AllArgsConstructor
class Manager{
	String name;
	int id;
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Manager o= (Manager) obj;
		return this.id==o.id;
	}
}