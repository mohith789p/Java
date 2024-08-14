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
