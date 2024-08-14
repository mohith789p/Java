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
