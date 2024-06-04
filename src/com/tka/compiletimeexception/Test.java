package com.tka.compiletimeexception;

public class Test {
	public static void main(String[] args) {
		Operation operation = new Operation();
		operation.getString();
		
		try {
			operation.getFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
