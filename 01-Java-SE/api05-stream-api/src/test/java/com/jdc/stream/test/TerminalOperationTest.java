package com.jdc.stream.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TerminalOperationTest {
	
	@ParameterizedTest
	@MethodSource("getStringList")
	void test6(List<String> list) {
		var result = list.stream()
						 .collect(Collectors.joining("-"));
		
		System.out.println(result);
	}
	
	@ParameterizedTest
	@MethodSource("getStringList")
	@DisplayName("Test for other terminal operation")
	@Disabled
	void test5(List<String> list) {
		var matchResult = list.stream().anyMatch(s -> s.length() < 2);
		System.out.println(matchResult);
		
		var findResult = list.parallelStream()
							 .filter(s -> s.length() > 8)
							 .findAny();
		System.out.println(findResult);
//		list.parallelStream().forEachOrdered(System.out::println);
	}
	
	static Stream<Arguments> getStringList() {
		return Stream.of(
			Arguments.of(
				List.of("Rivers of Babylon", "Perfect", "Flower",
						"Locked Away", "Whats Lover Do", "Migente",
						"Calm Down", "Shake it off", "Unity")
			)
		);
	}
	
	@ParameterizedTest
	@MethodSource("getOrderIntList")
	@DisplayName("Test for reduce")
	@Disabled
	void test4(List<Integer> list) {
		var optInt = list.stream()
						 .reduce((a, b) -> a - b);
		System.out.println(optInt);
	}

	@ParameterizedTest
	@MethodSource({"getUnorderIntList", "getOrderIntList"})
	@DisplayName("Test for takeWhile and dropWhile")
	@Disabled
	void test3(List<Integer> list) {
		list.stream()
			.takeWhile(i -> i % 2 != 0)
			.forEach(i -> System.out.print(i + " "));
	}
	
	static Stream<Arguments> getOrderIntList() {
		return Stream.of(
			Arguments.of(
				List.of(1, 2, 3, 4, 5)
			)
		);
	}
	
	static Stream<Arguments> getUnorderIntList() {
		return Stream.of(
			Arguments.of(
				List.of(1, 3, 5, 7, 9, 10, 2, 8, 4, 6)
			)
		);
	}
	
	@ParameterizedTest
	@MethodSource("getListOfListString")
	@DisplayName("Test for flatMap")
	@Disabled
	void test2(List<List<String>> list) {
		list.stream()
			.flatMap(l -> l.stream())
			.forEach(System.out::println);
	}
	
	static Stream<Arguments> getListOfListString() {
		return Stream.of(
			Arguments.of(
				List.of(
					List.of("Taylor", "Yankee", "Bony M"),
					List.of("Bee Gees", "Carpenter", "Preley"),
					List.of("Iron Maden", "Ed Sharen", "Adam Levine")
				)
			)
		);
	}
	
	@ParameterizedTest
	@MethodSource({"getListOne", "getListTwo"})
	@Disabled
	void test1(List<Integer> listOne) {
		System.out.println(listOne);
	}
	
	static Stream<Arguments> getListOne() {
		return Stream.of(
			Arguments.of(
				List.of(1, 2, 3, 4, 5)
			)
		);
	}
	
	static Stream<Arguments> getListTwo() {
		return Stream.of(
			Arguments.of(
				List.of(6, 7, 8, 9, 10)
			)
		);
	}

}