package com.jdc.except;

public class CanClone {
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void greet() throws Exception, CloneNotSupportedException, StackOverflowError {
		
	}

}
