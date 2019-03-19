package com.java;

import java.util.*;
import java.util.function.Function;

public class InterfaceDemo {

	public static void main(String[] args) {

		Function obj1 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t * 2;
			}
		};

		System.out.printf("obj1.apply(2): %d", obj1.apply(2));

		P1 p1 = new P1() {

			@Override
			void m1() {
				System.out.println("m1");
			}

			@Override
			void m2() {
				System.out.println("m2");
			}

		};
	}
}

class MyFunction implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t * 2;
	}

}

abstract class P1 {
	abstract void m1();

	abstract void m2();

	void m3() {
	}
}