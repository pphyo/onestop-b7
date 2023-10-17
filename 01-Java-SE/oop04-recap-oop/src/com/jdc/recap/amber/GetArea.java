package com.jdc.recap.amber;

public sealed interface GetArea permits PairNode, TriNode {
	
	int getArea();

}
