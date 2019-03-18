package com.java.day5;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {
public static void main(String[] args) {
	Employee e1= new Employee(1,"Payal");
	Employee e2= new Employee(2,"Payal");
	Employee e3= new Employee(3,"Puja");
	Employee e4= new Employee(1,"Payal");
	
	Address o1= new Address(10, "W. Nedderman");
	Address o2= new Address(10, "W. Nedderman");
	Address o3= new Address(40, "W. Nedderman");
	Address o4= new Address(10, "W. Nedderman");
	
	Map<Employee, Address> map= new HashMap<>();
	map.put(e1, o1);
	map.put(e2, o2);
	map.put(e3, o3);
	map.put(e4, o4);
}
}
