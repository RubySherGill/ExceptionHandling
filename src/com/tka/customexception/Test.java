package com.tka.customexception;

public class Test {
	public static void main(String[] args) {
		Operation operation = new Operation();
		String newString = null;
		try {
			newString = operation.getSubString(3,6 );
		} catch (StringNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(newString);

	}
}
