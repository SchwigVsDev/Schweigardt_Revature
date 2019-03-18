package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class ArrayListDemo {
public static void main(String[] args) {
	Employee e1= new Employee(1, "Payal", "Revature", 3653633f);
	Employee e2= new Employee(2, "Payal", "Revature", 67637643f);
	Employee e3= new Employee(3, "Ritu", "Revature", 7637362f);
	Employee e4= new Employee(4, "Kanika", "Amdocs", 6478467f);
	Employee e5= new Employee(5, "Shweta", "Rjt", 4643764f);
	Employee e6= new Employee(1, "Payal", "Revature", 3653633f);
	List<Employee> list= new ArrayList<>();
	list.add(e1); 
	list.add(e2);
	list.add(e3); 
	list.add(e4);
	list.add(e5);
//	list.add(e6);

	//Code to find employee with highest salary
	Employee temp=list.get(0);
	for(Employee e: list) {
		if(e.getSalary()>temp.getSalary()) {
			temp= e;
		}
	}
	System.out.println(temp);
	
	//Total number of employees
	System.out.println(list.size());
	
	//Code to find employee with company Revature
		for(Employee e: list) {
			if(e.getCompanyName().equals("Revature")) {
				System.out.println(e);
			}
		}
		
		//To sort it on the basis of ascending order of company name
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new MyComparator());
		
		
	
}
}

@AllArgsConstructor
@Getter
@Setter
@ToString
class Employee implements Comparable<Employee>{
	private int id;
	private String name, companyName;
	private float salary;
	//Modify this to sort employees in the descending order of the salary
	//If salary is same, return it in the ascending order of name
	@Override
	public int compareTo(Employee o) {
		//return this.name.compareTo(o.getName());
		return o.salary>this.salary?1:o.salary<this.salary?-1: 
			name.equals(o.getName())?id-o.getId():name.compareTo(o.getName());
	}
	
}

class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getCompanyName().equals(o2.getCompanyName())?
						o1.getId()-o2.getId():o1.getCompanyName().compareTo(o2.getCompanyName());
	}
//	/Collections.sort(list, new MyComparator());
}