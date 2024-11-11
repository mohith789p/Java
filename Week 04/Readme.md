# Exercise - 4

> ## a) Write a JAVA program to implement Single Inheritance.

## Code

```java
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

```

## Output

```text
Enter the name of your dog: charlie
Name: charlie
charlie is eating.
charlie is barking.
```

> ## b) Write a JAVA program to implement multi level Inheritance.

## Code

```java
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

```

## Output

```text
Charlie is eating.
Charlie is sleeping.
Owner: Kartheek
Charlie is barking.
Charlie is playing with Kartheek.
```

> ## c) Write a JAVA program for abstract class to find areas of different shapes.

## Code

```java
abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private final double PI = 3.14;
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return PI * radius * radius;
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(12.5, 25);
        Circle circ = new Circle(15);
        System.out.println("Area of Rectangle: " + rect.getArea());
        System.out.println("Area of Circle: " + circ.getArea());
    }
}

```

## Output

```text
Area of Rectangle: 312.5
Area of Circle: 706.5
```
