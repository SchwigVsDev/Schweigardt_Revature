package class_demo;

public class Main {
	public static void main(String[] args) {
		Person test = new Person();
		test.Print();
		Person tim = new Person("Tim", 25, true, 'M', 45000.00f, true);
		tim.Print();
		Person jane = new Person("Jane", 33, true, 'f', 55000.00f, false);
		jane.Print();
		Person xeno = new Person("Xeno", 209, false, 'X', 60000.00f, true);
		xeno.Print();
	}
}
