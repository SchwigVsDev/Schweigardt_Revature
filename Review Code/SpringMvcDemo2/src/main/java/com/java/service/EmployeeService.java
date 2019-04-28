package com.java.service;

import java.util.List;

import com.java.dto.Employee;

public interface EmployeeService {

	public List<Employee> getEmployees();
	/*public Employee getEmployeeById(int id);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);*/
	public void insertEmployee(Employee e);
}
