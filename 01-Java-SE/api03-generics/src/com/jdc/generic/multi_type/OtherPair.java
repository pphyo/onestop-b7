package com.jdc.generic.multi_type;

public class OtherPair<V> implements Pair<Integer, V> {
	
	private Integer key;
	private V value;

	public OtherPair(Integer key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	@Override
	public Integer getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}

}
