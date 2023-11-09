package com.jdc.lambda.mr;

public class LambdaUtil {

	public static void doStatic(int num) {
		System.out.println("Static: " + (num * 2));
	}
	
	public void doInstance(int num) {
		System.out.println("Instance: " + (num * 2));
	}
	
}
