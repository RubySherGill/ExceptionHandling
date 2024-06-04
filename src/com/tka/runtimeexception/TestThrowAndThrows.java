package com.tka.runtimeexception;

public class TestThrowAndThrows {

	public static void main(String[] args) {
		ThrowAndThrows throwAndThrows = new ThrowAndThrows();
		String newString = null;
		try {
			newString = throwAndThrows.getSubString(5, 9);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index issue");
		}
		System.out.println(newString);

	}

}
