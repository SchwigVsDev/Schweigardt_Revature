package class_demo;

public class Person {
	String name;
	int age;
	boolean hasPassport;
	char gender;
	float salary;
	boolean isWorking;

	public Person() {
		this.name = "TEST";
		this.age = 00;
		this.hasPassport = false;
		this.gender = '?';
		this.salary = 0.00f;
		this.isWorking = false;
	}

	public Person(String name, int age, boolean hasPassport, char gender, float salary, boolean isWorking) {
		this.name = name;
		this.age = age;
		this.hasPassport = hasPassport;

		if (gender == 'M' || gender == 'm') {
			this.gender = 'M';
		} else if (gender == 'F' || gender == 'f') {
			this.gender = 'F';
		} else {
			this.gender = '?';
		}

		this.salary = salary;
		this.isWorking = isWorking;
	}

	public void Print() {
		String msg = "Name: " + name + "\nAge: " + age + "\nHas passport: " + hasPassport + "\nGender: " + gender;

		if (isWorking) {
			msg += "\nSalary: $" + salary + " / yr" + "\nIs working.\n------\n";
		} else {
			msg += "\nSalary: $" + salary + " / yr" + "\nIs not working.\n------\n";
		}

		System.out.print(msg);
	}
}
