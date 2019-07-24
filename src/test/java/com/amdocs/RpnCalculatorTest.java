package com.amdocs;

import static org.junit.Assert.*;

import org.junit.Test;

public class RpnCalculatorTest {

	@Test
	public void addition() {
		RpnSolve calculator=new RpnSolve();
		double actual=calculator.solve("3 3 +");
		double expected=6;
		assertEquals(expected,actual,0.001);
		
		double actual1=calculator.solve("3 2 + 9 6 - 14 7 / + -");
		double expected1=0;
		assertEquals(expected1,actual1,0.001);
		
	}

}
