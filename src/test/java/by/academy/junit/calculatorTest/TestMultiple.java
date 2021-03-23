package by.academy.junit.calculatorTest;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import by.academy.junit.Calculator;

@RunWith(Parameterized.class)
public class TestMultiple extends Assert {

	private int valueA;
	private int valueB;
	private int expected;

	public TestMultiple(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:MultipleOf({0}*{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays.asList(new Object[][] { { 1, 1, 1 }, { 2, 6, 12 }, { 10, 10, 100 }, { 5, 5, 25 }, { 0, 5, 0 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getMultiple(valueA, valueB));
	}
}
