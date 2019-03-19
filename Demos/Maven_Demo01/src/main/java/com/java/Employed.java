package com.java;

public class Employed extends Person {
	int id;
	String company;
	float salary;

	public Employed(String name, int age, String address, String company, float salary) {
		super(name, age, address);
		this.company = company;
		this.salary = salary;
	}
}
