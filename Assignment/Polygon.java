class Rectangle {
    double length;
    double width;

    void resizeRectangle(Rectangle rect, double newLength, double newWidth) {
        rect.length = newLength;
        rect.width = newWidth;
    }

    void displayDimensions() {
        System.out.println("Length: " + length + " Width: " + width);
    }
}

public class Polygon {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.length = 5;
        rect.width = 3;
        System.out.print("Original Dimensions: ");
        rect.displayDimensions();
        rect.resizeRectangle(rect, 10, 6);
        System.out.print("Resized Dimensions: ");
        rect.displayDimensions();

    }
}