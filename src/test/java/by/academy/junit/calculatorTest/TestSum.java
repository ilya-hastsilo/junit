package by.academy.junit.calculatorTest;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(Parameterized.class)

public class TestSum extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestSum(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:sumOf({0}+{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 2 }, { 2, 6, 8 }, { 18, 2, 20 }, { 13, 15, 28 }, { 1, 5, 6 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getSum(valueA, valueB));
	}
}