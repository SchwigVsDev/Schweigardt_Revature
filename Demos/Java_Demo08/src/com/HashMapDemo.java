package com;

import java.util.*;
import java.util.Map.Entry;
import lombok.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(2, "grape");
		map.put(3, "orange");

		System.out.println(map.size());
		System.out.println(map);

		Map<HashEmployee, HashAddress> map2 = new HashMap<>();

		map2.put(new HashEmployee(), new HashAddress(12, "1st Street"));
		map2.put(new HashEmployee("Carl"), new HashAddress(32, "1st Street"));
		map2.put(new HashEmployee("Sarah"), new HashAddress(2, "1st Street"));
		map2.put(new HashEmployee("Larry"), new HashAddress(52, "1st Street"));
		map2.put(new HashEmployee("June"), new HashAddress(75, "1st Street"));

		Set<Entry<HashEmployee, HashAddress>> employees = map2.entrySet();

		Iterator<Entry<HashEmployee, HashAddress>> i = employees.iterator();
		while (i.hasNext()) {
			Entry<HashEmployee, HashAddress> e = i.next();
			System.out.println("---------");
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}

@ToString
@Getter
@Setter
class HashEmployee implements Comparable<HashEmployee> {
	private int id;
	private String name;

	public HashEmployee() {
		this.id = this.generateIdNumber();
		this.name = "Jim";
	}

	public HashEmployee(String name) {
		this.id = this.generateIdNumber();
		this.name = name;
	}

	@Override
	public int compareTo(HashEmployee o) {
		return id - o.id;
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
		HashEmployee other = (HashEmployee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private int generateIdNumber() {
		String s = "";
		for (int i = 0; i < 6; i++) {
			s += new Random().nextInt((10 - 1) + 1);
		}
		return Integer.parseInt(s);
	}
}

@AllArgsConstructor
@ToString
class HashAddress {
	int number;
	String street;
}

class HashComparator implements Comparator<HashEmployee> {
	@Override
	public int compare(HashEmployee o1, HashEmployee o2) {
		if (o2.getName().equals(o1.getName())) {
			return o2.getId() - o1.getId();
		}
		return o1.getName().compareTo(o2.getName());

	}
}
