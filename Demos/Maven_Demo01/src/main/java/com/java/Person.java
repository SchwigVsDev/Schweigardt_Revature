package com.java;

import lombok.*;

@Getter
@Setter
abstract public class Person {
	private String name;
	private int age;
	private String address;

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public static Person getInstance(boolean employed, String name, int age, String address) {
		if (employed) {
			return new Employed(name, age, address, "Revature", 65000.0f);
		}
		return new Unemployed(name, age, address);
	}

}
