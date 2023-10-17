package com.jdc.recap.amber;

public sealed class PairNode extends Node implements GetArea permits Square, Rectangle {

	@Override
	public int getArea() {
		return 0;
	}
	
}
