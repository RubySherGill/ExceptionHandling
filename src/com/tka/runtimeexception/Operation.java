package com.tka.runtimeexception;

public class Operation {
	String str = "Myrub1105";

	public String getSubString(int beginIndex, int endIndex) {

		String str1 = null;
		try {
			str1 = str.substring(beginIndex, endIndex);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Index issue");
		}
		return str1;
	}
}
