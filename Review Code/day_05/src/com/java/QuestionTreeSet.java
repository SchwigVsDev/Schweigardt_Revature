package com.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class QuestionTreeSet {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Payal", "Revature", 3653633f);
		Employee e2 = new Employee(2, "Payal", "Revature", 67637643f);
		Employee e3 = new Employee(3, "Ritu", "Revature", 7637362f);
		Employee e4 = new Employee(4, "Kanika", "Amdocs", 6478467f);
		Employee e5 = new Employee(5, "Shweta", "Rjt", 4643764f);
		Employee e6 = new Employee(6, "Payal", "Revature", 3653633f);

		Set<Employee> set = new TreeSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		System.out.println(set.size());
		System.out.println(set);
	}
}

class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getName().equals(o2.getName())) {
			return o1.getId() - o2.getId();
		} else {
			return o1.getName().compareTo(o2.getName());
		}
	}

}