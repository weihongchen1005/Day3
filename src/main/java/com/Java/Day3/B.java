package com.Java.Day3;

public class B extends A {

	private String lName;

	B(String name, String lName) {
		super(name);
		this.lName = lName;
	}

	void sayLName() {
		System.out.println("My last name is " + lName);
	}
}
