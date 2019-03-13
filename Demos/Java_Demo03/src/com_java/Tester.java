package com_java;

public class Tester extends Employee {
	{
		this.setTitle("Tester");
	}

	public Tester() {

	}

	public Tester(String name) {
		super(name);
	}

	public Tester(String name, Manager manager) {
		super(name, manager);
	}
}
