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

	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

// mid class
class DomesticAnimal extends Animal {
	String owner;

	DomesticAnimal(String name, String owner) {
		super(name);
		this.owner = owner;
	}

	String getOwnerName() {
		return owner;
	}

	void play() {
		System.out.println(name + " is playing with " + owner + ".");
	}
}

// sub class
class Dog extends DomesticAnimal {

	Dog(String name, String owner) {
		super(name, owner);
	}

	void bark() {
		System.out.println(name + " is barking.");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Dog myDog = new Dog("Charlie", "Kartheek");

		myDog.eat();
		myDog.sleep();

		System.out.println("Owner: " + myDog.getOwnerName());

		myDog.bark();
		myDog.play();

		sc.close();
	}
}
