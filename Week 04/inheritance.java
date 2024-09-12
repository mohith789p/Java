/* Program on single Inheritance */

import java.util.*;

// super class
class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name + " is eating.");
	}
}

// sub class
class Dog extends Animal {

	Dog(String name) {
		super(name);
	}

	void speak() {
		System.out.println(name + " is barking.");
	}
}

public class inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of your dog: ");
		String name = sc.next();
		Dog myDog = new Dog(name);
		System.out.println("Name: " + myDog.name);
		myDog.eat();
		myDog.speak();
		sc.close();
	}
}
