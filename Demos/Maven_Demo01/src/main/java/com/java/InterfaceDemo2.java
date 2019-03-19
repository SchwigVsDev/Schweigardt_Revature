package com.java;

public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I2 i = new I2() {

			@Override
			public void s1() {
				System.out.println("s1");
			}
		};

		i.s1();

		I2 obj = () -> {
			System.out.println("s1");
		};

		obj.s1();

		// if method is only one line, not {}s needed
		I2 obj2 = () -> System.out.println("s1");

		obj2.s1();
	}

}

@FunctionalInterface
interface I2 {
	void s1();
}
