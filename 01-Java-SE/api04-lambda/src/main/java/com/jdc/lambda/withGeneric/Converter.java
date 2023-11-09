package com.jdc.lambda.withGeneric;

public interface Converter<T, R> {
	
	R convert(T t);

}
