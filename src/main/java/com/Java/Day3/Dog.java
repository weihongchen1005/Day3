package com.Java.Day3;

class Dog extends Animal {

	Dog(String furColor) {
		super(furColor);
	}

	void eat() {
		System.out.println("I am eating");
	}

	void bark() {
		System.out.println("I am barking");
	}

	void makeNoise(String dogName) {
		System.out.println("Hi, my name is " + dogName);
	}
}
