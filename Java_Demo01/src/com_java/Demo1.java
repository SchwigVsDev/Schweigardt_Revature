package com_java;

public class Demo1 {

	public static void main(String[] args) {

		Developer tim = new Developer("Tim");
		Developer tina = new Developer("Tina");
		Developer jerry = new Developer("Jerry");
		Tester carry = new Tester("Carry");
		Tester joe = new Tester("Joe");
		Tester larry = new Tester("Larry");

		Employee[] team = { tim, tina, jerry, carry, joe, larry };

		Project project = new Project();
		project.setProject("Death Laser");

		Manager dave = new Manager("Dave", project);
		for (int i = 0; i < team.length; i++) {
			team[i].setManager(dave);
		}
		
		System.out.print(dave);
		System.out.print(tim);

	}

}
