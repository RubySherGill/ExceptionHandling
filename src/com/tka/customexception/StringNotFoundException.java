package com.tka.customexception;

public class StringNotFoundException extends RuntimeException {
	public StringNotFoundException(String msg) {
		super(msg);
	}

}
