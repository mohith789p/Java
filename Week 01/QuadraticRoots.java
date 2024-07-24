/* Program to find quadratic root */
import java.util.Scanner;

public class QuadraticRoots {
    
    public static void main(String[] args){ 
        
        Scanner scanner = new Scanner(System.in);
        
        double a,b,c;
        // ax2 + bx + c is a equation
        
        System.out.print("Enter the Co-efficients: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        scanner.close();
        
        double delta = (Math.pow(b,2) - 4*a*c);

        double root1,root2;
        if(delta > 0){
            root1 = (-b + Math.sqrt(delta))/ (2*a);
            root2 = (-b - Math.sqrt(delta))/ (2*a);
            System.out.println("Roots are " + root1 + " " + root2);
        }
        else if (delta == 0){
            root1 = root2 = -b/ (2*a);
            System.out.println("Roots are equal and " + root2);
        }
        else{
            System.out.println("Roots are Imaginary.");
        }
    }
}
