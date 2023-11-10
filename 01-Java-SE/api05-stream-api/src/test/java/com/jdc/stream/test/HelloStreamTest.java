package com.jdc.stream.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.stream.Item;

public class HelloStreamTest {
	
	@ParameterizedTest
	@MethodSource("getStringList")
	void test4(List<String> list) {
		var result = list.stream()
						 .map(s -> Integer.valueOf(s))
						 .sorted((a, b) -> b - a)
						 .limit(list.size() / 2)
						 .mapToInt(i -> i)
						 .sum();
		
		System.out.println(result);
	}
	
	static Stream<Arguments> getStringList() {
		return Stream.of(
					Arguments.of(
						List.of("112", "20", "53", "67",
								"49", "69", "22", "41",
								"30", "51", "80", "76",
								"209", "54", "19", "3")
					)
				);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {
			"""
			Pwint Phyu	300	TRUE	Fried Peanut
			Burn	1000	TRUE	Small
			Sir Edward	30000	FALSE	Smoky
			Red Label	60000	TRUE
			Pizza	25000	FALSE	medium
			Bulgogi Burgur	6000	TRUE
			Potato Chip	3500	TRUE
			Coca Cola	1200	FALSE
			Fried Chicken	12000	TRUE	Half Piece
			Fried Chicken	23000	TRUE	Full Piece"""

	})
	void test3(String raw) {
		var list = raw.lines().map(line -> {
					var item = new Item();
					String[] arr = line.split("\t");
					item.setName(arr[0]);
					item.setPrice(Double.parseDouble(arr[1]));
					item.setStock(Boolean.valueOf(arr[2]));
					item.setDescription(arr.length == 4 ? arr[3] : "NA");
					return item;
				}).filter(item -> item.getPrice() > 20000).toList();
		
		System.out.println(list);
	}
	
	@Test
	void test2() {
		
		var list = Arrays.asList("Remy", "Abe", "Harper", "Brown",
					"Connie", "Kaboom");
		
		list.stream()
			.filter(s -> s.length() >= 5)
			.sorted()
			.limit(3)
			.skip(1)
			.forEach(System.out::println);
		
	}
	
	@Test
	void test1() {
		int[] intArr = {100, 20, 66, 94, 31, 7, 18, 38};
		var intArrStream = Arrays.stream(intArr); // stream creation
		
		long count = intArrStream.filter(i -> i > 50).count();
		
		assertEquals(3, count);
		
//		intArrStream.forEach(System.out::println);
	}
	

}
