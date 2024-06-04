package com.tka.runtimeexception;

public class Test {

	public static void main(String[] args) {
		Operation operation = new Operation();
		String newSubStr =operation.getSubString(5, 9);
		System.out.println("SubString is : " + newSubStr);
	}
}