package com.jdc.except;

public class MultipleHandler {
	
	public static void main(String[] args) {
		
	}
	
	public void check() {
		
		try {
			
		} catch(ArithmeticException | NullPointerException  e) {
			
		}
		
		try {
			
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException Occured.");
		} catch(NullPointerException e) {
			System.out.println("NullPointerException Occured.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occured.");
		}
		
	}

}




