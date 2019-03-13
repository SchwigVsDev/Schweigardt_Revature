package com_java;

public class Developer extends Employee {
	{
		this.setTitle("Developer");
	}

	public Developer() {
	}

	public Developer(String name) {
		super(name);
	}

	public Developer(String name, Manager manager) {
		super(name, manager);
	}
}
