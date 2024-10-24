import java.util.Scanner;

public class QuadraticRoots2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // equation is ax2 + bx = 0
        System.out.print("Enter the coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient b: ");
        double b = sc.nextDouble();

        // Discriminant D = b*b - 4ac (here c = 0)
        double D = b * b;

        // Checking the nature of the roots
        if (D > 0) {
            // ax2 + bx = 0 => ( x = 0) or (ax + b = 0)
            double root1 = -b / a;
            double root2 = 0;
            System.out.println("Roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (D == 0) {
            // repeated root
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            // This case will not happen as D = b^2 (which is always >= 0)
            System.out.println("Error: Discriminant should not be negative.");
        }

        sc.close();
    }
}