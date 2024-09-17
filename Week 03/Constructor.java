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
