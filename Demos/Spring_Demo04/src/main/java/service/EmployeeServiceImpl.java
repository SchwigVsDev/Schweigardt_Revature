package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dto.Employee;
import repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository req;

	@Override
	public List<Employee> getEmployees() {
		return req.getEmployees();
	}

	@Override
	public void deleteEmployee(int id) {
		req.deleteEmployee(id);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return req.getEmployeeById(id);
	}

	@Override
	public void insertEmployee(Employee e) {
		req.insertEmployee(e);
	}

	@Override
	public void updateEmployee(Employee e) {
		req.updateEmployee(e);
	}

}