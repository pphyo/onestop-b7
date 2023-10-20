package com.jdc.solid.srp;

public class SrpApp {

	public static void main(String[] args) {
		
//		var square = new Square(4);
		var circle = new Circle(3);
		
		var cal = new CalculateArea();
		System.out.println("Area: " + cal.calculate(circle));

	}

}
