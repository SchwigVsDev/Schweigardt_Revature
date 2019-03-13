package assignment_01;

public class Person extends Object {
	private String firstName;
	private String lastName;
	private String fullName;
	private long[] phoneNumbers = new long[1];
	private char gender;

	// Getter/Setters
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

	public char getGender() {
		return gender;
	}

	public void setFirstName(String newFirst) {
		this.firstName = newFirst;
	}

	public void setLasstName(String newLast) {
		this.lastName = newLast;
	}

	public void setGender(char newGender) {
		this.gender = newGender;
	}

	public Person() {
		this.firstName = "John";
		this.lastName = "Doe";
		this.fullName = getFullName(firstName, lastName);
		this.gender = 'M';
	}

	public Person(String firstName, String lastName, char gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = getFullName(firstName, lastName);
		this.gender = gender;
	}

	// Methods
	public String toString() {
		String str = "\nName: " + fullName + "\nGender: " + gender + "\nPhone Number(s): " + phoneNumbers[0];
		if (phoneNumbers.length > 1) {
			for (int i = 1; i < this.phoneNumbers.length; i++) {
				str+="\n" + this.phoneNumbers[i];
			}
		}
		return str;
	}

	public void addPhoneNumber(long newPhoneNumber) {
		if (this.phoneNumbers[0] != 0) {
			long[] temp = this.phoneNumbers;
			this.phoneNumbers = new long[this.phoneNumbers.length + 1];
			for (int i = 0; i < temp.length; i++) {
				this.phoneNumbers[i] = temp[i];
			}
		}
		this.phoneNumbers[this.phoneNumbers.length - 1] = newPhoneNumber;
	}

	public String getFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public void calculateAge() {
	}

}
