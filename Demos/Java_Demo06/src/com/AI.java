package com;

import java.util.*;

public class AI {
	List<Object> list = new ArrayList<Object>();

	public <T extends Object> void add(T obj) {
		list.add(obj);
	}

	public Object getLen(int index) {
		return list.get(index);
	}

	public <T extends Object> void addAll(List<T> list) {
		this.list.addAll(list);
	}

}
