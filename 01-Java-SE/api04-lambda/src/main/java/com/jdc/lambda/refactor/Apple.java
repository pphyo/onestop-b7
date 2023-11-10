package com.jdc.lambda.refactor;

public class Apple {

	private String color;
	private int weight;

	public Apple(String color, int weight) {
		super();
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return "Color: %s | Weight: %d%n".formatted(color, weight);
	}

}