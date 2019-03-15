package com;

import java.util.*;
import java.util.Map.Entry;

import lombok.AllArgsConstructor;
import lombok.ToString;

public class TreeMapDemo {

	public static void main(String[] args) {
		/*
		 * Map<Integer, String> map = new TreeMap<>(); map.put(1, "Output"); map.put(3,
		 * "Meatbags"); map.put(2, "Helo");
		 * 
		 * Collection<String> strings = map.values(); for (String s : strings) {
		 * System.out.print(s + " "); } System.out.println(); Set<Entry<Integer,
		 * String>> entries = map.entrySet(); for (Entry<Integer, String> e : entries) {
		 * System.out.print(e + " "); }
		 */

		Map<Employee, Address> map = new TreeMap<>();
		map.put(new Employee(1, "Dave"), new Address(12, "Cooper St"));
		map.put(new Employee(12, "Steve"), new Address(22, "Cooper St"));
		map.put(new Employee(30, "Jerry"), new Address(16, "Cooper St"));
		map.put(new Employee(24, "Carl"), new Address(5, "Cooper St"));
		map.put(new Employee(5, "Aaron"), new Address(33, "Cooper St"));

		Set<Entry<Employee, Address>> employees = map.entrySet();
//		for (Entry<Employee, Address> e : employees) {
//			System.out.println(e + "\n----------");
//		}
		
		Iterator<Entry<Employee, Address>> i = employees.iterator();
		while(i.hasNext()) {
			Entry<Employee, Address> e = i.next();
			System.out.println("---------");
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}

@AllArgsConstructor
@ToString
class Employee implements Comparable<Employee> {
	int id;
	String name;

	@Override
	public int compareTo(Employee o) {
		return id - o.id;
	}
}

@AllArgsConstructor
@ToString
class Address {
	int number;
	String street;
}
