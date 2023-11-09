package com.jdc.lambda.calculator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionalCalculator {
	
	public double calculate(double a, double b, Operator ope) {
		Function<Operator, BiFunction<Double, Double, Double>> func = this::calculate;
		return func.apply(ope).apply(a, b);
	}
	
	private BiFunction<Double, Double, Double> calculate(Operator ope) {
		return switch(ope) {
			case ADDITION -> (a , b) -> a + b;
			case TAKE_AWAY -> (a, b) -> a - b;
			case MULTIPLY -> (a, b) -> a * b;
			case DIVISION -> (a, b) -> a / b;
			default -> throw new RuntimeException("Wrong Operator!");
		};
	}

	public enum Operator {
		ADDITION, TAKE_AWAY, MULTIPLY, DIVISION 
	}
	
}
