package by.academy.junit.calculatorTest;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(Parameterized.class)
public class TestDivide extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestDivide(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:divideOf({0}-{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays
				.asList(new Object[][] { { 1, 1, 0 }, { 6, 2, 4 }, { 18, 2, 16 }, { 10, 20, -10 }, { 0, 14, -14 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getDivide(valueA, valueB));
	}
}