package com.tka.customexception;

public class Operation {
	String str = "Myrub1105";
	public String getSubString(int beginIndex, int endIndex) {
		String subString = null;
		try {
			 subString = str.substring(beginIndex,endIndex);
		} catch (StringIndexOutOfBoundsException e) {
			throw new StringNotFoundException("String is not found, check your start and end index");
		}
		return subString;
	}

}
