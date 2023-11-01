package com.jdc.generic;

// Generic class
// T is a Type Parameter
public class GenericBox<T> {
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
