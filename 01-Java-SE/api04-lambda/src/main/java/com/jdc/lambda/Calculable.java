package com.jdc.lambda;

@FunctionalInterface
public interface Calculable {
	
	int calculate(int a, int b);
	
	@Override
	boolean equals(Object obj);
	
	int hashCode();
	
	String toString();

}
