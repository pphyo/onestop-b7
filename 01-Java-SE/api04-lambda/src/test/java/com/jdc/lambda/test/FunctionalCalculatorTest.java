package com.jdc.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jdc.lambda.calculator.FunctionalCalculator;
import com.jdc.lambda.calculator.FunctionalCalculator.Operator;

public class FunctionalCalculatorTest {
	
	@Test
	void test() {
		var calculator = new FunctionalCalculator();
		
		var addition = calculator.calculate(10, 20, Operator.ADDITION);
		assertEquals(30.0, addition);
		
		var takeAway = calculator.calculate(50.9, 20.5, Operator.TAKE_AWAY);
		assertEquals(30.4, takeAway);
		
		var multiply = calculator.calculate(21, 2, Operator.MULTIPLY);
		assertEquals(42.0, multiply);
	}

}











