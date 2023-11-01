package com.jdc.java5.enm;

public class AfterEnum {
	
	public static void main(String[] args) {
		Course[] courses = Course.values();
		
		for(Course c : courses) {
			System.out.println("%s : %d".formatted(c.getCourseName(), c.getFees()));
		}
//		System.out.println(Course.valueOf("Onestop"));
	}

}