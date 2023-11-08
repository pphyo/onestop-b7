package com.jdc.lambda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.jdc.lambda.Addition;
import com.jdc.lambda.Calculable;
import com.jdc.lambda.CanDisplay;
import com.jdc.lambda.CanGreet;

@TestMethodOrder(OrderAnnotation.class)
public class LambdaTest {
	
	@Order(4)
	@Test
	void test4() {
		String text = "Hello Lambda from CanGreet";
		CanDisplay dis = a -> System.out.println(a);
		dis.display("Hello Lambda form CanDisplay");
		
		CanGreet gre = () -> text;
		System.out.println(gre.greet());

	}
	
	@Order(3)
	@ParameterizedTest
	@CsvSource({
		"4, 5, 20",
		"10, 10, 100",
		"20, 30, 600"
	})
	void test3(int a, int b, int expected) {
		Calculable times = (x, y) -> x * y;
		assertEquals(expected, times.calculate(a, b));
	}
	
	@Order(2)
	@ParameterizedTest
	@CsvSource({
		"50, 30, 20",
		"11, 40, -29",
		"30, 22, 8"
	})
	void test2(int a, int b, int expected) {
		Calculable takeAway = new Calculable() {	
			@Override
			public int calculate(int a, int b) {
				return a - b;
			}
		};
		assertEquals(expected, takeAway.calculate(a, b));
	}
	
	@Order(1)
	@ParameterizedTest
	@CsvSource({
		"1, 2, 3",
		"10, 20, 30",
		"21, 60, 81"
	})
	void test1(int a, int b, int expected) {
		Calculable add = new Addition();
		int result = add.calculate(a, b);
		
		assertEquals(expected, result);
	}

}
