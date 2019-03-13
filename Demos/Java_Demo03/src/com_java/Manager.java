package com_java;

public class Manager extends Employee {
	private Employee[] team;

	public Employee[] getTeam() {
		return this.team;
	}

	public void setTeam(Employee[] team) {
		this.team = team;
	}

	{
		this.setTitle("Manager");
	}

	public Manager() {

		this.team = new Employee[1];
	}

	public Manager(String name) {
		super(name);
		this.team = new Employee[1];
	}

	public Manager(String name, Project project) {
		super(name, project);
		this.team = new Employee[1];
	}

	public Manager(String name, Employee[] team) {
		super(name);
		this.setTeam(team);
	}

	public Manager(String name, Employee[] team, Project project) {
		super(name, project);
		this.setTeam(team);
	}

	public void addTeamMember(Employee mbr) {
		if (this.team[0] == null) {
			this.team = new Employee[1];
		}
		if (this.team[0] != null) {
			Employee[] temp = this.team;
			this.team = new Employee[this.team.length + 1];
			for (int i = 0; i < temp.length; i++) {
				this.team[i] = temp[i];
			}
		}
		this.team[this.team.length - 1] = mbr;
	}

	public String toString() {
		String str = super.toString() + "\nTeam: ";

		if (this.team[0] != null) {
			for (int i = 0; i < this.team.length; i++) {
				str += team[i].getName() + " ";
			}
		}

		return str;
	}
}
