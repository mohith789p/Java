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
