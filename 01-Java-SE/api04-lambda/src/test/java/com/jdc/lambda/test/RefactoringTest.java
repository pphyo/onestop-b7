package com.jdc.lambda.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Test;

import com.jdc.lambda.refactor.Apple;

public class RefactoringTest {
	
	@Test
	void test() {
		var list = Arrays.asList(new Apple("Red", 10),
				new Apple("Green", 7),
				new Apple("Yellow", 6),
				new Apple("Pink", 8),
				new Apple("Green", 9),
				new Apple("Red", 8));
		
		filter(list, a -> a.getWeight() > 8);
	}
	
	<T extends Apple> void filter(List<T> apples, Predicate<T> pred) {
		
		for(T p : apples) {
			if(pred.test(p)) {
				System.out.println(p);
			}
		}
		
	}

}