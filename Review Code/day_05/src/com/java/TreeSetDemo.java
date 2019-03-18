package com.java;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//Set -> SortedSet extends Set -> TreeSet implements SortedSet
//Does not allow duplicates: Set : TreeSet, HashSet, LinkedHashSet
//TreeSet: SortedSet
public class TreeSetDemo {
	public static void main(String[] args) {
//compareTo: 0 : Comparable/ Comparator
		Set<Integer> set= new TreeSet<>();
		set.add(12);
		set.add(34);
		set.add(12);
		set.add(65);
		System.out.println(set); //12 34 65
		System.out.println(set.size()); //3
		A2 obj= new A2(1);
		Set<A2> set1= new TreeSet<>(new MyComparator1());
		set1.add(obj);
		
		A2[] arr= new A2[3];//Arrays.sort(arr, new MyComparator1());
	}
}
class A2 implements Comparable<A2>{
	int id;
	A2(int id){this.id= id;}
	@Override
	public int compareTo(A2 o) {
		return this.id-o.id;
	}
}

class MyComparator1 implements Comparator<A2>{

	@Override
	public int compare(A2 o1, A2 o2) {
		return o1.id- o2.id;
	}
	
}