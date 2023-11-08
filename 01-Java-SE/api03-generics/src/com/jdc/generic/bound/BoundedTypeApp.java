package com.jdc.generic.bound;

import java.math.BigDecimal;

public class BoundedTypeApp {

	public static void main(String[] args) {
		Container<Integer> intContainer = new Container<>();
		intContainer.setData(100);
		intContainer.inspect(new BigDecimal(0.1));
		
	}

}
