package com.java;

public class InterfaceDemo3 {

	public static void main(String[] args) {
		I3 i3 = (int a, int b) -> System.out.printf("%d + %d: %d", a, b, a + b);
		i3.add(1, 2);

		I4 i4 = a -> a % 2 != 0;
		System.out.printf("\nIs 5 and odd number?: %b", i4.isOdd(5));

		I5 i5 = a -> a * a;
		System.out.printf("\n3 squared is: %d", i5.square(3));

		I6 i6 = (int a, int b, int c) -> {
			if (a > b && a > c) {
				return a;
			} else if (b > a && b > c) {
				return b;
			} else {
				return c;
			}
		};

		System.out.printf("\nThe largest number of {200, 100, 150}: ", i6.findLargest(200, 100, 150));

	}

}

interface I3 {
	void add(int a, int b);
}

interface I4 {
	boolean isOdd(int a);
}

interface I5 {
	int square(int a);
}

interface I6 {
	int findLargest(int a, int b, int c);
}