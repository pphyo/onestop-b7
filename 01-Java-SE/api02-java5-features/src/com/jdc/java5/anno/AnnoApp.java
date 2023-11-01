package com.jdc.java5.anno;

@MyAnnotation(value = true, data = 2)
public class AnnoApp {
	
	@MyAnnotation(data = 1, value = false)
	private String data;

}
