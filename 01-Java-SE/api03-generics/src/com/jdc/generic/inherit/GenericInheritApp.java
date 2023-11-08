package com.jdc.generic.inherit;

public class GenericInheritApp {

	static <T> T pick(T t1, T t2) {
		return t2;
	}

	public static void main(String[] args) {
		
//		var s = pick("a", new ArrayList<Integer>());
		
		var box = new InheritBox<Number>();
		box.add(Integer.valueOf(10));
		box.add(Double.valueOf(10.0));
		
	}
	
}
