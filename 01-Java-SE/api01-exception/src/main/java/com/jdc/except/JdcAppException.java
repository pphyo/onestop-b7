package com.jdc.except;

@SuppressWarnings("serial")
public class JdcAppException extends RuntimeException {
	
	public JdcAppException(String message) {
		super(message);
	}
	
	public JdcAppException(String message, Throwable cause) {
		super(message, cause);
	}

}
