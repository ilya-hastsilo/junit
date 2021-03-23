package by.academy.junit.calculatorTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class MathTest2 extends Assert {

	@Test
	public void testSqrt() {
		assertTrue(Math.sqrt(1) == 1);
		assertTrue(Math.sqrt(4) == 2);
		assertTrue(Math.sqrt(9) == 3);
	}
}