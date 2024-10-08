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
