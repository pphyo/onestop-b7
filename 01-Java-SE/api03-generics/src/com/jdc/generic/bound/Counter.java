package com.jdc.generic.bound;

class Data implements Comparable<Data> {

	private String strValue;
	private int intValue;

	public String getStrValue() {
		return strValue;
	}

	public int getIntValue() {
		return intValue;
	}

	public void setStrValue(String strValue) {
		this.strValue = strValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	@Override
	public int compareTo(Data o) {
		return o.strValue.compareTo(strValue);
	}

}

public class Counter {

	public static void main(String[] args) {

		Integer[] array = { -1, 2, -10, 10, 0, 3 };

		System.out.println(countGreaterThan(array, 0));
		
		var d1 = new Data();
		d1.setIntValue(-10);
		d1.setStrValue("Z");
		
		var d2 = new Data();
		d2.setIntValue(-9);
		d2.setStrValue("P");
		
		var d3 = new Data();
		d3.setIntValue(100);
		d3.setStrValue("W");
		
		var d4 = new Data();
		d4.setIntValue(-100);
		d4.setStrValue("D");
		
		Data[] dataArray = {d1, d2, d3, d4};
		
		var comData = new Data();
		comData.setIntValue(0);
		comData.setStrValue("I");
		
		System.out.println(countGreaterThan(dataArray, comData));

	}

	public static <T extends Comparable<T>> int countGreaterThan(T[] array, T ele) {
		int count = 0;

		for (T t : array) {
			if (t.compareTo(ele) > 0)
				++count;
		}

		return count;
	}

}
