package demo_05;

import java.util.*;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Employee implements Comparable<Employee> {
	private String name;
	private int id;
	private String company;
	private float salary;

	@Override
	public int compareTo(Employee obj) {
		if (obj.getSalary() > this.salary) {
			return 1;
		}
		if (obj.getSalary() < this.salary) {
			return -1;
		}
		return this.getName().toUpperCase().compareTo(obj.getName().toUpperCase());

	}
}
