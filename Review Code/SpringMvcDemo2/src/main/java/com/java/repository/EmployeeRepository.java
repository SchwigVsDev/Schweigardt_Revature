package com.java.repository;

import java.util.List;

import com.java.dto.Employee;

public interface EmployeeRepository {

	public List<Employee> getEmployees();
	/*public Employee getEmployeeById(int id);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);*/
	public void insertEmployee(Employee e);
}
