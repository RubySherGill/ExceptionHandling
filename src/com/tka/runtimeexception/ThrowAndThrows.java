package com.tka.runtimeexception;

public class ThrowAndThrows {
	String str = "Myrub1105";
	public String getSubString(int beginIndex, int endIndex) {
		String subString = null;
		try {
			 subString = str.substring(beginIndex,endIndex);
		} catch (StringIndexOutOfBoundsException e) {
			throw new StringIndexOutOfBoundsException();
		}
		return subString;
	}

}
