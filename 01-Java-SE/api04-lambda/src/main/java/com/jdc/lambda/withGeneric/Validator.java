package com.jdc.lambda.withGeneric;

public interface Validator<T> {
	
	boolean validate(T t);

}
