package com.jdc.solid.srp;

public abstract class Shape {
	
	private double width;

	public Shape(double width) {
		super();
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

}
