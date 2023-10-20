package com.jdc.solid.srp;

public class CalculateArea {
	
	public double calculate(Shape shape) {
		if(shape instanceof Circle circle)
			return calculateCircleArea(circle);
		else
			return calculateSquareArea((Square)shape);
	}
//	violate srp
//	public void sumOfShapes(Shape[] shapes) {
//		
//	}
//	
	private double calculateSquareArea(Square square) {
		return Math.pow(square.getWidth(), 2);
	}
	
	private double calculateCircleArea(Circle circle) {
		return Math.PI * (Math.pow(circle.getWidth(), 2));
	}

}
