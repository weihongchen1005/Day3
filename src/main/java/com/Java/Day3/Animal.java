package com.Java.Day3;

class Animal {
	private String furColor;

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

	Animal(String furColor) {
		this.furColor = furColor;
	}

	void walk() {
		System.out.println("I am walking");
	}

	void makeNoise() {
		System.out.println("Hi");
	}

}
