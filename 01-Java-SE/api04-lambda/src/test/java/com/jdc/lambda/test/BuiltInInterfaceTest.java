package com.jdc.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class BuiltInInterfaceTest {
	
	@Test
	@Order(3)
	@DisplayName("Test method for Predicate Interface")
	void test3() {
		Predicate<Integer> even = i -> i % 2 == 0;
		Predicate<String> pred = "hello"::equalsIgnoreCase;
		assertTrue(even.test(100));
		assertFalse(even.test(1));
		assertTrue(pred.test("Hello"));
		assertTrue(!pred.test("Arrow"));
	}
	
	@Test
	@Order(2)
	@DisplayName("Test method for Function Interface")
	void test2() {
		
		Function<String, Integer> strToInt = str -> Integer.valueOf(str);
		assertEquals(100, strToInt.apply("100"));
		assertThrows(NumberFormatException.class, () -> strToInt.apply("abc"));
		
		Function<Integer, Integer> square = a -> a * a;
		Function<Integer, Integer> twice = a -> a * 2;
		
		assertEquals(16, square.apply(4));
		assertEquals(20, twice.apply(10));
		
		int composeReuslt = square.compose(twice).compose(twice).apply(2);
		assertEquals(64, composeReuslt);
		
		int andThenResult = twice.andThen(twice).andThen(square).apply(3);
		assertEquals(144, andThenResult);
		
		int mix = twice.compose(square).andThen(square).apply(4);
		assertEquals(1024, mix);
	}

	@Test
	@Order(1)
	@DisplayName("Test method for Consumer Interface")
	void test1() {
		Consumer<String> strCon = a -> {throw new RuntimeException(a);};
		assertThrows(RuntimeException.class, () -> strCon.accept("Hello Consumer"));
		
		Consumer<Integer> intCon = i -> System.out.println(i * 2);
		intCon.accept(10);
		
		Consumer<String> con1 = a -> System.out.println("Con1: " + a);
		Consumer<String> con2 = a -> System.out.println("Con2: " + a);
		
		con1.andThen(con2).andThen(con1).accept("andThen");
	}

}