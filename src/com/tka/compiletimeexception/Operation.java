package com.tka.compiletimeexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Operation {
	String str1 = "Myrub";
	String str2 = "Myrub1105";
	
	public void getString() {
		System.out.println(str1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(str2);
	}
	
	public void getFile() {
		try {
			FileInputStream fis = new FileInputStream("path");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("File not found exception");
		}
		
	}

}
