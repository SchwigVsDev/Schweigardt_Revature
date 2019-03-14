package demo_05;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		Employee emp = new Employee("Dave", 4, "Revature", 55000);
		Employee emp1 = new Employee("Tina", 2, "Microsoft", 50000);
		Employee emp2 = new Employee("Zedd", 1, "Revature", 65000);
		Employee emp3 = new Employee("Steve", 5, "id Software", 50000);
		Employee emp4 = new Employee("Axton", 3, "Gearbox Software", 75000);
		Employee emp5 = new Employee("Aaron", 6, "Gearbox Software", 75000);

		employees.add(emp);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		// Total number of employees
		System.out.println("Total number employees: " + employees.size());

		System.out.println("-----");
		// Find employees with specific company name
		String companyToFind = "Revature";
		List<Employee> foundEmployees = new ArrayList<Employee>();
		System.out.println("Employees of: " + companyToFind);
		for (Employee e : employees) {
			if (e.getCompany() == companyToFind) {
				foundEmployees.add(e);
				System.out.println(e);
			}
		}

		System.out.println("-----");
		// Print out the names of the employees in alphabetical order or by order of
		// salary
		Collections.sort(employees);
		for (Employee e : employees) {
			System.out.println(e.getName());
		}
	}
}
