package com.Java.Day3;
/*Display the message below
 * Hello I am a bike, I am a cycle with an engine. 
 * My ancestor is a cycle who is a vehicle with pedals. 
 * */

class InheritenceExample {
	public static void main(String[] args) {
		Bike M = new Bike();
		M.define_me();

		// Exercise 2: Dog
		Dog dog = new Dog("White");
		dog.walk();
		dog.eat();
		dog.bark();
		System.out.println(dog.getFurColor());
		dog.makeNoise("Dorthy");

		// Exercise 3:
		A a = new A("Alpha");
		B b = new B("Beta", "Chen");
		a.myName();
		b.myName();
		b.sayLName();
	}
}
