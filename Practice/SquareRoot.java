import java.util.Scanner;
public class SquareRoot{
	public static void main(String[] args){
		double x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		x = scanner.nextDouble();
		y = Math.sqrt(x);
		System.out.println("Square Root of " + x + " is " + y);
	}
}
