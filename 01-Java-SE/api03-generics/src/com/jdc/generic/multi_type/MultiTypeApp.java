package com.jdc.generic.multi_type;

import com.jdc.generic.GenericBox;

public class MultiTypeApp {
	
	static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue() == p2.getValue();
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		var genericBox = new GenericBox<Integer>();
		genericBox.setData(300);
		
		Pair<Integer, GenericBox<Integer>> boxPair = new OrderPair<>(3, genericBox);
		System.out.println(boxPair.getKey());
		System.out.println(boxPair.getValue().getData());
		
		Pair<String, String> odp1 = new OrderPair<>(new String("Myanmar"), "Yangon");
		Pair<String, String> odp2 = new OrderPair<>("Myanmar", "Yangon");
		Pair<String, Integer> odp3 = new OrderPair<>("Apple", 500);
		
		System.out.println(compare(odp1, odp2));
//		System.out.println(MultiTypeApp.<String, String>compare(odp1, odp2)); // Same to above
		
		Pair<Integer, Integer> otp1 = new OtherPair<>(1, 100);
		Pair<Integer, String> otp2 = new OtherPair<>(2, "Two Hundred");
		
	}

}
