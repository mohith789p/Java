# Exercise - 3

> ## a) Write a JAVA program to implement class mechanism. Create a class, methods and invoke them inside main method.

## Code

```java
class CalculateArea {
    int area(int length, int breadth) {
        return length * breadth;
    }

    double perimeter(double length, double breadth) {
        return 2 * (length + breadth);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        CalculateArea rectangle = new CalculateArea();
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter(4, 8));
        System.out.println("Area of Rectangle: " + rectangle.area(5, 10));
    }
}

```

## Output

```text
Perimeter of Rectangle: 24.0
Area of Rectangle: 50
```

> ## b) Write a JAVA program implement method overloading.

## Code

```java
class CalculateArea{
	int area(int length,int breadth){
		return length*breadth;
	}
	double area(double length,double breadth){
		return length*breadth;
	}
	int area(int side){
		return side*side;
	}
	double area(double side){
		return side*side;
	}
}

public class overload{
	public static void main(String[] args){
		CalculateArea square = new CalculateArea();
		CalculateArea rectangle = new CalculateArea();
		System.out.println("Area of Square: " + square.area(4));
		System.out.println("Area of Rectangle: " + rectangle.area(12,34));
		System.out.println("Area of Square: " + square.area(12.0));
		System.out.println("Area of Rectangle: " + rectangle.area(4.99, 3.79));
	}
}

```

## Output

```text
Area of Square: 16
Area of Rectangle: 408
Area of Square: 144.0
Area of Rectangle: 18.912100000000002
```

> ## c) Write a JAVA program to implement constructor.

## Code

```java
class Rectangle {
    double length;
    double breadth;

    Rectangle() {
        length = 5;
        breadth = 7.5;
    }

    void displaySides() {
        System.out.println("length: " + length + " breadth: " + breadth);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.displaySides();
    }

}

```

## Output

```text
length: 5.0 breadth: 7.5
```

> ## d) Write a JAVA program to implement constructor overloading.

## Code

```java
class Rectangle{
	double length;
	double breadth;
	Rectangle(){
		length = 5.0;
		breadth = 7.5;
	}
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	Rectangle(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void displaySides(){
		System.out.println("length: "+ length + " breadth: "+ breadth);
	}
}
public class ConstructorOverloading{
	public static void main(String[] args){
		Rectangle rect1 = new Rectangle();
		rect1.displaySides();
		Rectangle rect2 = new Rectangle(25,87);
		rect2.displaySides();
		Rectangle rect3 = new Rectangle(43.99,54.99);
		rect3.displaySides();

	}

}

```

## Output

```text
length: 5.0 breadth: 7.5
length: 25.0 breadth: 87.0
length: 43.99 breadth: 54.99
```
