package com.jdc.java5.enm;

public enum Course {
	JavaSE("Java SE", 300_000),
	JavaEE("Jakarta EE", 400_000),
	Spring("Spring Framework", 450_000),
	Flutter("Flutter Framework", 400_000);
	
	private String courseName;
	private int fees;
	
	private Course(String courseName, int fees) {
		this.courseName = courseName;
		this.fees = fees;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getFees() {
		return fees;
	}

}







