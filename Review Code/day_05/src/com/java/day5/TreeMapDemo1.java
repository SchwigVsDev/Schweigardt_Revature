package com.java.day5;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import lombok.AllArgsConstructor;

public class TreeMapDemo1 {
	public static void main(String[] args) {
		Employee e1= new Employee(1,"Payal");
		Employee e2= new Employee(2,"Payal");
		Employee e3= new Employee(3,"Puja");
		Employee e4= new Employee(1,"Payal");
		
		Address o1= new Address(10, "W. Nedderman");
		Address o2= new Address(10, "W. Nedderman");
		Address o3= new Address(40, "W. Nedderman");
		Address o4= new Address(10, "W. Nedderman");
		
		Map<Employee, Address> map= new TreeMap<>();
		map.put(e1, o1);
		map.put(e2, o2);
		map.put(e3, o3);
		map.put(e4, o4);
		
		Set<Entry<Employee, Address>> entries=map.entrySet();
		Iterator<Entry<Employee, Address>> it=entries.iterator();
		while(it.hasNext()) {
			Entry<Employee, Address> entry=	it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		//	map.remove(entry.getKey());//error: fail-fast
			it.remove();
		}
	}
}
@AllArgsConstructor
class Employee implements Comparable<Employee> {
	int id;
	String name;
	@Override
	public int compareTo(Employee o) {
		return id-o.id;
	}

	@Override
	public int hashCode() {
		//return name.hashCode();
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
		Employee e1= (Employee) obj;
		return id== e1.id;
		}else {
			return false;
		}
//Objects which are equal should have the same hashcode value		
	}
}
@AllArgsConstructor
class Address {
	int hNo;
	String street;

}