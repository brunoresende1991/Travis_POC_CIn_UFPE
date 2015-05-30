package tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculator.Calculator;
import calculator.CalculatorView;
import calculator.IntegerCalculator;

public class CalculatorTests {
	
	private Calculator cal;

	@Before
	public void setUp() throws Exception {
		this.cal = new Calculator(new CalculatorView());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertTrue(cal.getCurrentResult() == 0);
		cal.add(50);
		assertTrue(cal.getCurrentResult() == 50);
		cal.add(50);
		assertTrue(cal.getCurrentResult() == 100);
	}

	@Test
	public void testSub() {
		assertTrue(cal.getCurrentResult() == 0);
		cal.sub(50);
		assertTrue(cal.getCurrentResult() == -50);
		cal.sub(50);
		//There is an intencional bug onto this test
		assertTrue(cal.getCurrentResult() == 100);
	}

	@Test
	public void testMult() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		this.cal = new Calculator(new CalculatorView(),10.0);
		assertTrue(cal.getCurrentResult() == 10);
		cal.div(50);
		assertTrue(cal.getCurrentResult() == 0.2);
		cal.div(0);
		assertTrue(cal.getCurrentResult() == Double.POSITIVE_INFINITY);
	}
	
	@Test
	public void testIntegerDiv() {
		this.cal = new Calculator(new CalculatorView(),10.0);
		assertTrue(cal.getCurrentResult() == 10);
		cal.integerDiv(10);
		System.out.println(cal.getCurrentResult());
		cal.integerDiv(0);
		assertTrue(cal.getCurrentResult().isInfinite());
	}

}
