package com_java;

public class Employee extends Object {
	private Address adr;
	private Manager manager;
	private Project project;
	private long phoneNumber;
	private String name;
	private String title;
	private int employeeNum;

	public Address getAddress() {
		return this.adr;
	}

	public Manager getManager() {
		return this.manager;
	}

	public Project getProject() {
		return this.project;
	}

	public long getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getTitle() {
		return this.title;
	}

	public int getEmployeeNum() {
		return this.employeeNum;
	}

	public void setAddress(String newAdr) {
		this.adr.setAddress(newAdr);
	}

	public void setManager(Manager manager) {
		this.manager = manager;
		this.manager.addTeamMember(this);
		this.project = this.manager.getProject();
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setPhoneNumber(long newNumber) {
		this.phoneNumber = newNumber;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setEmployeeNum(int num) {
		this.employeeNum = num;
	}

	public Employee() {
		this.name = "N/A";
		this.title = "N/A";
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, Project project) {
		this.name = name;
		this.setProject(project);
	}

	public Employee(String name, Manager manager) {
		this.name = name;
		this.setManager(manager);
	}

	public Employee(String name, Manager manager, Project project) {
		this.name = name;
		this.setProject(project);
		this.setManager(manager);
	}

	public String toString() {
		String str = "\n-----\nName: " + this.name + "\nEmployee Number: " + this.employeeNum + "\nTitle: "
				+ this.title;
		if (this.title != "Manager") {
			str += "\nManager: " + this.manager.getName();
		}

		str += "\nProject: " + this.project + "\nPhone: " + this.phoneNumber + "\nAddress: " + this.adr;
		return str;
	}

}
