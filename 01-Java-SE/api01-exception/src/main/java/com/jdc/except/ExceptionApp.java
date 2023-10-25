package com.jdc.except;

public class ExceptionApp {

	public static void main(String[] args) {
		System.out.println("Program start...");
		
		try {
			System.out.println(new int[] {1, 2, 3}[3]);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Terminated...");

	}
	
	void run() {
		var cc = new CanClone();
		try {
			cc.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}










