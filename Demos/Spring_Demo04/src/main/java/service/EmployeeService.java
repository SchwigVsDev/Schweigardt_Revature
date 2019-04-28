package service;

import java.util.List;

import dto.Employee;


public interface EmployeeService {
    public List<Employee> getEmployees();

    public Employee getEmployeeById(int id);

    public void updateEmployee(Employee e);

    public void deleteEmployee(int id);

    public void insertEmployee(Employee e);
}