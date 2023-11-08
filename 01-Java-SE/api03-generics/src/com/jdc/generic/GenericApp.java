package com.jdc.generic;

public class GenericApp {
	
//	public <U> GenericApp(U t) { // Generic Constructor
//		
//	}
	
	static void genericType() {
		GenericBox<Integer> intBox = new GenericBox<>();
		intBox.setData(100);
		System.out.println(intBox.getData());
		
		var strBox = new GenericBox<String>();
		strBox.setData("Hello Generic");
		System.out.println(strBox.getData());
		
		// Raw type gets warning and should be parameterized
//		GenericBox rawBox = new GenericBox();
	}
	
	static void rawType() {
		var strBox = new Box();
		strBox.setData("Hello Generic");
//		int value = (Integer) strBox.getData(); // Class Cast Exception at runtime
		
		var intBox = new Box();
		intBox.setData(10);
	}

	public static void main(String[] args) {
		
		genericType();
		
	}

}
