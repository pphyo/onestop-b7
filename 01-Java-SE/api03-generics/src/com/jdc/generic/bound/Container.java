package com.jdc.generic.bound;

public class Container<T> {
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	public <U extends Number> void inspect(U u) {
		System.out.println("T: " + data.getClass());
		System.out.println("U: " + u.getClass());
	}

}










