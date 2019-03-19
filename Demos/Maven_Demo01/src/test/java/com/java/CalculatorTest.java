package com.java;

import org.junit.*;
import org.junit.Assert;

public class CalculatorTest {

	@Test
	public void testAddMax() {
		int sum = Calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE);

		Assert.assertEquals(2 * Integer.MAX_VALUE, sum);
	}

	@Test
	public void testAddMin() {
		int sum = Calculator.add(Integer.MIN_VALUE, Integer.MIN_VALUE);

		Assert.assertEquals(2 * Integer.MIN_VALUE, sum);
	}

	@Test
	public void testAddZero() {
		int sum = Calculator.add(0, 0);

		Assert.assertEquals(0, sum);
	}

	@Test
	public void testAddPosZero() {
		int sum = Calculator.add(32, 0);

		Assert.assertEquals(32, sum);
	}

	@Test
	public void testAddZeroPos() {
		int sum = Calculator.add(0, 32);

		Assert.assertEquals(32, sum);
	}

	@Test
	public void testAddNegative() {
		int sum = Calculator.add(-32, -32);

		Assert.assertEquals(-64, sum);
	}
}
