package com.jdc.lambda.test;

import org.junit.jupiter.api.Test;

import com.jdc.lambda.withGeneric.Converter;
import com.jdc.lambda.withGeneric.Producer;
import com.jdc.lambda.withGeneric.Validator;

public class LambdaWithGenericTest {
	
	@Test
	void test() {
		Producer<String> strProd = a -> System.out.println(a);
		strProd.produce("Hello Producer");
		
		Producer<Integer> intProd = a -> System.out.println(a * a);
		intProd.produce(10);
		
		Validator<String> strVal = String::isBlank;
		System.out.println(strVal.validate(""));
		
		Converter<String, Boolean> converter = a -> Boolean.valueOf(a);
		System.out.println(converter.convert("1"));
	}

}











