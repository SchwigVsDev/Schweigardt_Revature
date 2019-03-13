package assignment_01;
import java.lang.Math;
import java.util.Calendar;

public class PersonMain {

	public static void main(String[] args) {
		Person tim = new Person("Tim", "Drake", 'M');

		tim.addPhoneNumber(5550123);
		tim.addPhoneNumber(5550176);

		System.out.print(tim);

	}

}
