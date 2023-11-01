package com.jdc.exept.test;

import java.util.Properties;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExceptionTest {
	
	@Test
	@Disabled
	@DisplayName("")
	void test_property() {
		Properties props = System.getProperties();
		props.list(System.out);
		
		System.out.println(System.getProperty("user.home"));
	}
	
//	@Test
	void test() {
		System.out.println("Before exception...");
		check(null);
		System.out.println("After exception...");
	}
	
	void check(String data) {
		System.out.println(data.charAt(0));
	}

}
