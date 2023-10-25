package com.jdc.java5;

import static java.lang.System.out;

public class MainApp {

	public static void main(String... args) {
		
		showVarArg(0, "Isabela", "Bale", "Downey", "Chang");
		
		out.println("Hello Static Import!");

	}
	
	// zero or more
	static void showVarArg(int i, String... params) {
//		Arrays.stream(params).forEach(out::println);
		for(String s : params) {
			out.println(s);
		}
	}
	
	@SuppressWarnings("all")
	void autoBoxUnbox() {
		int priInt = 10;
		Integer wrapInt = new Integer(20);
		
		// Auto UnBoxing
		priInt = wrapInt;
		
		// Auto Boxing
		wrapInt = priInt;
		
		double priDou = 50;
		Double wrapDou = 60d;
		
		priDou = priInt;
		
		wrapDou = wrapInt.doubleValue();
		
		priDou = wrapInt;
		
		wrapDou = Double.valueOf(priInt);
	}

}





