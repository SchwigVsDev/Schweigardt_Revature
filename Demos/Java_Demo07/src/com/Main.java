package com;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		NameComparator comparator = new NameComparator();
		IdComparator comparator2 = new IdComparator();
//		Set<A> list = new TreeSet<>(comparator2);
		Set<A> list = new HashSet<>();
		list.add(new A(1, "Steve"));
		list.add(new A(1, "Steve"));
		list.add(new A(2, "Steve"));
		list.add(new A(5, "Jerry"));

		for (A a : list) {
			System.out.println(a);
		}
	}

}

class A implements Comparable<A> {
	int id;
	String name;

	A(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(A o) {
		return this.id - o.id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "A( id = " + id + ", name = " + name + ", hashCode = " + hashCode() + ")";
	}
}

class NameComparator implements Comparator<A> {
	@Override
	public int compare(A o1, A o2) {
		if (o2.name.equals(o1.name)) {
			return o2.id - o1.id;
		}
		return o1.name.compareTo(o2.name);

	}
}

class IdComparator implements Comparator<A> {
	@Override
	public int compare(A o1, A o2) {
		return o1.id - o2.id;
	}
}
