package com.jdc.stream.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;

public class OptionalTest {
	
	@Test
	void test() {
		String str = "Get your freedom**";
//		String noStr = null;
		
		var result = Optional.ofNullable(str);
		
		result.ifPresentOrElse(System.out::println, () -> System.out.println("Another Action"));
		
//		System.out.println(result.orElseThrow(() -> new RuntimeException("error occured")));
	}

}











