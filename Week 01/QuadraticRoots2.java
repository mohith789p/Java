import java.util.Scanner;

public class QuadraticRoots2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // equation is in form ax2 + bx = 0
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        // if both are zeros then it has infinetly many solutions.
        if (a == 0 && b == 0) {
            System.out.println("The equation is 0 = 0 which has infinitely many solutions.");
        } else if (a == 0) {
            // When a is zero, the equation becomes bx = 0 => x = 0
            System.out.println("The root of the equation is x = 0");
        } else {
            // ( x = 0 ) or ( ax - b = 0 )
            double root1 = 0; // Root when x = 0
            double root2 = -b / a; // Root when ax + b = 0

            System.out.println("The roots of the equation are:");
            System.out.println("x = " + root1);
            System.out.println("x = " + root2);
        }

        // Close the scanner
        scanner.close();
    }
}
